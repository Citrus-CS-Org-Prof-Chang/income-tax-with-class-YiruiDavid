package edu.pasadena.cs.cs03b;

public class TaxTableTools {
    private int[] salaryBrackets;
    private double[] taxRates;

    public void setTaxTable(int[] salaryBrackets, double[] taxRates) {
        this.salaryBrackets = salaryBrackets;
        this.taxRates = taxRates;
    }

    public double getTaxRate(int income) {
        for (int i = 0; i < salaryBrackets.length; i++) {
            if (income < salaryBrackets[i]) {
                return taxRates[i - 1];
            }
        }
        return taxRates[taxRates.length - 1];
    }
}
