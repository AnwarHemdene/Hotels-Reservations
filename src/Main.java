import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.exit;


public class Main {

    // Static variables
    public static HashMap<String, String> usersList = new HashMap<String, String>();
    public static HashMap<String, String> providersList = new HashMap<String, String>();
    public static HashMap<String, String> usersInfo = new HashMap<String, String>();
    public static HashMap<String, String> providersInfo = new HashMap<String, String>();
    public static HashMap<String, String> reservations = new HashMap<String, String>();
    public static HashMap<String, String> dealsList = new HashMap<String, String>();
    public static Integer userCounter = 0;
    public static Integer providerCounter = 0;
    public static Integer dealCounter = 0;
    public static Scanner input = new Scanner(System.in);
    public static int userChoice;

    public static void main(String[] args) {
        /*System.out.print("*****************************************\n" +
                "*         \t \t Deal:" + 1+"\n"+
                        "*****************************************\n"+
                "* Description:\t" + "description" + "\n" +
                "* Prix Initial:\t" + 35 +"\n"+
                "* Prix de Deal:\t " + 13 + "\n"+
                "* Date Debut:\t " + "12-12-2020" + "\n" +
                "* Date Fin:\t" + "14-20-2050" + "\n" +
                "* Localisation: ------------------ \n" +
                "* \t \t Nom:\t"+" aaaa" +" \n"+
                "* \t \t Prenom:\t"+"benn" + " \n" +
                "* \t \t Telephone:\t"+"52321456" +" \n"+
                "* \t \t Horaire:\t"+"13:14"+ "\n" +
                "* ------------------------------- \n" +
                "*****************************************\n");*/
        ;
        int userChoice;
        // For user Data
        String nom , prenom , tel;
        Client client = new Client();
        Fournisseur fournisseur = new Fournisseur();

        // For user interaction with the system
        int answer ;

        // For deals
        Deal deal = null ;

        /*userChoice = menu();
        System.out.println(userChoice);*/

        Menu menu = new Menu();
        userChoice = menu.signUpMenuDisplay();
        System.out.println(userChoice);
        while (userChoice >0 && userChoice <5 ){
            while(userChoice == 1 || userChoice == 2){
                if(userChoice == 1){

                    client = new Client();
                    userChoice =  client.signUpProccess();
                }
                if(userChoice == 2 ){

                    fournisseur = new Fournisseur();
                    userChoice = fournisseur.providerSignUpProccess();
                }
            }
            while(userChoice == 3 || userChoice == 4){
                if(userChoice == 3){

                    client = new Client();
                    userChoice = client.logInProcess();
                    if(userChoice == 4){
                        client = new Client();
                        userChoice = client.logInProcess();
                        if(userChoice == 3){
                            exit(0);
                        }
                    }
                }
                if(userChoice == 4 ){

                    fournisseur = new Fournisseur();
                    userChoice = fournisseur.providerlogInProcess();
                    if(userChoice == 6){
                        System.out.println("am here");
                        menu = new Menu();
                        userChoice = menu.logInMenuDisplay();
                        if(userChoice == 3){
                            exit(0);
                        }
                    }
                }
            }
        }
        if(userChoice == 7){
            exit(0);
        }

    }

}
