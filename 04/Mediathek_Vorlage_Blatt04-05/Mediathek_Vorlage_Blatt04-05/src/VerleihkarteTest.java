import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VerleihkarteTest
{
    private Datum _datum;
    private Verleihkarte _karte;
    private Kunde _kunde;
    private Medium _medium;

    @Before
    public void setUp()
    {
        _kunde = new Kunde(new Kundennummer(123456), "ich", "du");

        _datum = Datum.heute();

        _medium = new CD("bar", "baz", "foo", 123);
        _karte = new Verleihkarte(_kunde, _medium, _datum);
    }

    @Test
    public void testegetFormatiertenString() throws Exception
    {
        assertNotNull(_karte.getFormatiertenString());
    }

    @Test
    public void testeKonstruktor() throws Exception
    {
        assertEquals(_kunde, _karte.getEntleiher());
        assertEquals(_medium, _karte.getMedium());
        assertEquals(_datum, _karte.getAusleihdatum());
    }

    @Test
    public void testgetMietgebuehr()
    {
        // TODO für Aufgabe 4.2.2: Die Kommentarzeichen für die folgenden
        // Anweisungen entfernen
        // Datum tag1 = Datum.heute().minus(1);
        // Verleihkarte karte = new Verleihkarte(_kunde, _medium, tag1);
        // assertEquals(new Geldbetrag(300 * 2), karte.getMietgebuehr());
        //
        // Datum tag2 = Datum.heute().minus(2);
        // karte = new Verleihkarte(_kunde, _medium, tag2);
        // assertEquals(new Geldbetrag(300 * 3), karte.getMietgebuehr());
        //
        // Datum tag3 = Datum.heute().minus(7);
        // karte = new Verleihkarte(_kunde, _medium, tag3);
        // assertEquals(new Geldbetrag(300 * 8), karte.getMietgebuehr());
    }

    @Test
    public void testgetAusleihdauer()
    {
        Datum datum = Datum.heute().minus(10);
        _karte = new Verleihkarte(_kunde, _medium, datum);
        assertEquals(11, _karte.getAusleihdauer());
    }

    @Test
    public void testEquals()
    {
        Verleihkarte karte1 = new Verleihkarte(_kunde, _medium, _datum);

        assertTrue(_karte.equals(karte1));
        assertEquals(_karte.hashCode(), karte1.hashCode());

        Kunde kunde2 = new Kunde(new Kundennummer(654321), "ich", "du");
        CD medium2 = new CD("hallo", "welt", "foo", 321);
        Datum datum2 = Datum.heute().minus(1);
        Verleihkarte karte2 = new Verleihkarte(kunde2, medium2, datum2);

        assertFalse(_karte.equals(karte2));
        assertNotSame(_karte.hashCode(), karte2.hashCode());

    }
}
