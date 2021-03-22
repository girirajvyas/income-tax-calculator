package io.github.girirajvyas.pojo;

public class Cess {

    private int thresholdTaxAmount;
    private int cessPercentage;

    public Cess(int thresholdTaxAmount, int cessPercentage) {
        this.thresholdTaxAmount = thresholdTaxAmount;
        this.cessPercentage = cessPercentage;
    }

    public int getThresholdTaxAmount() {
        return thresholdTaxAmount;
    }

    public void setThresholdTaxAmount(int thresholdTaxAmount) {
        this.thresholdTaxAmount = thresholdTaxAmount;
    }

    public int getCessPercentage() {
        return cessPercentage;
    }

    public void setCessPercentage(int cessPercentage) {
        this.cessPercentage = cessPercentage;
    }
}

