package io.github.girirajvyas.pojo;

public class TaxLiability {

    private double taxAmount;
    private double cess;

    public TaxLiability(double taxAmount, double cess) {
        this.taxAmount = taxAmount;
        this.cess = cess;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getCess() {
        return cess;
    }

    public void setCess(double cess) {
        this.cess = cess;
    }

    public double getTotalTax() {
        return cess + taxAmount;
    }

	@Override
	public String toString() {
		return "TaxLiability [taxAmount=" + taxAmount + ", cess=" + cess + "]";
	}
    
    
}

