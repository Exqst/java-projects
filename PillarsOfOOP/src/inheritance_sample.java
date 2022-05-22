import java.util.InputMismatchException;
import java.util.Scanner;

public class inheritance_sample {
    static class Menu{
        String list[] = {"Clubhouse", "Steak", "Smoothie", "Hotdog"};
        int price[] = {25, 149, 50, 30};
    }

     static class Resto extends Menu{
        public static void main(String[] args){
        String name;
        String chc = "y";
        int choice;
        int total = 0;
        int price = 0;
        String menuItem;
        int menuNumber = 0;
        Scanner name_input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner chc_in = new Scanner(System.in);

            Resto r = new Resto();
            //Name input
            System.out.print("Welcome to the restaurant please state your name: ");
            name = name_input.nextLine();
            System.out.print("Hello there " + name + "! ");

            //Display of the menu
            System.out.print("Here is the menu as well as the prices");
            System.out.println();
            for (int i = 0; i < r.list.length; i++) {
                System.out.println((menuNumber + i + 1) + ". " + r.list[i] + ": " + r.price[i]);
            }
            do{
            System.out.print("What would you like to order? Please select the corresponding number: ");
            try{
                choice = in.nextInt();

            if (choice == 1) {
                menuItem = r.list[0];
                price = r.price[0];
            } else if (choice == 2) {
                menuItem = r.list[1];
                price = r.price[1];
            } else if (choice == 3) {
                menuItem = r.list[2];
                price = r.price[2];
            } else if (choice == 4) {
                menuItem = r.list[3];
                price = r.price[3];
            } else {
                System.out.print("There is no such thing on the menu sir. Terminating program");
            }
            }catch (InputMismatchException e){
                System.out.print("Invalid input. Terminating program");
                System.exit(0);
            }
            System.out.print("Would you like to add more items? (Y/N)");
            chc = chc_in.nextLine();
            total += price;
        }while (chc.equalsIgnoreCase("y"));
            System.out.print("Here is the total of your order: " + total);
        }

    }
}
