import java.util.Scanner;

public class ThirdfloorM {
    public static void displayM(){
        Scanner k=new Scanner(System.in);
        String Choise;
        int coise;
        System.out.println("there are 3 rooms, A, B, C. choose one");
        Choise=k.next();
        if (Choise.equalsIgnoreCase("A")){
            System.out.println("IT A TRAP!!! you can't escape.");
        }
        else if (Choise.equalsIgnoreCase("B")){
            System.out.println("There is a dall. it would seem that you\n" +
                    "are not his first victim. ");
            System.out.println("there is a picture book. it full with pictures of oys and girl all about the age of 6-10.\n" +
                    "All the kids were in rooms that looked similar but they aren't exact. there is your picture is in there");
            System.out.println("\n" +
                    "THOSE AREN'T MEANT FOR YOU KID. He is in the room with you.Try again");
        }
        else if (Choise.equalsIgnoreCase("C")){
            System.out.println("This room is empty.It must be a trap.  1)go for the window.  2) to living room ");
            coise=k.nextInt();
            displaychoise2(coise);


        }

    }
    public static void displaychoise2(int coise){
        Scanner k = new Scanner(System.in);
        int choise3;
        if (coise==1){
           System.out.println("The window is locked. HE COMES OUT THE ROOM HE WAS ON. There is a camera, he watch you the hole time");
           Escape.displaydeath();
        }
        else if(coise==2){
            System.out.println("you looked up and there are cameras watching you. He comes out of his room. 1) Hide \n" +
                    " behind the couch. 2) hide int the living room closet.");
            choise3=k.nextInt();
            choise3(choise3);
        }
    }
    public static void choise3(int choise3) {
        if (choise3 == 1) {
            System.out.println("Did you really that would work.  ");
            Escape.displaydeath();
        } else if (choise3 == 2) {
            System.out.println(" He could find you and goes back to the room next to the stairs.");
            backtoroom();
        }
    }
        public static void backtoroom(){
        Scanner k = new Scanner(System.in);
        int s;
            System.out.println("1) Run for the stairs. 2) Stay ");
            s=k.nextInt();
            if(s==1){
                System.out.println("You made it past the door and manage to lock the kidnapper in the room.");
                System.out.println("As you go for the Stair a second person comes from the stairs and shoots you.");
                    System.out.println("            ___                   ");
                    System.out.println("         __|- |              ");
                    System.out.println("         |____|              ");
                    System.out.println("      ___/    |___/ /            ");
                    System.out.println("     / ___      ___/            ");
                    System.out.println("    / /  |     |                 ");
                    System.out.println("         |_____|                 ");
                    System.out.println("        / /  / /                 ");
                    System.out.println("       /_/  /_/                  ");

                    System.out.println("You died, try again");
                System.out.print("try again");

            }
            else
                System.out.println("He comes out of his room and heads to the living room closet. he has a shotgun. and\n" +
                        "fires it at the living room closet.Try again");
        }

    }

