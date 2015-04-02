/**
 * Diese Klasse verfügt über alle benötigten Informationen zu einem Kunden.
 * Jeder Kunde hat mindestens einen Vornamen, einen Nachnamen und eine
 * Kundennummer.
 * 
 * @author SE2-Team
 * @version SoSe 2015
 */
class Kunde
{
    // Zustandsfelder für Kundendaten
    private Kundennummer _kundennummer;
    private String _nachname;
    private PLZ _plz;
    private String _strasse;
    private String _telefonnummer;
    private String _vorname;
    private String _wohnort;

    /**
     * Konstruktor für einen Kunden.
     * 
     * @param kundennummer Eine Kundennummer.
     * @param vorname Ein Vorname des Kunden.
     * @param nachname Ein Nachname des Kunden.
     * 
     * @require kundennummer != null
     * @require vorname != null
     * @require nachname != null
     * 
     * @ensure getKundennummer() == kundennummer
     * @ensure getVorname() == vorname
     * @ensure getNachname() == nachname
     */
    public Kunde(Kundennummer kundennummer, String vorname, String nachname)
    {
        assert kundennummer != null : "Vorbedingung verletzt: kundennummer != null";
        assert vorname != null : "Vorbedingung verletzt: vorname != null";
        assert nachname != null : "Vorbedingung verletzt: nachname != null";

        _vorname = vorname;
        _nachname = nachname;
        _kundennummer = kundennummer;

    }

    /**
     * Gibt die Kundenummer zurück.
     * 
     * @ensure result != null
     */
    public Kundennummer getKundennummer()
    {
        return _kundennummer;
    }

    /**
     * Gibt den Nachnamen zurück.
     * 
     * @return Den Nachnamen.
     * 
     * @ensure result != null
     */
    public String getNachname()
    {
        return _nachname;
    }

    /**
     * Gibt die Postleitzahl zurück.
     * 
     * @return Die Postleitzahl, kann null sein.
     */
    public PLZ getPLZ()
    {
        return _plz;
    }

    /**
     * Gibt die Straße in der der Kunde wohn zurück.
     * 
     * @return Die Straße, kann null sein.
     */
    public String getStrasse()
    {
        return _strasse;
    }

    /**
     * Gibt die Telefonnummer des Kunden zurück.
     * 
     * @return Die Telefonnummer, liefert "unbekannt" wenn die Telefonnummer
     *         unbekannt ist.
     * 
     * @ensure result != null
     */
    public String getTelefonnummer()
    {
        String ergebnisText = _telefonnummer;
        if (ergebnisText == null)
        {
            ergebnisText = "unbekannt";
        }
        return ergebnisText;
    }

    /**
     * Gibt den Vornamen zurück.
     * 
     * @return Den Vornamen.
     * 
     * @ensure result != null
     */
    public String getVorname()
    {
        return _vorname;
    }

    /**
     * Gibt den Wohnort zurück.
     * 
     * @return Den Wohnort.
     */
    public String getWohnort()
    {
        return _wohnort;
    }

    /**
     * Setzt eine neue Postleitzahl.
     * 
     * @param plz Die zu setzende Postleitzahl, darf null sein.
     */
    public void setPLZ(PLZ plz)
    {
        _plz = plz;
    }

    /**
     * Setzt eine neue Straße.
     * 
     * @param strasse Die zu setzende Straße, darf null sein.
     */
    public void setStrasse(String strasse)
    {
        _strasse = strasse;
    }

    /**
     * Setzt eine neue Telefonnummer
     * 
     * @param telefonnummer Die zu setzende Telefonnummer, darf null sein.
     */
    public void setTelefonnummer(String telefonnummer)
    {
        _telefonnummer = telefonnummer;
    }

    /**
     * Setzt einen neuen Wohnort
     * 
     * @param wohnort Der zu setzende Wohnort, darf null sein.
     */
    public void setWohnort(String wohnort)
    {
        _wohnort = wohnort;
    }

}
