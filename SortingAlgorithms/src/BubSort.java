import java.util.InputMismatchException;
import java.util.Scanner;

public class BubSort {
    void BubbleSort(int arr[], int n){
        if (n == 1){            //Check if the n is equal to the last element and no more passes can be done
            return;
        }

        for (int i = 0; i < n-1; i++){      //iteration for unchecked elements
            if (arr[i] > arr[i+1]){         //Check if the elements are in their correct position if not then swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        BubbleSort(arr, n-1);   //one pass is done and return again until n == 1
    }

    void display(int arr[]){
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        BubSort obj = new BubSort();
        int size;

        System.out.print("Welcome to the program please enter the size of the array: ");
        try {
        size = in.nextInt();
        int arr[] = new int[size];
        if (size == 1 || size == 0){
            System.out.print("Please input a larger number than 0 or 1. Thanks, terminating program.");
            System.exit(0);
        }
        for (int i = 0; i < size; i++){
            System.out.print("Please enter the numbers: ");
            try {
                arr[i] = in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Please enter a number next time. Terminating program");
                System.exit(0);
            }
        }
            obj.BubbleSort(arr, arr.length);
            obj.display(arr);
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number next time. Terminating program");
            System.exit(0);
        }
    }
}
