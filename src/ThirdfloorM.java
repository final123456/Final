import java.util.Scanner;

public class ThirdfloorM {
    public static void displayM(){
        Scanner k=new Scanner(System.in);
        String Choise;
        System.out.println("there are 3 rooms, A, B, C. choose one");
        Choise=k.next();
        if (Choise.equalsIgnoreCase("A")){
            System.out.println("");
        }
        else if (Choise.equalsIgnoreCase("B")){
            System.out.println();
        }
        else if (Choise.equalsIgnoreCase("C")){
            System.out.println();
        }

    }
}
