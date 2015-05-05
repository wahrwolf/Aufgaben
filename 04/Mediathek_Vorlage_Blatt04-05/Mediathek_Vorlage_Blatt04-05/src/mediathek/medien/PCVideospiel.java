package mediathek.medien;



public class PCVideospiel extends AbstractVideospiel {

	public PCVideospiel(String titel, String kommentar, String system) {
		super(titel, kommentar, system);
		_leihgebuehrFreieTage = 7;
		_leihgebuehrIntervall = 5;
		_leihgebuehrZahleNurVolleIntervalle = false;
		_leihgebuehrTaeglich = 500;
	}

	public int getPreisNachTagen(int mietTage) {
		mietTage -= _leihgebuehrFreieTage;
		if (mietTage < 0)
			mietTage = 0;

		int puffer = mietTage / _leihgebuehrIntervall;
		if (mietTage % _leihgebuehrIntervall > 0) puffer++;
		mietTage = puffer;

		return _leihgebuehrTaeglich * mietTage;
	}

}
