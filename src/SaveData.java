
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SaveData {

    /**
     * @param args
     * @throws IOException
     */
 /*   public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList total = new ArrayList();
        total = lirefichierArray("failureliste.txt");
        for (int i=0;i < total.size();i++)
        {
            System.out.println("..."+total.get(i) );
            System.out.println("... \n");
        }
        total = null;
        String total2;
*//*
        total2 = lirefichierString("failureliste.txt");
                System.out.println(total2);
*//*



    }*/

    public static ArrayList lirefichierArray(String nomfichier) {
        String line;
        ArrayList total = new ArrayList();
        try {
            BufferedReader in = new BufferedReader(new FileReader(nomfichier));
            while ((line = in.readLine()) != null) {
                total.add(line + "\r\n");

            }
        } catch (Exception e) {
            total = null;
        }
        return total;
    }

   /* public static String lirefichierString(String nomfichier)
    {
        String line;
        String total = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(nomfichier));
            while ((line = in.readLine()) != null) {
                total += line + "\r\n";

            }
        } catch (Exception e) {
            total = null;
        }
        return total;
    }*/

}