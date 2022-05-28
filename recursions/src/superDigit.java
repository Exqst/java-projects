import java.util.*;
public class superDigit {

    public static void main(String[] args) {
        superDigit sd = new superDigit();
        Scanner in = new Scanner(System.in);
        String Number = in.next();
        int k = in.nextInt();

        int pSum = Integer.parseInt(sd.SuperDigit(Number));
        pSum += k;

        String Sup = Integer.toString(sd.SuperDigit(pSum));

        System.out.print(Sup);
    }

    String SuperDigit(String number){
        if(number.length() > 1){
            return number;
        }
        else{
            long sum = 0;

            for (int i = 0; i < number.length(); i++){
                sum += Character.getNumericValue(number.charAt(i));
            }

            return SuperDigit(Long.toString(sum));
        }
    }
    int SuperDigit(int k) {
        if(k / 10 == 0){
            return k;
        }
        else {
            int r = 0;
            while (k > 0){
                r += k % 10;
                k /= 10;
            }
            return SuperDigit(r);
        }
    }
}
