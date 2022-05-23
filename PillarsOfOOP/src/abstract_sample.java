import javax.swing.text.Style;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class inputOfName{
    public abstract void asker();
    public abstract void withdrawal();
}

class inputName extends inputOfName{
    String name = "Raymond";
    int pin = 1234;
    Scanner in = new Scanner(System.in);
    int balance = 1000000;
    int opt;
    int money;
    public void asker(){
        System.out.println("May I please know your pin? ");
        pin = in.nextInt();

        if(pin != 1234){
            System.out.println("Sorry invalid pin. Terminating program.");
            System.exit(0);
        }
    }
    public void withdrawal(){
        System.out.println("Good day " + name +". Welcome to the bank");
        System.out.println("What would you like to do?");
        System.out.print("1. Withdraw 2. Deposit ");
        opt = in.nextInt();
        switch (opt){
            case 1:
                System.out.print("How much would you like to withdraw? ");
                try {
                    money = in.nextInt();
                    if (balance < money){
                        System.out.print("Sorry you have insufficient funds please deposit first.");
                        System.exit(0);
                    }
                    balance = balance - money;
                }catch (InputMismatchException e){
                    System.out.print("Invalid input, terminating program");
                }
                System.out.print("Your new balance is: " + balance);
                break;
            case 2:
                System.out.print("How much would you like to deposit? ");
                try{
                    money = in.nextInt();
                    balance += money;
                }catch (InputMismatchException e){
                    System.out.print("Invalid input, terminating program");
                }
                System.out.print("Your new balance is: " + balance);
                break;
            default:
                System.out.print("Invalid option terminating program.");
                System.exit(0);
        }
    }
}

public class abstract_sample{
    public static void main (String[] args){
        inputName inName = new inputName();
        inName.asker();
        inName.withdrawal();
    }
}
