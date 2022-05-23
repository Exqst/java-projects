import java.util.InputMismatchException;
import java.util.Scanner;

public class encaps_sample {
    private String name;
    private int pin;
    private int balance = 100;
    private int money;

    //getters
    public int getPin(){
        return pin;
    }
    public String getName(){
        return name;
    }
    public int getMoney(){
        return money;
    }
    public int getBalance(){
        return balance;
    }

    //Setters
    public void setPin(int PW){
        pin = PW;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setMoney(int price){
        money = price;
    }
    public void setBalance(int newBalance){
        balance = newBalance;
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int opt;
        int peso;
        encaps_sample obj = new encaps_sample();
        obj.setName("Raymond");
        System.out.print("Welcome! Please enter your pin: ");
        obj.setPin(in.nextInt());
        if (obj.getPin() != 1234){
            System.out.print("Wrong pin. Terminating program");
            System.exit(0);
        }

        System.out.println("Welcome " + obj.getName());
        System.out.println("What would you like to do with your balance?");
        System.out.print("1. Withdraw 2. Deposit ");
        opt = in.nextInt();
        if (opt == 1){
            System.out.print("How much would you like to withdraw? ");
            try {
                obj.setMoney(in.nextInt());
                if (obj.getBalance() > obj.getMoney()){
                    obj.setBalance(obj.getBalance() - obj.getMoney());
                }
                else{
                    System.out.print("Insufficient funds please deposit first. Terminating program");
                    System.exit(0);
                }
            }catch (InputMismatchException e){
                System.out.print("Invalid input");
                System.exit(0);
            }
        }
        else if (opt == 2){
            System.out.print("How much would you like to deposit? ");
            obj.setMoney(in.nextInt());
            obj.setBalance(obj.getBalance() + obj.getMoney());
        }
        else {
            System.out.print("Invalid option. Terminating program");
        }
        System.out.print("Thanks for using the balance your remaining balance is " + obj.getBalance());
    }
}
