public class taxCalc {
public static double taxCalculator(double income, double[][] taxBrackets){
    double result = 0;
    double temp;
    double tempIncome;
    //for 0 to 10k
    if(income > taxBrackets[0][0] && income <= taxBrackets[1][0]){
        result = income * taxBrackets[0][1];
        return result;

    }
    //For 10k to 20k
    else if (income > taxBrackets[1][0] && income <= taxBrackets[2][0]) {
        tempIncome = income - taxBrackets[1][0];
        temp = tempIncome * taxBrackets[1][1];
        if(income > taxBrackets[0][0] && income <= taxBrackets[1][0]){
            result = income * taxBrackets[0][1];
            result += temp;
            return result;
        }
    }
    /*//For 20k to 50k
    else if (income > taxBrackets[2][0] && income <= taxBrackets[3][0]){
        tempIncome = income - taxBrackets[2][0];
        temp = tempIncome * taxBrackets[2][1];
        if (income > taxBrackets[2][0] && income > taxBrackets[3][0]){
            tempIncome = income - taxBrackets[2][0];
            temp = temp + tempIncome * taxBrackets[2][1];
            if (income > taxBrackets[1][0] && income <= taxBrackets[2][0]) {
                tempIncome = income - taxBrackets[1][0];
                temp = temp + tempIncome * taxBrackets[1][1];
                if(income > taxBrackets[0][0] && income <= taxBrackets[1][0]){
                    result = income * taxBrackets[0][1];
                    result += temp;
                    return result;
                }
            }
        }
    }*/
    else{
        return 0.0;
    }
    return taxCalculator(result, taxBrackets);

}

    public static void main(String[] args) {
        double brackets[][] = new double[4][2];
        brackets[0][0] = 0;
        brackets[0][1] = .10;
        brackets[1][0] = 10000;
        brackets[1][1] = .15;
        brackets[2][0] = 20000;
        brackets[2][1] = .25;
        brackets[3][0] = 50000;
        brackets[3][1] = .35;

        if(taxCalculator(5000,brackets) == 500){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(5000,brackets));
        }
        if (taxCalculator(10000,brackets) == 1000){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(10000,brackets));
        }
        if (taxCalculator(20000,brackets) == 2500){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(20000,brackets));
        }
        if (taxCalculator(50000,brackets) == 13000){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(50000,brackets));
        }
        /*
        System.out.println();
        System.out.println(taxCalculator(55555,brackets));*/

    }

}
