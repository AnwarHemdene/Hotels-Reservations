import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int signUpMenuDisplay() {

        int selection;

        Scanner input = new Scanner(System.in);
        /***************************************************/
        System.out.println("*********************************************************");
        System.out.println("*\t\t\t\t Choissisez un action \t \t\t \t\t*");
        System.out.println("*\t------------------------------------------------- \t*");
        System.out.println("* \t 1 - Creer un compte client \t \t\t \t\t\t*");
        System.out.println("* \t 2 - Creer un compte fournisseur\t\t \t\t\t*");
        System.out.println("*\t 7 - Quit  \t \t \t \t \t \t \t\t \t\t\t*");
        System.out.println("*********************************************************\n");
        try{
            selection = input.nextInt();
        }catch (InputMismatchException e){

            System.out.println("invalid choice");
            selection = 0;
        }

        return selection;
    }
    public static int logInMenuDisplay() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/
        System.out.println("*********************************************************");
        System.out.println("*\t\t\t\t Choissisez un action \t \t\t \t\t*");
        System.out.println("*\t------------------------------------------------- \t*");
        System.out.println("* \t 1 - Se connecter en tant que client \t \t\t \t*");
        System.out.println("* \t 2 - Se connecter en tant que fournisseur\t\t \t*");
        System.out.println("*\t 3 - Quit  \t \t \t \t \t \t \t\t \t\t\t*");
        System.out.println("*********************************************************\n");

        selection = input.nextInt();
        return selection;
    }
    public static int menuDisplayClient() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("\n*****************************************");
        System.out.println("*\t\t\tChoissisez un action \t \t*");
        System.out.println("*\t--------------------------------- \t*");
        System.out.println("* \t 1 - Consulter mon profile\t \t\t*");
        System.out.println("* \t 2 - Deals en cours \t \t \t\t*");
        System.out.println("* \t 3 - Liste de mes deals \t \t \t*");
        System.out.println("* \t 4 - Quit\t \t*");
        System.out.println("*****************************************\n");

        selection = input.nextInt();
        return selection;
    }
    public static int menuDisplayFournisseur() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/
        System.out.println("\n*****************************************");
        System.out.println("*\t\t\tChoissisez un action \t \t*");
        System.out.println("*\t--------------------------------- \t*");
        System.out.println("* \t 1 - Ajouter un deal  \t \t \t\t*");
        System.out.println("* \t 2 - Consulter mon profile\t \t\t*");
        System.out.println("* \t 3 - Consulter mes deals \t \t\t*");
        System.out.println("* \t 4 - Quit\t \t*");
        System.out.println("*****************************************\n");

        selection = input.nextInt();
        return selection;
    }
}
