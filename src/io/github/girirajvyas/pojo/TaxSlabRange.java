package io.github.girirajvyas.pojo;

public class TaxSlabRange
{
    private int low;
    private int high;
    private int taxPercentage;

    public TaxSlabRange(int low, int high, int taxPercentage) {
        this.low = low;
        this.high = high;
        this.taxPercentage = taxPercentage;
    }

    public TaxSlabRange(int low, int high){
        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}
