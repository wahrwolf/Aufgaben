public class Videospiel implements Medium
{

    /**
     * Die Konsole auf der das Videospiel lauffähig ist.
     */
    private String _konsole;

    /**
     * Das Entwicklerstudios des Videospiles
     */
    private String _studio;

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
     * Initialisiert ein neues Videospiel mit den gegebenen Daten.
     * 
     * @param titel Der Titel des Videospieles.
     * @param kommentar Ein Kommentar zu der Videospiel.
     * @param studio Der Regisseur des Inhalts der Videospiel.
     * @param konsole Die konsole des Hauptteils der Videospiel in Minuten.
     * 
     * @require titel != null
     * @require kommentar != null
     * @require studio != null
     * @require konsole > 0
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getRegisseur() == studio
     * @ensure getKonsole() == konsole
     */
    public Videospiel(String titel, String kommentar, String studio,
            String konsole)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert konsole != null : "Vorbedingung verletzt: konsole != null";
        assert studio != null : "Vorbedingung verletzt: studio != null";
        _titel = titel;
        _kommentar = kommentar;
        _studio = studio;
        _konsole = konsole;
    }

    public Videospiel(String titel, String kommentar, String konsole)
    {
        this(titel, kommentar, "unknown", konsole);
    }

    /**
     * Gibt die Konsole des Videospieles zurück.
     * 
     * @return Die Konsole auf der das Videospiel lauffähig ist.
     * 
     * @ensure result != null
     */
    public String getKonsole()
    {
        assert _konsole != null : "Nachbedingung verletzt: resulte != null";
        return _konsole;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**
     * Gibt das Entwicklerstudio des Videospieles zurück
     * 
     * @return Das Entwicklerstudio des Videospieles
     * 
     * @ensure result != null
     */
    public String getStudio()
    {
        assert _studio != null : "Nachbedingung verletzt: result !=null";
        return _studio;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }

    @Override
    public String getFormatiertenString()
    {
        String puffer = 
        "Titel: " + _titel + "\n" +
        "Studio: "+ _studio + "\n" +
        "System: " + _konsole + "\n" +
        "Kommentar: "+ _kommentar + "\n";
                
                
        return puffer;
    }

}
