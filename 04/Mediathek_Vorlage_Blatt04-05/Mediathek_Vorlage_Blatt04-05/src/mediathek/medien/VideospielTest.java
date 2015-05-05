package mediathek.medien;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//
//import org.junit.Before;
//import org.junit.Test;
//
///**
// */
//public class VideospielTest
//{
//    private static final String KOMMENTAR = "Kommentar";
//    private static final String TITEL = "Titel";
//    private static final String BEZEICHNUNG = "Videospiel";
//    private static final String SYSTEM = "System";
//    private AbstractVideospiel _videoSpiel;
//
//    @Before
//    public void setUp()
//    {
//        _videoSpiel = getMedium();
//    }
//
//    @Test
//    public void testeKonstruktoren()
//    {
//        assertEquals(TITEL, _videoSpiel.getTitel());
//        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
//        assertEquals(SYSTEM, _videoSpiel.getSystem());
//    }
//
//    @Test
//    public void testGetMedienBezeichnung()
//    {
//        String videospielBezeichnung = BEZEICHNUNG;
//        assertEquals(videospielBezeichnung, _videoSpiel.getMedienBezeichnung());
//    }
//
//    protected AbstractVideospiel getMedium()
//    {
//        return new AbstractVideospiel(TITEL, KOMMENTAR, SYSTEM);
//    }
//
//    @Test
//    public void testVideospielMietgebuehr()
//    {
//    	assertEquals(_videoSpiel.berechneMietgebuehr(0), new Geldbetrag(200));
//    	assertEquals(_videoSpiel.berechneMietgebuehr(5), new Geldbetrag(200));
//    	//assertFalse(_videoSpiel.berechneMietgebuehr(-3).equals(new Geldbetrag(200)));
//    }
//    
//    @Test
//    public final void testSetKommentar()
//    {
//        AbstractVideospiel medium = getMedium();
//        medium.setKommentar("Kommentar2");
//        assertEquals(medium.getKommentar(), "Kommentar2");
//    }
//
//    @Test
//    public final void testSetTitel()
//    {
//        AbstractVideospiel medium = getMedium();
//        medium.setTitel("Titel2");
//        assertEquals(medium.getTitel(), "Titel2");
//    }
//
//}
