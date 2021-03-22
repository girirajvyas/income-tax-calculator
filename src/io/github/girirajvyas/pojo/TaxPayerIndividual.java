package io.github.girirajvyas.pojo;

public class TaxPayerIndividual {

    private Integer age;
    private Integer salary;
    private Integer investments;

    public TaxPayerIndividual(Integer age, Integer salary, Integer investments) {
        this.age = age;
        this.salary = salary;
        this.investments = investments;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getInvestments() {
        return investments;
    }

    public void setInvestments(Integer investments) {
        this.investments = investments;
    }
}
