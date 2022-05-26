import java.util.*;
public class Main_Stack {

    public static int stringCompare(String s1, String s2){
        Stack <Character> stack1 = new Stack<>();
        Stack <Character> stack2 = new Stack<>();

        char [] charArray1 = s1.toCharArray();
        char [] charArray2 = s2.toCharArray();

        int value;
        try {
            if (stack1.isEmpty()) {
                for (int i = 0; i < s1.length(); i++) {
                    if (charArray1[i] != '#') {
                        stack1.push(charArray1[i]);
                    } else if (charArray1[i] == '#') {
                        stack1.pop();
                    }
                }
            }

            if (stack2.isEmpty()) {
                for (int i = 0; i < s2.length(); i++) {
                    if (charArray2[i] != '#') {
                        stack2.push(charArray2[i]);
                    } else if (charArray2[i] == '#') {
                        stack2.pop();
                    }
                }
            }
            String newS1 = stack1.toString();
            String newS2 = stack2.toString();

            if (newS1.equalsIgnoreCase(newS2)) {
                value = 1;
            } else {
                value = 0;
            }
        }catch (EmptyStackException e){
            value = 0;
        }
        return value;
    }



    public static void main(String[] args) {
        String s1, s2;
        int result;
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        System.out.println("Welcome to the program! I will compare if both of the strings are equal.");
        System.out.println("The program will automatically set your input to lowercase");
        System.out.println("Inputting '#' will indicate as backspace.");
        System.out.print("Please enter the first string: ");
            s1 = in.nextLine();
        System.out.print("Now enter the 2nd string: ");
            s2 = in2.nextLine();

        result = stringCompare(s1, s2);

        System.out.println(result);
    }
}
