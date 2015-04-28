/**
 * {@link AbstractVideospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team
 * @version SoSe 2012
 */
abstract class AbstractVideospiel extends AbstractMedium {
	/**
	 * Das System, auf dem das Spiel lauffähig ist
	 */
	private String _system;
	

	
	/**
	 * Initialisiert ein neues Videospiel.
	 * 
	 * @param titel
	 *            Der Titel des Spiels
	 * @param kommentar
	 *            Ein Kommentar zum Spiel
	 * @param system
	 *            Die Bezeichnung des System
	 * 
	 * @require titel != null
	 * @require kommentar != null
	 * @require system != null
	 * 
	 * @ensure getTitel() == titel
	 * @ensure getKommentar() == kommentar
	 * @ensure getSystem() == system
	 */
	public AbstractVideospiel(String titel, String kommentar, String system) {
		super(titel, kommentar);
		assert system != null : "Vorbedingung verletzt: system != null";
		_system = system;
		_medienBezeichner = "Videospiel";
		
		_leihgebuehrTaeglich = 0;
		_leihgebuehrAufschlag =200;

	}
	
	abstract int getPreisNachTagen(int tage);

	/**
	 * Gibt das System zurück, auf dem das Spiel lauffähig ist.
	 * 
	 * @return Das System, auf dem das Spiel ausgeführt werden kann.
	 * 
	 * @ensure result != null
	 */
	public String getSystem() {
		return _system;
	}

	@Override
	public String getFormatiertenString() {
		return super.getFormatiertenString() +  "    " +"System: " +  _system + "\n";
	}
	
	@Override
	public Geldbetrag berechneMietgebuehr(int mietTage)
	{
		return new Geldbetrag(getPreisNachTagen(mietTage)+_leihgebuehrAufschlag);
	}
}
