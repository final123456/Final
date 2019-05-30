import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Escape {
    private static int kill=0;
    private static int escape = 0;
    private static int playtimes = 0;
    public static void displayEscape(){
    int A1;
    int bat=0;//    boolean Count = true;
    Scanner k= new Scanner(System.in);
    playtimes++;
        System.out.println("You have been kidnapped. you are looked in a room that is 4 stories high. The Guy that kidnapped you is in the house.");
        System.out.println("  ____________                _______      ");
        System.out.println("  |    |     |               (       )     ");
        System.out.println("  |____|_____|              (         )    ");
        System.out.println("  |    |     |              |         |    ");
        System.out.println("  |____|_____|              |     []  |    ");
        System.out.println("                            |         |    ");
        System.out.println("                            |_________|    ");
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
                kill++;
                displayStart();
            }
            else if(a2 == 2){
                int a3;
                System.out.println("You are behind the bathroom door. You see the guy go to the room.");
                System.out.println("       1) Go for the Stairs.   2) Stay.");
                a3=k.nextInt();
                System.out.println("               ______                   ___                          ");
                System.out.println("               |     |                 |   |                    ");
                System.out.println("         ______|     |                 (___)                         ");
                System.out.println("        |            |                 __|__                    ");
                System.out.println("  ______|            |                   |                           ");
                System.out.println("  |                  |                  _|_                     ");
                System.out.println("  |__________________|                 |   |                     ");

                if (a3 == 1){
                    System.out.println("He Saw you getting out the bathroom. Try again");
                    System.out.println("     __________                         ");
                    System.out.println("     |[*] [*]|                   ");
                    System.out.println("     |  **   |                   ");
                    System.out.println("     |__----_|                         ");
                    System.out.println("                              ");
                    kill++;
                    displayStart();
                }
                    if (a3 == 2)
                        stay(a3,bat);
            }
    }
}
    public static void Jump(int A1) {
        int random = (int) (Math.random() * 100);
        int userguess;
        int guess = 0;
        Scanner k = new Scanner(System.in);
        while (guess != 3) {
            System.out.println("Chose a number from 1 to 100. If you guess it you escape. "+ guess+" /3");
            userguess = k.nextInt();
            if (userguess == random) {
                System.out.println("You Escaped");
                System.out.println("           =)                    ");
            escape++;
            displayStart();

            } else if (userguess > random) {
                System.out.println(userguess + " is high ");
                ++guess;
            } else if (userguess < random) {
                System.out.println(userguess + " is low ");
                ++guess;
            }
        }
        System.out.println(random + " was the right number ");
        displaydeath();

    }
    public static void stay(int a3, int bat){
    int a1;
    Scanner k = new Scanner(System.in);
    System.out.println("You Chose to stay. The Kidnapper notice you left. \n" +
            " He is MAD. He gets out the room and goes down stairs");
    System.out.println(                "1) Go down a floor. 2) Look around ");
        System.out.println("               ______                   ___                          ");
        System.out.println("               |     |                 |0 0|                    ");
        System.out.println("         ______|     |                 (___)                         ");
        System.out.println("        |            |                 __|__                    ");
        System.out.println("  ______|            |                   |                           ");
        System.out.println("  |                  |                  _|_                     ");
        System.out.println("  |__________________|                 |   |                     ");
        a1=k.nextInt();
    if (a1 == 1) {
       DawnAFloor();
        }
        else if (a1 == 2) {
        int getfirst;
        System.out.println("You Chose to Look around. It's safe to walk around. There is a knife.");
        System.out.println("1) Try to get knife. 2) Go Dawn a flor.");
        System.out.println("         /)                                           ");
        System.out.println("        | |                    _______                       ");
        System.out.println("        | |                    |     |                 ");
        System.out.println("        |_/                ____|     |                      ");
        System.out.println("        | |               |          |                  ");
        System.out.println("        |_|               |__________|                            ");
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
            Scanner k = new Scanner(System.in);
            int lock;
            System.out.println("There is a lock in the door. Solve the equation to unlock it. ");
            System.out.println(" x+3(3)=10");
            lock= k.nextInt();
            if (lock==1) {
                System.out.println("You are now in floor 3. You see the kidnapper go into a room \n" +
                        " at the end of the hall. The stair are next to him.");
                int room3;
                System.out.println("    _________        _______________                      ");
                System.out.println("   (         )      |       |      |  ");
                System.out.println("  (           )     |       |      |    ");
                System.out.println("  |            |    |       |      |      ");
                System.out.println("  |         [] |    |    [] | []   |    ");
                System.out.println("  |            |    |       |      |    ");
                System.out.println("  |            |    |       |      |     ");
                System.out.println("  |____________|    |_______|______|    ");
                System.out.println("1) go to a room. 2) go to a closet. ");
                room3 = k.nextInt();
                if (room3 == 1)
                    ThirdfloorM.displayM();

                else if (room3 == 2)
                    ThirdfloorN.displayN();
                else
                    System.out.println("not an option");
            }
            else{
                System.out.println("Try again");
                DawnAFloor();
            }
        }

    }
    public static void chosebat(int bat) {
        int count = 1;
        int random = (int) (Math.random()) * 30;
        Scanner k = new Scanner(System.in);
        while (count <= 3)
        {
            int userguess;
            System.out.println("                  /)                                           ");
            System.out.println("                 | |                                           ");
            System.out.println("                 | |                                           ");
            System.out.println("                 |_/                                           ");
            System.out.println("                 | |                                           ");
            System.out.println("                 |_|                                           ");


            System.out.println("chose the right number from 1-30 get knife. " + count + "/3 ");
            userguess = k.nextInt();
            if (userguess == random) {
                System.out.println("      new Item obtain, knife. ");
                System.out.println("                  /)                                           ");
                System.out.println("                 | |                                           ");
                System.out.println("                 | |                                           ");
                System.out.println("                 |_/                                           ");
                System.out.println("                 | |                                           ");
                System.out.println("                 |_|                                           ");
                bat++;
                count = count + 4;
            } else {
                if (userguess >random){
                    System.out.println(userguess+" is to high");
                count++;
                }
                else if(userguess<random) {
                    System.out.println(userguess + " is to low ");
                    count++;
                }

            }

        }
        System.out.println(random+" Was the right number" +
                "");
        int input;

        System.out.println(" go to third floor 1)yes  2)no");
        input=k.nextInt();
        if (input == 1){
            DawnAFloor();

        }
        else if ( input == 2){
            System.out.println(" TOO BAD");
            DawnAFloor();
        }
    }
    public static void displaydeath(  ){
            System.out.println("          ____               ");
            System.out.println("         |* * |              ");
            System.out.println("         |____|              ");
            System.out.println("      ___/    |___/ /        ");
            System.out.println("     / ___      ___/         ");
            System.out.println("    / /  |     |             ");
            System.out.println("         |_____|             ");
            System.out.println("        / /  / /             ");
            System.out.println("       /_/  /_/              ");
            System.out.println("You died, try again");
            kill++;
            displayStart();
        }
    public static void displayStart() {
        for(int i = 0; i<10; i++){
            System.out.println(
            );}
            int option;
            int error=0;
                Scanner k = new Scanner(System.in);
                while (error != 100) {
                    System.out.println("do you want to restart");
                    System.out.println("1 Yes 2)No ");
                    error++;
                    option = k.nextInt();
                    if (option == 1)
                        Start.displayStart();
                    else if (option == 2)
                        System.exit(0);
                }
            }
    public static void displayScore(){
        int math;
        math=escape/playtimes;
        System.out.println("You died "+ kill);
        System.out.println("You escaped "+ escape);
        System.out.println("You played "+playtimes+" Games");
        System.out.println("you won "+math+"% of your games");
    }
    public static void shoot () {
        System.out.println("            ___                   ");
        System.out.println("         __|- |              ");
        System.out.println("         |____|              ");
        System.out.println("      ___/    |___/ /            ");
        System.out.println("     / ___      ___/            ");
        System.out.println("    / /  |     |                 ");
        System.out.println("         |_____|                 ");
        System.out.println("        / /  / /                 ");
        System.out.println("       /_/  /_/                  ");
        kill++;
        Escape.displayStart2();
    }
    public static void displayStart2() {
        for (int i = 0; i < 10; i++) {
            System.out.println(
            );
        }
        int option;
        int error = 0;
        Scanner k = new Scanner(System.in);
        while (error != 100) {
            System.out.println("do you want to restart");
            System.out.println("1 Yes 2)No ");
            error++;
            option = k.nextInt();
            if (option == 1)
                DawnAFloor();
            else if (option == 2)
                System.exit(0);

        }
    }
    public static void displaydeath2(){
        System.out.println("          ____               ");
        System.out.println("         |* * |              ");
        System.out.println("         |____|              ");
        System.out.println("      ___/    |___/ /        ");
        System.out.println("     / ___      ___/         ");
        System.out.println("    / /  |     |             ");
        System.out.println("         |_____|             ");
        System.out.println("        / /  / /             ");
        System.out.println("       /_/  /_/              ");
        System.out.println("You died, try again");
        kill++;
        displayStart2();
    }
    }