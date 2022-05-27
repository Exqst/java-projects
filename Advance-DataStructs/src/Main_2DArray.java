import java.util.Scanner;
public class Main_2DArray {
    public static int HrGlassSum(int arr[][]){
        int MaxValue = Integer.MIN_VALUE;
        int total = 0;
        for (int i = 0; i<4;i++){
            for (int j = 0; j < 4; j++){
                total = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                total += arr[i+1][j+1];
                total += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                System.out.print(total + " ");
                MaxValue = total>MaxValue?total:MaxValue;
            }
        }
        return MaxValue;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Array2D[][] = new int[6][6];

        for (int i = 0; i < 6; i++){
            for (int j = 0; j<6; j++){
                Array2D[i][j] = in.nextInt();
            }
        }
        System.out.println(HrGlassSum(Array2D));
    }
}