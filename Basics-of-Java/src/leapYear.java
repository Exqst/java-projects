import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year;
        String name;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the program !");
        System.out.print("Can I please know your name: ");
        name = in.nextLine();
        System.out.println("Welcome " + name + " Please enter a year, I will determine if its a leap year or not: ");
        year = in.nextInt();

        if(year % 4 == 0){
            System.out.println("The year is a leap year! ");
        }
        else {
            System.out.println("It is not a leap year.");
        }
    }
}
