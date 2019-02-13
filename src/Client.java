import java.util.HashMap;

public class Client {
    public static HashMap<String, String> myDeals = new HashMap<String, String>();

    private String nom, prenom, tel;
    Menu menu = null;
    int userChoice;
    Client(){}

    @Override
    public String toString() {
//        return "Cher Client,\n votre nom:  " +  nom  +  ",\n votre Prenom  " + prenom +  ",\n votre numero telephonique:  " + tel  ;
    return "*****************************************\n" +
            "*         \t \t Profil Client\n"+
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    int signUpProccess(){
        System.out.println("Donner votre nom: ");
            nom = Main.input.next();
            setNom(nom);
            System.out.println("Donner votre prenom: ");
            prenom = Main.input.next();
            setPrenom(prenom);
            System.out.println("Donner votre numero telephone: ");
            tel = Main.input.next();
            setTel(tel);
            Main.userCounter++;
            Main.usersList.put(nom, Main.userCounter.toString());
            Main.usersInfo.put(Main.userCounter.toString(), tel);
            System.out.print("\033[H\033[2J");
            System.out.print("Bienvenue cher Client ");
            userChoice = clientAction();
        System.out.println("0");
            while(userChoice > 0 && userChoice <4 ) {
                if (userChoice == 1) {
                    System.out.println("1");
                    userChoice = consultProfile();
                    menu = new Menu();
                }
                if (userChoice == 2) {
                    System.out.println("Available deals ");
                    showDeals();
                }
                if (userChoice == 3) {
                    System.out.println("my reservations");
                    showMyDeals();
                }
                menu = new Menu();
                userChoice = menu.menuDisplayClient();

            }

        menu = new Menu();
        userChoice = menu.logInMenuDisplay();
        return 3;
            }
    int clientAction(){
        menu = new Menu();
        return menu.menuDisplayClient();
    }
    int consultProfile(){
        System.out.print(toString() + "\n");
        return userChoice;
    }
    void showDeals(){
        for (String i : Main.dealsList.keySet()) {
            System.out.println("Deal: " + i + " \n" + Main.dealsList.get(i));
        }
        System.out.println("voulez vous reserver un deal ? 1:Oui/0:non");
        int answer = Main.input.nextInt();
        while (answer == 1){

            System.out.println("voulez entrer le numero de deal souhaitee\n");
            answer = Main.input.nextInt();
            myDeals.put(getNom(),Main.dealsList.get(answer+""));
            System.out.println("voulez vous reserver encore un deal ? 1:Oui/0:non");
            answer = Main.input.nextInt();
        }
    }
    void showMyDeals(){
        for (String i : myDeals.values()) {
            System.out.println(i);
        }
    }
    int logInProcess(){

        System.out.println("entrer votre nom svp");
        String verifynom = Main.input.next();
        if(Main.usersList.get(verifynom) != null){
            System.out.println("horay client log in");
            menu = new Menu();
            userChoice = menu.menuDisplayClient();
            while(userChoice > 0 && userChoice <4 ) {
                if (userChoice == 1) {
                    System.out.println("1");
                    userChoice = consultProfile();
                    menu = new Menu();
                }
                if (userChoice == 2) {
                    System.out.println("Available deals ");
                    showDeals();
                }
                if (userChoice == 3) {
                    System.out.println("my reservations");

                }

                menu = new Menu();
                userChoice = menu.menuDisplayClient();
                return userChoice;
            }
        }
        else {
            System.out.println("please client register first ");
            menu = new Menu();
            userChoice = menu.signUpMenuDisplay();

        }
        return userChoice;
    }
}
