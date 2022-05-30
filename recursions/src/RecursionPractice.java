import java.util.Scanner;

public class RecursionPractice {
    void NumPrint(int num){
        if (num != 0){
            System.out.println(num);
            num--;
            NumPrint(num);
        }
    }
    int CatEyes(int cats){
        if(cats !=0){
            cats--;
            return 2 + CatEyes(cats);
        }
        else {
            return 0;
        }
    }
    int Power(int base, int power){
        if(power != 1){
            return base * Power(base, power-1);
        }
        else{
            return base;
        }
    }
    int factorial(int base){
        if( base !=1){
            return base * factorial(base-1);
        }
        else{
            return base;
        }
    }
    int fibo(int base){
        if(base == 0){
            return 0;
        }
        if (base == 1){
            return 1;
        }
        else {
            return fibo(base -1 ) + fibo(base - 2);
        }
    }
    int mobilePh(int number){
        if(number != 0){
            if(number % 2 ==0){
                return 2 + mobilePh(number-1);
            }else {
                return 1 + mobilePh(number - 1);
            }
        }
        else{
            return 0;
        }
    }
    int sum(int num){
        if(num <= 9){
            return num;
        }
        else {
            return num % 10 + sum(num / 10);
        }
    }
    int fiveCounter (int num){
        if(num <= 9){
            if(num == 5){
                return 1;
            }else {
                return 0;
            }
        }
        else{
            if (num % 10 == 5){
                return 1 + fiveCounter(num / 10);
            }else {
                return 0 + fiveCounter(num / 10);
            }
        }
    }
    void ReverseString(char[] str, int index){
        if(str == null || index >= str.length){
            return;
        }
        ReverseString(str, index + 1);
        System.out.print(str[index]);

    }
    String StringReversal(String str){
        if(str.isEmpty()){
            return str;
        }
        return StringReversal(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {
        RecursionPractice RP = new RecursionPractice();
        int num = 5;
        int powa = 2;
        int fibonacci = 10;
        int SummationOfNumber = 123;
        int FiveCounter = 13555235;
        char [] string = {'O','r','a','c','l','e'};
        String str = "Recursion";
        String reversed = RP.StringReversal(str);
        //1st problem
        RP.NumPrint(num);
        //2nd Problem
        System.out.println("Cat eyes: " + RP.CatEyes(num));
        //3rd Problem
        System.out.println("Answer: "+ RP.Power(num,powa));
        //4th Problem
        System.out.println("Factorial Answer: " + RP.factorial(num));
        //5th Problem
        System.out.println("Fibonacci Sequence up to " + fibonacci + ": " + RP.fibo(fibonacci));
        //6th Problem
        System.out.println("Mobile Number speakers total: " + RP.mobilePh(num));
        //7th Problem
        System.out.println("Sum of number: " + RP.sum(SummationOfNumber));
        //8th Problem
        System.out.println("The number of five for " + FiveCounter + " is: " + RP.fiveCounter(FiveCounter));
        //Custom Problems
        System.out.print("The reverse string is: ");RP.ReverseString(string, 0);System.out.println("");
        System.out.println("The reverse string of " + str + " is: " + reversed);
    }
}