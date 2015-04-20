import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VideospielTest
{

    @Before
    public void setUp() throws Exception
    {
    }

    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String KONSOLE = "Waschmaschiene";
    private static final String STUDIO = "Jizz-Games";
    private Videospiel _Videospiel1;
    private Videospiel _Videospiel2;

    public VideospielTest()
    {
        _Videospiel1 = getMedium();
        _Videospiel2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String VideospielBezeichnung = BEZEICHNUNG;
        assertEquals(VideospielBezeichnung, _Videospiel1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _Videospiel1.getTitel());
        assertEquals(KOMMENTAR, _Videospiel1.getKommentar());
        assertEquals(KONSOLE, _Videospiel1.getKonsole());
        assertEquals(STUDIO, _Videospiel1.getStudio());
    }

    @Test
    /*
     * Von ein und der selben Videospiel kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare der gleichen Videospiel sind gleich",
                _Videospiel1.equals(_Videospiel2));
        assertTrue("Mehrere Exemplare der gleichen Videospiel sind ungleich",
                _Videospiel1.equals(_Videospiel1));
    }

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR,STUDIO, KONSOLE);
    }

}
