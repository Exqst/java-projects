public class SelSort {
    void SelectSort(int arr[]){
        int pos;
        int temp;
        for(int i = 0; i<arr.length;i++){
            pos = i;
            for (int j = i + 1; j<arr.length;j++){
                if (arr[j] < arr[pos]){         //Checker of the index of the smallest element
                    pos = j;
                }
            }
            temp = arr[pos];        //Swappers
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    void display(int arr[]){
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[] args){
        SelSort obj = new SelSort();
        int arr[] = {33, 55, 66, 62, 22, 1, 9, 10};
        obj.SelectSort(arr);
        obj.display(arr);
    }
}
