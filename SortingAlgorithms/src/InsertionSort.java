public class InsertionSort {
    static void InsertSort(int arr[], int n){
        if (n <= 1){ //checker
            return;
        }

        InsertSort(arr, n-1); //calls to check the elements

        int last = arr[n-1];    //last element of the array
        int j = n-2;            //Correct index of the last element of the array

        while (j >=0 && arr[j] > last){ //Finding the correct index of the last element of the array
            arr[j+1] = arr[j]; //Moving selection by 1 of the correct index is not yet found
            j--;
        }
        arr[j+1] = last; //Places the last element to its correct index
    }
    void display(int arr[]){
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {42, 22, 25, 161, 29};

        InsertSort(arr, arr.length);
        InsertionSort obj = new InsertionSort();
        obj.display(arr);
    }
}
