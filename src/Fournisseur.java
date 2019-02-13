public class Fournisseur {
    private String nom, prenom, tel, horaire;
    int userChoice, answer;
    Menu menu = null;
    Deal deal = null;
    Fournisseur(){}

    @Override
    public String toString() {
//        return "Cher Fournisseur,\n votre nom:  " +  nom  +  ",\n votre Prenom  " + prenom +  ",\n votre numero telephonique:  " + tel  ;
        return "*****************************************\n" +
                "* \t \t Profil Fournisseur \n"+
                "*****************************************\n"+
                "* Nom :\t" + nom + "\n" +
                "* Prenom:\t" + prenom +"\n"+
                "* Telephone:\t " + tel + "\n"+
                "*****************************************\n";
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    int providerSignUpProccess(){
        System.out.println("Donner votre nom: ");
        nom = Main.input.nextLine();
        setNom(nom);
        System.out.println("Donner votre prenom: ");
        prenom = Main.input.nextLine();
        setPrenom(prenom);
        System.out.println("Donner votre numero telephone: ");
        tel = Main.input.nextLine();
        setTel(tel);
        Main.providerCounter++;
        Main.providersList.put(nom, Main.providerCounter.toString());
        Main.providersInfo.put(Main.providerCounter.toString(), tel);
        System.out.print("\033[H\033[2J");
        System.out.print("Bienvenue cher Fournisseur ");
        userChoice = providerAction();
        while(userChoice > 0 && userChoice <4 ) {
            if (userChoice == 1) {
               addDeal();
            }
            if (userChoice == 2) {
//                System.out.println("1");
                userChoice = consultProfile();
                menu = new Menu();
            }
            if (userChoice == 3) {
                System.out.println("My deals ");
                // mes deals
            }
            menu = new Menu();
            userChoice = menu.menuDisplayFournisseur();
        }

        menu = new Menu();
        userChoice = menu.logInMenuDisplay();
        return 4;
    }
    int providerAction(){
        menu = new Menu();
        return menu.menuDisplayFournisseur();
    }
    int consultProfile(){
        System.out.print(toString() + "\n");
        return userChoice;
    }
    void myDeals(){
        for (String i : Main.dealsList.keySet()) {
            System.out.println("Deal: " + i + " \n" + Main.dealsList.get(i));
        }
    }
    void addDeal(){
                    System.out.println("voulez ajouter un deal ? 1:oui / 0:non");
                    answer = Main.input.nextInt();
                    while (answer == 1) {
                        deal = new Deal();
                        System.out.println("Donner description de deal: ");
                        deal.setDescription(Main.input.next());
                        System.out.println("Donner prix initial de deal: ");
                        deal.setInitPrix(Main.input.nextFloat());
                        System.out.println("Donner prix de deal: ");
                        deal.setDealprix(Main.input.nextFloat());
                        System.out.println("Donner date debut de deal: ");
                        deal.setDateDeb(Main.input.next());
                        System.out.println("Donner date fin de deal: ");
                        deal.setDateFin(Main.input.next());
                        System.out.println("Donner horaire de la localisation de deal: ");
                        deal.setLocalisation(this, Main.input.next());
                        Main.dealCounter++;
                        Main.dealsList.put(deal.getId(), deal.toString());
                        System.out.println("voulez ajouter encore un deal ? 1:oui / 0:non");
                        answer = Main.input.nextInt();
                    }
                    System.out.println("Voulez vous afficher la liste des deals enregistrer ? 1:oui / 0:non");
                    answer = Main.input.nextInt();
                    if (answer == 1) {
                        for (String i : Main.dealsList.keySet()) {
                            System.out.println("Deal: " + i + " \n" + Main.dealsList.get(i));
                        }
                    } else {
                        userChoice = menu.menuDisplayFournisseur();
                    }
                }
    int providerlogInProcess(){
        System.out.println("entrer votre nom svp");
        String verifynom = Main.input.next();
        if(Main.providersList.get(verifynom) != null){
            System.out.println("horay provider log in");
            menu = new Menu();
            userChoice = menu.menuDisplayFournisseur();
            while(userChoice > 0 && userChoice <4 ) {
                if (userChoice == 1) {
                    addDeal();
                }
                if (userChoice == 2) {
                    userChoice = consultProfile();
                    menu = new Menu();
                }
                if (userChoice == 3) {
                    for (String i : Main.dealsList.keySet()) {
                        System.out.println("Deal: " + i + " \n" + Main.dealsList.get(i));
                    }
                }
                menu = new Menu();
                userChoice = menu.menuDisplayFournisseur();

                return userChoice;
            }
            if(userChoice == 4){
                return 6;
            }
        }
        else {
            System.out.println("please provider register first ");
            menu = new Menu();
            userChoice = menu.signUpMenuDisplay();
        }
        return userChoice;
    }
}
