package edu.pasadena.cs.cs03b;
import java.util.Scanner;
public class Dummy {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO: add you logic here
		 int[] salaryBrackets = {0, 20000, 50000, 100000, Integer.MAX_VALUE};
=======
		int[] salaryBrackets = {0, 20000, 50000, 100000, Integer.MAX_VALUE};
>>>>>>> 49bd0e8 (Income Tax Calculation)
        double[] taxRates = {0.0, 0.10, 0.20, 0.30, 0.40};

        TaxTableTools tool = new TaxTableTools();
        tool.setTaxTable(salaryBrackets, taxRates);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter annual income (-1 to exit): ");
            int income = scanner.nextInt();
            if (income == -1) break;

            double rate = tool.getTaxRate(income);
            double tax = income * rate;

            System.out.println("Annual Income: " + income + 
                               " Tax rate: " + rate +
                               " Tax to pay: " + tax);
        }
        scanner.close();
    }

    public static int dummy() {
        return 0 ;
    }
}

	
