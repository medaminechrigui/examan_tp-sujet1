public class Main {
    public static void main(String[] args) {
        ThemeArtiste ta=new ThemeArtiste("Mohamed");
        String[] tArtistes1 = {"Ahmed","Salah","Mohamed"};
        String[] tArtistes2 = {"Sana","Imene","Mouna"};
        OrgniseEvtMois MJuillet=new OrgniseEvtMois(ta,7);
        Evenement e1= new Film("Film1",2 , tArtistes1, "Sami", "Youssef", "action");
        Evenement e2= new Film("Film2",1 , tArtistes2, "Dalel", "Asma", "Drame");
        Evenement e3=new Theatre("theatre1", 3, null, "Nour", "Mohamed");
        try {
            MJuillet.ajouter(e1,3);
        } catch (EvtException e) {
            System.out.println(e.getMsg());
        }
        try{
        MJuillet.ajouter(e2,2);}
        catch(EvtException e){
            System.out.println(e.getMsg());
        }
        try {
            MJuillet.ajouter(e3, 3);
        }catch (EvtException e) {
            System.out.println(e.getMsg());
        }
        MJuillet.afficherCalendrierEvt();
    }
}