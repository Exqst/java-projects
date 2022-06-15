public class taxCalc {
public static double taxCalculator(double income, double[][] taxBrackets){
    double result;
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
        if(tempIncome > taxBrackets[0][0] && tempIncome <= taxBrackets[1][0]){
            result = tempIncome * taxBrackets[0][1];
            result = temp + result;
            return result;
        }
    }
    /*//For 20k to 50k
    else if (income > taxBrackets[2][0] && income <= taxBrackets[3][0]){
        tempIncome = income - taxBrackets[2][0];
        temp = tempIncome * taxBrackets[2][1];
        return taxCalculator(tempIncome, taxBrackets);
        //if still within 20 to 50
        /*if(tempIncome > taxBrackets[2][0] && tempIncome <= taxBrackets[3][0]){
            tempIncome = tempIncome - taxBrackets[2][0];
            temp = (tempIncome * taxBrackets[2][1]) + temp;
            if(tempIncome > taxBrackets[1][0] && tempIncome <= taxBrackets[2][0]){//if 10 to 20
                tempIncome = tempIncome - taxBrackets[1][0];
                temp = (tempIncome * taxBrackets[1][1]) + temp;
                if(tempIncome > taxBrackets[0][0] && tempIncome <= taxBrackets[1][0]){//if 0 to 10
                    result = tempIncome * taxBrackets[0][1];
                    result = temp + result;
                    return result;
                }
            }
        }
        else if(tempIncome > taxBrackets[1][0] && tempIncome <= taxBrackets[2][0]){//if 10 to 20
            tempIncome = tempIncome - taxBrackets[1][0];
            temp = (tempIncome * taxBrackets[1][1]) + temp;
            if(tempIncome > taxBrackets[0][0] && tempIncome <= taxBrackets[1][0]){//if 0 to 10
                result = tempIncome * taxBrackets[0][1];
                result = temp + result;
                return result;
            }
        }
        else if(tempIncome > taxBrackets[0][0] && tempIncome <= taxBrackets[1][0]){
            result = tempIncome * taxBrackets[0][1];
            return result;
        }
    }*/
    return 0.0;
    //return taxCalculator(result, taxBrackets);

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
