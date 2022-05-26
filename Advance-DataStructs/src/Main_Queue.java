import java.util.*;
public class Main_Queue {

    public static void main(String[] args) {
        Queue queue1 = new LinkedList(); //can use Queue<Integer> queue1 = new LinkedList<Integer>(); to be more specific on what data type
        Scanner in = new Scanner(System.in);
        int size;
        System.out.println("Welcome to the program! ");
        System.out.print("How long is the queue: ");
        size = in.nextInt();
        int [] arrayInt = new int[size];
        System.out.print("Please enter the numbers in queue: ");
        for (int i = 0; i<size; i++){
            arrayInt[i] = in.nextInt();
            queue1.add(arrayInt[i]);
        }

        System.out.println("Current queue: " + queue1);
        System.out.println("Removed element: " + queue1.remove());
        System.out.println("New head of the queue: " + queue1.peek());
        System.out.println("Final queue: " + queue1);
    }
}
