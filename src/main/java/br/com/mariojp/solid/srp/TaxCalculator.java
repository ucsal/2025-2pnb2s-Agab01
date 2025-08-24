package br.com.mariojp.solid.srp;

public class TaxCalculator {
	
	private double rate;


    public TaxCalculator() {
        String taxRateStr = System.getProperty("tax.rate", "0.10"); // se não setar, assume 10%
        this.rate = Double.parseDouble(taxRateStr);
    }

  
    public double calculate(double subtotal) {
        return subtotal * rate;
    }

}