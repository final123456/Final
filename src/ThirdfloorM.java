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
        if (coise==1){
           System.out.println("The window is locked. HE COMES OUT THE ROOM HE WAS ON. There is a camera, he watch you the hole time  ");
        }

    }
}
