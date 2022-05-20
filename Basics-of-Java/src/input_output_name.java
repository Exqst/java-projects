import java.util.Scanner;

public class input_output_name {
    public static void main(String[] args){
        String name;
        Scanner in = new Scanner(System.in);

        System.out.print("Can you please enter your name: ");
        name = in.nextLine();
        System.out.print("Hello there " + name);
    }
}
