public class MergeSort {
    void merge (int arr[], int left, int middle, int right){
        int low = middle - left + 1; //size of the left storage
        int high = right - middle; //Size of the right storage

        int L [] = new int[low]; //Initialization of left
        int R [] = new int[high];//Initialization of right

        int i = 0, j = 0;

        for (i = 0;i < low;i++){    //Copy the elements to left storage
            L[i] = arr[left + i];
        }
        for (j = 0;j < high;j++){   //Copy the elements to right storage
            R[j] = arr[middle + 1 +j];
        }

        int k = left; //Starting index to sort
        i = 0;
        j = 0;
        //^ Just to reset the value of the looping variables

        while (i < low&&j < high)   //Merging the left
        {
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < low)         //Merging the right
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < high)
        {
           arr[k] = R[j];
           j++;
           k++;
        }
    }

    void mergeSort(int arr[], int left, int right){ //Predefined function
        int middle;
        if(left < right){   //Sort only if the left is less than the right storage
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);       //Sort the left
            mergeSort(arr, middle + 1, right);  //Sorth the right

            merge(arr, left, middle, right); //Merge the 2
        }
    }

    void display(int arr[]){ //Displaying the array
        for (int i=0; i<arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){ //Main Program
        int arr[] = {10, 2, 61, 25, 25, 60};
        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length-1);
        ob.display(arr);
    }

}
