public class OrgniseEvtMois {
    private int mois;
    private ThemeEvt theme;
    private Evenement tab[];
    public int nbMax(){
        switch (mois){
            case 12,1,3,5,7,8,10:return 31;
            case 2:return 28;
            case 4,6,9,11:return 30;
            default:return 0;
        }
    }
    public OrgniseEvtMois(ThemeEvt theme, int mois) {
        this.theme = theme;
        this.mois = mois;
        tab = new Evenement[nbMax()];
    }
    public void ajouter(Evenement Evt,int jour) throws EvtException{
        if(theme.theme(Evt)){
        if (jour<1 || jour>nbMax()){
            throw new EvtException("jour incorrect");
        } else if (this.tab[jour-1]==null) {
            if (theme.theme(Evt)){
                this.tab[jour-1] = Evt;
            }
        }else{
            jour=0;
            while (jour<nbMax() && this.tab[jour]!=null) {
                jour++;
            }
            if (jour>nbMax()){
                throw new EvtException("complet");
            }
            this.tab[jour] = Evt;
                }
            }else {
            System.out.println("hors theme");
        }
    }
    public void afficherCalendrierEvt(){
        for (int i = 0; i < nbMax() ; i++) {
            if (tab[i]!=null){
            System.out.println(tab[i].toString());}
            else{
                System.out.println("pas d'evenement");
            }
        }
    }
}
