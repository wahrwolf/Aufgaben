public abstract class AbstractMedium implements Medium {

	// vererbbare Felder
	/**
	 * Ein Kommentar zum Medium
	 */
	protected String _kommentar;

	/**
	 * Der Titel des Mediums
	 * 
	 */
	protected String _titel;

	/**
	 * Der Typ des Mediums
	 */	
	protected String _medienBezeichner;

	/**
	 * Die tägliche Ausleihgebür
	 */
	protected int _leihgebuehrTaeglich = 300;
	
	/**
	 * Der feste Aufschlag
	 */
	protected int _leihgebuehrAufschlag = 0;
	
	/**
	 * Die Anzahl an freien Tagen
	 */
	protected int _leihgebuehrFreieTage = 0;
	
	/**
	 * Die Länge der Ausleihintervalle
	 */
	protected int _leihgebuehrIntervall = 1;
	
	
	protected boolean _leihgebuehrZahleNurVolleIntervalle = true;

	/**
	 * Initialisiert ein neues Medium mit den gegebenen Daten.
	 * 
	 * @param titel
	 *            Der Titel des Mediums.
	 * @param kommentar
	 *            Ein Kommentar zu dem Medium.
	 * 
	 * @require titel != null
	 * @require kommentar != null
	 * 
	 * @ensure getTitel() == titel
	 * @ensure getKommentar() == kommentar
	 */
	public AbstractMedium(String titel, String kommentar) {
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";

		_titel = titel;
		_kommentar = kommentar;
	}

	@Override
	public String getKommentar() {
		return _kommentar;
	}

	@Override
	public void setKommentar(String kommentar) {
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		_kommentar = kommentar;
	}

	@Override
	public String getMedienBezeichnung() {
		return _medienBezeichner;
	}

	@Override
	public String getTitel() {
		return _titel;
	}

	@Override
	public void setTitel(String titel) {
		assert titel != null : "Vorbedingung verletzt: titel != null";

		_titel = titel;
	}

	@Override
	public String toString() {
		return getFormatiertenString();
	}

	@Override
	public String getFormatiertenString() {
		return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
				+ "\n" + "    " + "Kommentar: " + _kommentar + "\n";
	}
	
	/**
	 * @param mietTage
	 * @require mietTage >= 0
	 * @ensure return != null
	 * @return den zu zahlenden Mietbetrag
	 */
	public Geldbetrag berechneMietgebuehr(int mietTage)
	{
		assert mietTage >= 0 : "Vorbedingung verletzt! MietTage < 0";
		
		mietTage -= _leihgebuehrFreieTage;
		if (mietTage < 0) mietTage = 0;
		if (_leihgebuehrZahleNurVolleIntervalle)
		{
			mietTage /= _leihgebuehrIntervall;
		}else{
			int puffer = mietTage/_leihgebuehrIntervall;
			if (mietTage % _leihgebuehrIntervall > 0) puffer ++;
			mietTage = puffer;
		}
		
		return new Geldbetrag(_leihgebuehrTaeglich * mietTage + _leihgebuehrAufschlag);
	}
	

}
