import java.util.ArrayList;
import java.util.List;

/**
 * Ein Medienbestand enthält alle zur Verfügung stehenden Medien. Diese können
 * in den Bestand eingepflegt, gelöscht und verändert werden. Zu einem
 * bestimmten Titel kann es mehrere Medien-Objekte im Bestand geben. So kann
 * z.B. die gleiche CD mehrfach vorhanden sein.
 * 
 * @author SE2-Team
 * @version SoSe 2015
 */
class MedienbestandServiceImpl extends AbstractObservableService implements
        MedienbestandService
{

    /**
     * Eine Liste aller Medien
     */
    private List<Medium> _medienbestand;

    /**
     * Initialisiert einen neuen Medienbestand.
     * 
     * @param medien Der initiale Medienbestand.
     */
    public MedienbestandServiceImpl(List<Medium> medien)
    {
        _medienbestand = new ArrayList<Medium>(medien);
    }

    @Override
    public void entferneMedium(Medium medium)
    {
        assert enthaeltMedium(medium) : "Vorbedingung verletzt!"; 
        _medienbestand.remove(medium);

        informiereUeberAenderung();
    }

    @Override
    public boolean enthaeltMedium(Medium medium)
    {
        assert medium != null : "Vorbedingung verletzt!"; 
        return _medienbestand.contains(medium);
    }

    @Override
    public void fuegeMediumEin(Medium neuesMedium)
    {
        assert !enthaeltMedium(neuesMedium) : "Vorbedingung verletzt!"; 
        _medienbestand.add(neuesMedium);

        informiereUeberAenderung();
    }

    @Override
    public List<Medium> getMedien()
    {
        return new ArrayList<Medium>(_medienbestand);
    }

    @Override
    public void medienWurdenGeaendert()
    {
        informiereUeberAenderung();
    }

}
