// XXX 5.1.8
public enum VerleihEreignis {
	AUSLEIHE("ausleihe"),
	RUECKGABE("rueckgab");

	private final String _description;
	
	private VerleihEreignis(String description) {
		_description = description;
	}
	@Override
	public String toString()
	{
		return _description;
	}
}
