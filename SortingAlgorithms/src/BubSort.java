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
        BubSort obj = new BubSort();
        int arr[] = {15, 21, 23, 17, 1, 82, 12, 19};
        obj.BubbleSort(arr, arr.length);
        obj.display(arr);
    }
}
