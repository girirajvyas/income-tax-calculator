package io.github.girirajvyas.app;

import io.github.girirajvyas.pojo.ProcessingYear;
import io.github.girirajvyas.pojo.TaxLiability;
import io.github.girirajvyas.pojo.TaxPayerIndividual;
import io.github.girirajvyas.pojo.TaxSlabRange;

public class TaxCalculator {

    public static TaxLiability processTax(TaxPayerIndividual individual, ProcessingYear processingYear) {

        Integer grossIncome = calculateGrossAfterDeductions(individual, processingYear);
        System.out.println("Gross Income: " + grossIncome);
        Integer grossFinalIncome = calculateGrossAfterSeniorCitizenDeductionIfApplicable(grossIncome, individual.getAge(), processingYear);
        System.out.println("Gross final income considering senior citizen deduction: " + grossFinalIncome);
        double taxAmount = calculateTax(grossFinalIncome, processingYear);
        System.out.println("Total Tax Amount" + taxAmount);
        double cess = calculateCessAmount(taxAmount, processingYear);
        System.out.println("Total cess amount" + cess);
        TaxLiability taxLiability = new TaxLiability(taxAmount,cess);
        System.out.println("Total tax:" + taxLiability.getTotalTax() );
        return taxLiability;
    }

    private static double calculateCessAmount(double taxAmount, ProcessingYear processingYear) {
        double cess = 0.0;
        if (taxAmount > processingYear.getCess().getThresholdTaxAmount()) {
            cess = 0.01*processingYear.getCess().getCessPercentage()*taxAmount;
        }

        return cess;
    }

    private static Integer calculateGrossAfterDeductions(TaxPayerIndividual individual, ProcessingYear processingYear) {
        return individual.getSalary() - (individual.getInvestments() > processingYear.getAllowedInvestmentDeductions() ? processingYear.getAllowedInvestmentDeductions() : individual.getInvestments());
    }

    private static Integer calculateGrossAfterSeniorCitizenDeductionIfApplicable(Integer grossIncome, Integer age, ProcessingYear processingYear) {
        return grossIncome - (age >= processingYear.getSeniorCitizen().getAgeCriteria() ? processingYear.getSeniorCitizen().getEligibleDeduction() : 0);
    }

    private static double calculateTax(Integer grossFinalIncome, ProcessingYear processingYear) {
        double tax = 0;
        for (TaxSlabRange taxSlabRange: processingYear.getTaxSlabRanges()) {
            if(taxSlabRange.getLow() > grossFinalIncome) {
                // not eligible for tax slab hence break
                break;
            }
            if (taxSlabRange.getHigh() < grossFinalIncome) {
                tax = tax + ((taxSlabRange.getHigh() - taxSlabRange.getLow())*(0.01*taxSlabRange.getTaxPercentage()));
            } else if (taxSlabRange.getHigh() > grossFinalIncome) {
                tax = tax + ((grossFinalIncome - taxSlabRange.getLow())*(0.01*taxSlabRange.getTaxPercentage()));
            }
        }
        return tax;
    }
}
