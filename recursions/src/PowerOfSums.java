import java.util.Scanner;

public class PowerOfSums {
    public static int PowerSum(int x, int n, int current, int carry, int counter){
        int sum;
        sum = carry + (int)Math.pow(current, n);

        if(sum == x){
            return 1;
        }
        if(sum > x){
            return 0;
        }

        counter += PowerSum(x, n, current + 1, sum, 0);
        counter += PowerSum(x, n, current + 1, carry, 0);

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner power = new Scanner(System.in);
        System.out.print("Please enter the integer: ");
        int num = in.nextInt();
        System.out.print("Please enter the power: ");
        int pow = power.nextInt();

        System.out.print(PowerSum(num, pow, 1,0,0));
    }
}
