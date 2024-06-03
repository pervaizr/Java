package com.InheritanceChallengeWorker;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate,
                            String hireDate, double annualSalary) {
        super(name, birthDate,  hireDate);
        this.annualSalary = annualSalary;

    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary/26;
        double adjustedPay = (isRetired ? 0.9 * payCheck : payCheck);

        return (int)(adjustedPay);

    }

    //collectPay

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;

    }
}
