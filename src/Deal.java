import java.util.Date;

public class Deal {
    private int id = (int)(Math.random() * 100) + 1;;
    private String description;
    private float initPrix, dealprix ;
    private String dateDeb , dateFin;
    private Fournisseur localisation = new Fournisseur();
    Deal(){}

    public String getId() {
        return id+"";
    }

    @Override
    public String toString() {
        return "*****************************************\n" +
                "*         \t \t Deal:" + id+"\n"+
                "*****************************************\n"+
                "* Description:\t" + description + "\n" +
                "* Prix Initial:\t" + initPrix +"\n"+
                "* Prix de Deal:\t " + dealprix + "\n"+
                "* Date Debut:\t " + dateDeb + "\n" +
                "* Date Fin:\t" + dateFin + "\n" +
                "* Localisation: ------------------ \n" +
                "* \t \t Nom:\t"+localisation.getNom() +" \n"+
                "* \t \t Prenom:\t"+localisation.getPrenom() + " \n" +
                "* \t \t Telephone:\t"+localisation.getTel() +" \n"+
                "* \t \t Horaire:\t"+localisation.getHoraire()+ "\n" +
                "* ------------------------------- \n" +
                "*****************************************\n";

    }

    public String getDescription(){
        return description;
    }
    public float getInitPrix(){
        return initPrix;
    }
    public String getDateDeb(){
        return dateDeb;
    }
    public String getDateFin(){
        return dateFin;
    }

    public void setDealprix(float dealprix) {
        this.dealprix = dealprix;
    }

    public void setDescription(String nvDescription){
        this.description = nvDescription;
    }

    public float getDealprix() {
        return dealprix;
    }

    public void setInitPrix(float nvPrix){
        this.initPrix = nvPrix;
    }
    public void setDateDeb(String nvDateDeb){
        this.dateDeb = nvDateDeb;
    }
    public void setDateFin(String nvDateFin){
        this.dateFin = nvDateFin;
    }
    public void setLocalisation(Fournisseur fournisseur, String horaire){
        this.localisation.setNom(fournisseur.getNom());
        this.localisation.setPrenom(fournisseur.getPrenom());
        this.localisation.setTel(fournisseur.getTel());
        this.localisation.setHoraire(horaire);
    }
}
