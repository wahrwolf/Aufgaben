/**
 * Eine {@link DVD} ist ein Medium. Zusätzlich zu den Eigenschaften eines
 * {@link Medium}s erfasst sie Informationen zum Regisseur und zur Laufzeit.
 * 
 * @author SE2-Team
 * @version SoSe 2015
 * 
 */
class DVD implements Medium
{
    /**
     * Die Laufzeit des Hauptteils der DVD (in Minuten).
     */
    private int _laufzeit;

    /**
     * Der Regisseur des Inhalts der DVD.
     */
    private String _regisseur;

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;

    /**
     * Initialisiert eine neue DVD mit den gegebenen Daten.
     * 
     * @param titel Der Titel der DVD.
     * @param kommentar Ein Kommentar zu der DVD.
     * @param regisseur Der Regisseur des Inhalts der DVD.
     * @param laufzeit Die Laufzeit des Hauptteils der DVD in Minuten.
     * 
     * @require titel != null
     * @require kommentar != null
     * @require regisseur != null
     * @require laufzeit > 0
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getRegisseur() == regisseur
     * @ensure getLaufzeit() == laufzeit
     */
    public DVD(String titel, String kommentar, String regisseur, int laufzeit)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert laufzeit > 0 : "Vorbedingung verletzt: laufzeit > 0";
        assert regisseur != null : "Vorbedingung verletzt: regisseur != null";
        _titel = titel;
        _kommentar = kommentar;
        _regisseur = regisseur;
        _laufzeit = laufzeit;
    }

    /**
     * Gibt die Laufzeit der DVD (in Minuten) zurück.
     * 
     * @return Die Laufzeit der DVD in Minuten.
     * 
     * @ensure result > 0
     */
    public int getLaufzeit()
    {
        assert _laufzeit > 0 : "Nachbedingung verletzt: result > 0";
        return _laufzeit;
    }

    /**
     * Ändert die Laufzeit der DVD
     * 
     * @param laufzeit Die Laufzeit der DVD in Minuten.
     * 
     * @require laufzeit > 0
     * @ensure getLaufzeit() == laufzeit
     */
    public void setLaufzeit(int laufzeit)
    {
        assert laufzeit > 0 : "Vorbedingung verletzt: laufzeit > 0";
        _laufzeit = laufzeit;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "DVD";
    }

    /**
     * Gibt den Regisseur der DVD zurück
     * 
     * @return Den Regisseur der DVD
     * 
     * @ensure result != null
     */
    public String getRegisseur()
    {
        assert _regisseur != null : "Nachbedingung verletzt: result !=null";
        return _regisseur;
    }

    /**
     * Ändert den Regisseur der DVD
     * 
     * @param regisseur Der Regisseur der DVD.
     * 
     * @require regisseur != null
     * @ensure getRegisseur() == regisseur
     */
    public void setRegisseur(String regisseur)
    {
        assert regisseur != null : "Vorbedingung verletzt: regisseur != null";
        _regisseur = regisseur;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }

    @Override
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }

    @Override
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar + "\n" + "    "
                + "Regisseur: " + _regisseur + "\n" + "    " + "Laufzeit: "
                + _laufzeit + "\n";
    }

}
