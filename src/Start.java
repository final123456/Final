import java.util.Scanner;

public class Start {


    public static void displayStart(){
        System.out.println("                                   ");
        System.out.println("                                   ");
        System.out.println("|----------------------------------|");
        System.out.println("|          Welcome to Escape       |");
        System.out.println("|      Will you survive or die.    |");
        System.out.println("|----------------------------------|");
        System.out.println("                                   ");
        boolean start= true;
        int go;
        Scanner k = new Scanner(System.in);
        while (start) {

            System.out.println("             Are you Ready");
            System.out.println("             1) yes 2) no");
            for (int i = 0; i < 10; i++){
                System.out.println(
                );
            }
            go =k.nextInt();
            if(go ==1){
                Escape.displayEscape();
                start=false;
            }
            else
                System.exit(0);


        }
    }
}
