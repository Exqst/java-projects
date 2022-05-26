import java.util.*;
public class Main_Queue {

    public static void main(String[] args) {
        Queue queue1 = new LinkedList();//can use Queue<Integer> queue1 = new LinkedList<Integer>(); to be more specific on what data type
        PriorityQueue pq1 = new PriorityQueue();
        Scanner in = new Scanner(System.in);
        Scanner pq = new Scanner(System.in);
        String yesno;
        int size, pqSize = 0;
        System.out.println("Welcome to the program! ");
        System.out.print("How long is the queue: ");
        size = in.nextInt();
        int [] arrayInt = new int[size];

        System.out.print("Are there any people with disability or senior citizens: ");
        yesno = pq.nextLine();
        if (yesno.equalsIgnoreCase("yes")){
            System.out.print("How many are there: ");
            pqSize = in.nextInt();
            int [] arrayPQ = new int[pqSize];
            System.out.println("Please enter their ticket Nos.: ");
            for (int i = 0; i<pqSize; i++){
                arrayPQ[i] = in.nextInt();
                pq1.add(arrayPQ[i]);
            }
        }

        System.out.print("Please enter the numbers in queue: ");
        for (int i = 0; i<size-pqSize; i++){
            arrayInt[i] = in.nextInt();
            queue1.add(arrayInt[i]);
        }

        System.out.println("The final queue is: " + pq1 + queue1);
    }
}
