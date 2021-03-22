package io.github.girirajvyas.pojo;

import java.util.Arrays;
import java.util.List;

public enum ProcessingYear {
    TWO_THOUSAND_EIGHTEEN(2018, Arrays.asList(new TaxSlabRange(0, 1_00_000, 0), new TaxSlabRange(1_00_001, 5_00_000, 10), new TaxSlabRange(5_00_001, 10_00_000, 20), new TaxSlabRange(10_00_001, Integer.MAX_VALUE, 30)), null, new Cess(5_00_000, 1), 1_00_000),
    TWO_THOUSAND_NINETEEN(2019, Arrays.asList(new TaxSlabRange(0, 1_00_000, 0), new TaxSlabRange(1_00_001, 6_00_000, 10), new TaxSlabRange(6_00_001, 12_00_000, 20), new TaxSlabRange(12_00_001, Integer.MAX_VALUE, 30)), new SeniorCitizen(60, 50_000), new Cess(5_00_000, 2), 1_00_000),
    TWO_THOUSAND_TWENTY(2020, Arrays.asList(new TaxSlabRange(0, 1_00_000, 0), new TaxSlabRange(1_00_001, 10_00_000, 15), new TaxSlabRange(10_00_001, Integer.MAX_VALUE, 25)), new SeniorCitizen(60, 75_000), new Cess(5_00_000, 5), 1_00_000);

    private int processingYear;
    private List<TaxSlabRange> taxSlabRanges;
    private SeniorCitizen seniorCitizen;
    private Cess cess;
    private int allowedInvestmentDeductions;

    ProcessingYear(Integer processingYear, List<TaxSlabRange> taxSlabRanges, SeniorCitizen seniorCitizen, Cess cess, int allowedInvestmentDeductions) {
        this.taxSlabRanges = taxSlabRanges;
        this.processingYear = processingYear;
        this.seniorCitizen = seniorCitizen;
        this.cess = cess;
        this.allowedInvestmentDeductions = allowedInvestmentDeductions;
    }

    public int getProcessingYear() {
        return processingYear;
    }

    public void setProcessingYear(int processingYear) {
        this.processingYear = processingYear;
    }

    public List<TaxSlabRange> getTaxSlabRanges() {
        return taxSlabRanges;
    }

    public void setTaxSlabRanges(List<TaxSlabRange> taxSlabRanges) {
        this.taxSlabRanges = taxSlabRanges;
    }

    public SeniorCitizen getSeniorCitizen() {
        return seniorCitizen;
    }

    public void setSeniorCitizen(SeniorCitizen seniorCitizen) {
        this.seniorCitizen = seniorCitizen;
    }

    public Cess getCess() {
        return cess;
    }

    public void setCess(Cess cess) {
        this.cess = cess;
    }

    public int getAllowedInvestmentDeductions() {
        return allowedInvestmentDeductions;
    }

    public void setAllowedInvestmentDeductions(int allowedInvestmentDeductions) {
        this.allowedInvestmentDeductions = allowedInvestmentDeductions;
    }

    public  static ProcessingYear getEnum(int data) {
        for (ProcessingYear value : ProcessingYear.values()) {
            if(value.getProcessingYear() == data) {
                return value;
            }
        }
        throw new IllegalArgumentException();
    }
}
