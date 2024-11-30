public class ThemeArtiste implements ThemeEvt{
    private String artiste;

    public ThemeArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getArtiste() {
        return artiste;
    }

    @Override
    public boolean theme(Evenement Evt) {
        if (Evt instanceof Film){
            return Evt.acteurIn(artiste) || Evt.realisateur.equals(artiste) || ((Film) Evt).getProducteur().equals(artiste);

        }else{
            return Evt.acteurIn(artiste) || Evt.realisateur.equals(artiste) || ((Theatre) Evt).getAuteur().equals(artiste);
        }
    }
}
