import java.io.FileWriter;
import java.io.IOException;

// XXX 5.1.2
// neue Klasse erstellt
public class VerleihProtokollierer {
	private String _stdProtokollDatei;

	/**
	 * Erstellt einen Protokollierer der in die angegeben Datei schreibt
	 * 
	 * @param fileName
	 *            die Protokolldatei
	 * @param overrideLastProtokoll
	 *            gibt an ob das letzte Protokoll überschrieben werden soll0
	 * @require !fileName.isEmpty()
	 */
	public VerleihProtokollierer(String fileName, boolean overrideLastProtokoll) {
		assert !fileName.isEmpty() : "Vorbedinung verletzt! fileName ist leer";
		_stdProtokollDatei = fileName;
		schreibeInLog("", !overrideLastProtokoll); // <-- ! converts
													// overideLastProtocoll in
													// append

	}

	/**
	 * Erstellt ein neues Protokoll in [./protkoll.xml]
	 */
	public VerleihProtokollierer() {
		this("./protokoll.xml", false);
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
			Verleihkarte verleihkarte) {
		// assert ereignis.equals("ausleihe") ||
		// ereignis.equals("rueckgabe"):"Vorbediung verlezt! ereignis nicht erkannt";
		assert verleihkarte != null : "Vorbedinung verletzt!: verleihkarte == null";

		fuegeLogHinzu("<" + ereignis + ">\n" + verleihkarte + "</>\n");

	}

	/**
	 * Schreibt eine Nachricht in die Logdatei
	 * 
	 * @param text
	 *            die Lognachricht
	 * @param append
	 *            gibt an ob der Inhalt überschrieben werden soll
	 */
	private void schreibeInLog(String text, boolean append) {
		FileWriter fw;

		try {
			fw = new FileWriter(_stdProtokollDatei, append);
			fw.write(text);
			fw.close();
			System.out.println(text);
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	/**
	 * Fügt der Logdatei einen weiteren Eintrag hinzu
	 * 
	 * @param log
	 *            die Zu logende Nachricht
	 */
	private void fuegeLogHinzu(String log) {
		schreibeInLog(log, true);
	}

}
