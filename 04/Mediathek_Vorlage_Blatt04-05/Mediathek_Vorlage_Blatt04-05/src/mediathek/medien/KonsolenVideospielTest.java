package mediathek.medien;
import static org.junit.Assert.assertEquals;
import mediathek.fachwerte.Geldbetrag;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class KonsolenVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private KonsolenVideospiel _videoSpiel;

    @Before
    public void setUp()
    {
        _videoSpiel = getMedium();
    }

    @Test
    public void testeKonstruktoren()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung, _videoSpiel.getMedienBezeichnung());
    }

    protected KonsolenVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testVideospielMietgebuehr()
    {
    	assertEquals(_videoSpiel.berechneMietgebuehr(3), new Geldbetrag(700+200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(0), new Geldbetrag(200));
    	assertEquals(_videoSpiel.berechneMietgebuehr(8), new Geldbetrag(200+ 700 * 2));
    	assertEquals(_videoSpiel.berechneMietgebuehr(9), new Geldbetrag(200+ 700 * 3));
    }
    
    @Test
    public final void testSetKommentar()
    {
        KonsolenVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        KonsolenVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }

}
