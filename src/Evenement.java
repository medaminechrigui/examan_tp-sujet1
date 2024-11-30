import java.util.Arrays;

public class Evenement {
    protected String titre;
    protected int duree;
    protected String[] noms;
    protected String realisateur;

    public Evenement(String titre, int duree, String[] noms, String realisateur) {
        this.titre = titre;
        this.duree = duree;
        this.noms =  noms;
        this.realisateur = realisateur;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String[] getNoms() {
        return noms;
    }

    public void setNoms(String[] noms) {
        this.noms = noms;
    }

    @Override
    public String toString() {
        return "titre='" + titre + '\'' +
                ", duree=" + duree +
                ", noms=" + Arrays.toString(noms) +
                ", realisateur='" + realisateur + '\'';
    }

    public boolean acteurIn(String s){
        if (noms!=null){
        for (String nom : noms) {
            if (nom.equals(s)) {
                return true;
            }
        }
        }
    return false;}
}
