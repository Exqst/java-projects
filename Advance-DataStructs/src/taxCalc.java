public class taxCalc {
public static double taxCalculator(double income, double[][] taxBrackets,double storage){
    double result;
    double temp;
    double tempIncome;
    //for 0 to 10k
    if(income > taxBrackets[0][0] && income <= taxBrackets[1][0]){
        result = income * taxBrackets[0][1];
        if (storage > 0){
            result = storage + result;
            return result;
        }
        return result;
    }
    //For 10k to 20k
    else if (income > taxBrackets[1][0] && income <= taxBrackets[2][0]) {
        tempIncome = income - taxBrackets[1][0];
        temp = taxBrackets[1][0] * taxBrackets[1][1];
        temp = temp + storage;
        return taxCalculator(tempIncome, taxBrackets, temp);
    }
    //For 20k to 50k
    else if (income > taxBrackets[2][0] && income <= taxBrackets[3][0]){
        tempIncome = income - taxBrackets[2][0];
        temp = taxBrackets[2][0] * taxBrackets[2][1];
        temp = temp + storage;
        return taxCalculator(tempIncome, taxBrackets, temp);
    }
    //For > 50k
    else if (income > taxBrackets[3][0]){
        tempIncome = income - taxBrackets[3][0];
        temp = taxBrackets[3][0] * taxBrackets[3][1];
        temp = temp + storage;
        return taxCalculator(tempIncome, taxBrackets, temp);
    }
    return 0.0;

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

        if(taxCalculator(5000,brackets, 0) == 500){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(5000,brackets, 0));
        }
        if (taxCalculator(10000,brackets, 0) == 1000){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(10000,brackets, 0));
        }
        if (taxCalculator(20000,brackets, 0) == 2500){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(20000,brackets, 0));
        }
        if (taxCalculator(50000,brackets, 0) == 11000){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(50000,brackets, 0));
        }
        if(taxCalculator(55000,brackets,0) == 18000){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect the result is " + taxCalculator(55000,brackets,0));
        }

    }

}
