package io.github.girirajvyas.pojo;

public class SeniorCitizen {

    private int ageCriteria;
    private int eligibleDeduction;

    public SeniorCitizen(int ageCriteria, int eligibleDeduction) {
        this.ageCriteria = ageCriteria;
        this.eligibleDeduction = eligibleDeduction;
    }

    public int getAgeCriteria() {
        return ageCriteria;
    }

    public void setAgeCriteria(int ageCriteria) {
        this.ageCriteria = ageCriteria;
    }

    public int getEligibleDeduction() {
        return eligibleDeduction;
    }

    public void setEligibleDeduction(int eligibleDeduction) {
        this.eligibleDeduction = eligibleDeduction;
    }
}
