
public class KonsolenVideospiel extends AbstractVideospiel {

	public KonsolenVideospiel(String titel, String kommentar, String system) {
		super(titel, kommentar, system);
		_leihgebuehrIntervall = 3;
		_leihgebuehrZahleNurVolleIntervalle = true;
		_leihgebuehrTaeglich = 700;
	}
	
	public int getPreisNachTagen(int mietTage)
	{
		mietTage /= _leihgebuehrIntervall;
			
		return _leihgebuehrTaeglich * mietTage;
	}

}
