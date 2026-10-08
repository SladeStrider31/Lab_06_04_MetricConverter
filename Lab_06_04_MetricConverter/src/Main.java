import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        //Declarations
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";

        System.out.println("How long is your thing in meters?");

        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must have done something wrong. \nTry another response");
            System.exit(0);
        }

        miles = meters / 1609.344;
        feet = meters * 3.28084;
        inches = meters * 39.3701;

        System.out.println("Your object that is " + meters + " meters is " + miles + " in miles.");
        System.out.println("In feet its " + feet + "ft.");
        System.out.println("In inches it is " + inches + " in.");
    }
}