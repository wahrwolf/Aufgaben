package mediathek.services;
import java.io.FileWriter;
import java.io.IOException;

import mediathek.materialien.Verleihkarte;

// XXX 5.1.2
// neue Klasse erstellt
public class VerleihProtokollierer { 
	private String _stdProtokollDatei;

	/**
	 * Erstellt einen Protokollierer der in die angegeben Datei schreibt
	 * 
	 * @param fileName
	 *            die Protokolldatei
	 * @require !fileName.isEmpty()
	 */
	public VerleihProtokollierer(String fileName) {
		assert !fileName.isEmpty() : "Vorbedinung verletzt! fileName ist leer";
		_stdProtokollDatei = fileName;

	}

	/**
	 * Erstellt ein neues Protokoll in [./protkoll.xml]
	 */
	public VerleihProtokollierer() {
		this("./protokoll.xml");
	}

	/**
	 * Protokolliert eine Aktion in einer Datei
	 * 
	 * @param ereignis
	 *            das Ereignis (ausleihe oder rueckgabe)
	 * @param verleihkarte
	 *            die zu dem ereignis gehörende Verleihkarte
	 * @require ereignis.equals("ausleihe") || ereignis.equals("rueckgabe") <-
	 *          not valid
	 * @require verleihkare != null
	 */
	public void protokolliere(VerleihEreignis ereignis,
			Verleihkarte verleihkarte) throws ProtokollierException{
		// assert ereignis.equals("ausleihe") ||
		// ereignis.equals("rueckgabe"):"Vorbediung verlezt! ereignis nicht erkannt";
		assert verleihkarte != null : "Vorbedinung verletzt!: verleihkarte == null";

		try {
			fuegeLogHinzu("<" + ereignis + ">\n" + verleihkarte + "</>\n");
		} catch (ProtokollierException e) {
			throw new ProtokollierException(e.getMessage());
		}

	}

	/**
	 * Schreibt eine Nachricht in die Logdatei
	 * 
	 * @param text
	 *            die Lognachricht
	 * @param append
	 *            gibt an ob der Inhalt überschrieben werden soll
	 */
	private void fuegeLogHinzu(String log) throws ProtokollierException{
		
		try (FileWriter fw = new FileWriter(_stdProtokollDatei, true)){
			fw.write(log);
		} catch (IOException e) {
			throw new ProtokollierException(e.getMessage());
		}
					
	}

}
