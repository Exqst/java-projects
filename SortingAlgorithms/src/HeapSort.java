public class HeapSort {
    public void heapSort(int arr[]){
        int tempo;

        for (int i = arr.length / 2 - 1; i>=0; i--){    //Building the heap
            heapify(arr, arr.length, i);
        }

        for(int i = arr.length - 1; i>=0; i--){     //Getting the elements
            tempo = arr[0];
            arr[0] = arr[i];
            arr[i] = tempo;             //Moving off elements
            heapify(arr, i ,0);      //Called heapify to rebuild the heap for any remaining elements
        }
    }

    void heapify(int arr[], int n, int i){
        int MAX = i;    //Initializing the root node
        int left = 2 * i + 1;   //Initializing the left of the root node
        int right = 2 * i + 2;  //Initializing the right of the root node
        int tempo;

        if(left < n && arr[left] > arr[MAX]){   //Checker if the left is larger than the root node if yes then switch
            MAX = left;
        }
        if(right < n && arr[right] > arr[MAX]){ //Checker if the right is larger than the root node if yes then switch
            MAX = right;
        }

        if (MAX != i){  //if the left or right is not larger than the root node then this code will rearrange the other elements
            tempo = arr[i];
            arr[i] = arr[MAX];
            arr[MAX] = tempo;
            heapify(arr, n, MAX);   //Recalled again to check if the elements of the left or right of the root node is bigger
        }
    }

    void display(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 25, 23, 13, 2, 9, 28};

        HeapSort obj = new HeapSort();
        obj.heapSort(arr);
        obj.display(arr);
    }
}
