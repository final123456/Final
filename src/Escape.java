import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Escape {

    public static void displayEscape(){
    int A1;
    int exit = 0;
    int bat=0;//    boolean Count = true;
    Scanner k= new Scanner(System.in);
        System.out.println("You are kidnapped. you are looked in a room that is 4 tories high. The Guy that kidnapped you is in the house.");
        System.out.println("  ____________           _______      ");
        System.out.println("  |    |     |          (       )     ");
        System.out.println("  |____|_____|         (         )    ");
        System.out.println("  |    |     |         |         |    ");
        System.out.println("  |____|_____|         |     []  |    ");
        System.out.println("                       |         |    ");
        System.out.println("                       |_________|    ");
        System.out.println(" 1) jump of the window. 2) go out the door");
    A1=k.nextInt();
    if (A1 == 1)
        Jump(A1);
    else if(A1 == 2){
        int a2;
        System.out.println("You hear him getting close. 1) go back to the room. 2) Go to the Bathroom.");
        a2=k.nextInt();
            if(a2 == 1) {
                int chose;
                System.out.println("                               2) closet              ");
                System.out.println("                               _____________          ");
                System.out.println("  _      1)bed                |      |      |         ");
                System.out.println(" ( )                   _      |      |      |         ");
                System.out.println(" | |                  ( )     |      |      |         ");
                System.out.println(" | |----|_|___________| |     |   [] | []   |         ");
                System.out.println(" | |----| |           | |     |      |      |         ");
                System.out.println(" | |____|_|___________| |     |      |      |         ");
                System.out.println(" |_|                  |_|     |______|______|         ");

                System.out.println("Hide 1)bed  2)closet ");
                chose=k.nextInt();
                System.out.println("The kidnapper goes into the room. He is mad and walks away.");
                System.out.println("You come out of hiding. He Never left. TRY again");
                System.out.println("                                                ");
                System.out.println("                (-----------)                               ");
                System.out.println("               (     __       )                              ");
                System.out.println("              (     |''|       )                             ");
                System.out.println("              |   |-[__]-|     |                             ");
                System.out.println("              |   * (__)*      |                             ");
                System.out.println("              |      : :       |                             ");
                System.out.println("              |________________|                             ");


            }
            else if(a2 == 2){
                int a3;
                System.out.println("You are behind the bathroom door. You see the guy go to the room.");
                System.out.println("       1) Go for the Stairs.   2) Stay.");
                System.out.println("               ______                                             ");
                System.out.println("               |     |                                        ");
                System.out.println("         ______|     |                                              ");
                System.out.println("        |            |                                        ");
                System.out.println("  ______|            |                                              ");
                System.out.println("  |                  |                                        ");
                System.out.println("  |__________________|                                                          ");
                a3=k.nextInt();
//                while(Count)
                if (a3 == 1){
                    System.out.println("He Saw you getting out the bathroom. Try again");
                }
                    if (a3 == 2)
                        stay(a3,bat,exit);
            }
    }
}
    public static void Jump(int A1) {
    int random = (int) (Math.random() * 100);
    int userguess;
    Scanner k = new Scanner(System.in);
    System.out.println("Chose a number from 1 to 100. If you guess it you escape");
    userguess = k.nextInt();
    if (userguess == random) {
        System.out.println("You Escaped");}
        else{
        System.out.println("          ____                   ");
        System.out.println("         |- - |              ");
        System.out.println("         |____|              ");
        System.out.println("      ___/    |___/ /            ");
        System.out.println("     / ___      ___/            ");
        System.out.println("    / /  |     |                 ");
        System.out.println("         |_____|                 ");
        System.out.println("        / /  / /                 ");
        System.out.println("       /_/  /_/                  ");

        System.out.println("You died, try again");}
    }
    public static void stay(int a3, int bat, int exit){
    int a1;
    Scanner k = new Scanner(System.in);
    System.out.println("You Chose to stay. The Kidnapper notice you left. \n" +
            " He is MAD. He gets out the room and goes down stairs");
    System.out.println("1) Go DAWN a flor. 2) Look around ");
    a1=k.nextInt();
    if (a1 == 1) {
       DawnAFloor();
        }
        else if (a1 == 2) {
        int getfirst;
        System.out.println("You Chose to Look around. It's safe to walk around. There is a knife.");
        System.out.println("1) Try to get knife. 2) Go Dawn a flor.");
        getfirst=k.nextInt();
        if( getfirst == 1) {
            chosebat(bat);
            DawnAFloor();
        }
        else
            DawnAFloor();
    }
    }
    public static void DawnAFloor() {
        {
        System.out.println("You are now in floor 3. You see the kidnapper go into a room \n" +
                " at the end of the hall. The stair are next to him.");
        Scanner k = new Scanner(System.in);
        int room3;
        System.out.println("1) go to a room. 2) go to a closet. ");
        room3 = k.nextInt();
        if (room3 == 1)
            ThirdfloorM.displayM();

        else if (room3 == 2)
            ThirdfloorN.displayN();
        else
            System.out.println();
    }
    }
    private static void While(boolean b) {
    }
    public static void chosebat(int bat){
    int count = 1;
    while(count <= 3) {
        int random = (int) (Math.random()) * 30 + 27;
        int userguess;
        Scanner k = new Scanner(System.in);
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("                  /)                                           ");
        System.out.println("                 | |                                           ");
        System.out.println("                 | |                                           ");
        System.out.println("                 |_/                                           ");
        System.out.println("                 | |                                           ");
        System.out.println("                 |_|                                           ");


        System.out.println("chose the right number from 1-30 get knife. "+count+"/4 ");
        userguess = k.nextInt();
        if (userguess == random){
            System.out.println("      new Item obtain, knife. ");
            System.out.println("                  /)                                           ");
            System.out.println("                 | |                                           ");
            System.out.println("                 | |                                           ");
            System.out.println("                 |_/                                           ");
            System.out.println("                 | |                                           ");
            System.out.println("                 |_|                                           ");
            bat++;
            count=count+4;
        }
        else {
            int again;
            System.out.println("     __     ___  ____   ______   ____");
            System.out.println("  |  /|  / |  / /    )  /     / /____/                                         ");
            System.out.println("  | / | /  |_/ (     /  |     |      |                             ");
            System.out.println("  |/  |/   | |  (___/   |     |  ____|                                         ");
            System.out.println("                                                                 ");
            System.out.println(" Tyr again 1) yes 2) no");
            again = k.nextInt();
            if (again == 1)
                count++;
            else if (again == 2) {
                System.out.println("Too bad");
                count++;
            }
        }
    }
    }
    public static void displaydeath(){
        {
            System.out.println("          ____               ");
            System.out.println("         |- - |              ");
            System.out.println("         |____|              ");
            System.out.println("      ___/    |___/ /        ");
            System.out.println("     / ___      ___/         ");
            System.out.println("    / /  |     |             ");
            System.out.println("         |_____|             ");
            System.out.println("        / /  / /             ");
            System.out.println("       /_/  /_/              ");

            System.out.println("You died, try again");}

    }
    }
    