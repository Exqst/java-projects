import java.util.InputMismatchException;
import java.util.Scanner;

public class input_output_math {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Scanner chc = new Scanner(System.in);//New scanner for choice since it intakes the last value of "in" idk why
        String name;
        int num1 = 0, num2 = 0, result = 0;
        String choice;

        System.out.print("Welcome to the program! ");
        System.out.print("Can you please enter your name: ");
        name = in.nextLine();
        System.out.print("Hello there " + name + ", please enter the first number: ");
        try {//For error Catching
            num1 = in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please enter a number next time. Terminating program");
            System.exit(0);
        }
        System.out.print("Great now please enter the second number: ");
        try { //For error Catching
            num2 = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter a number next time. Terminating program");
            System.exit(0);
        }
        System.out.println("What would you like to do with them? (Add, Subtract, Multiply, or Divide): ");
        //System.out.println("1. Add" + newLine +"2. Subtract" + newLine +"3. Multiply" +newLine + "4. Divide");
        choice = chc.next();

        if (choice.equalsIgnoreCase("add")){
            result = num1 + num2;
            System.out.print("The answer is: " + result);
        }
        else if(choice.equalsIgnoreCase("subtract")){
            result = num1 - num2;
            System.out.print("The answer is: " + result);
        }
        else if(choice.equalsIgnoreCase("multiply")){
            result = num1*num2;
            System.out.print("The answer is: " + result);
        }
        else if(choice.equalsIgnoreCase("divide")){
            if (num2 == 0) {//Manual error catching for dividend 0 instead of using ArithmeticException
                System.out.print("Sorry we cannot divide by 0. Ending program ");
            }
            else {//Proceeds when the dividend is not 0
                result = num1/num2;
                System.out.print("The answer is: " + result);
            }
        }
        else{
            System.out.print("Sorry invalid answer. Ending program");
        }
    }
}
