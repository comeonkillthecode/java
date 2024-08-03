package org.akash.java.simple.interest;

public class CompoundInterestCalculator implements InterestCalculator{
    @Override
    public double calculateInterest(long principle, float annualInterestRate, int durationInYears) {
        annualInterestRate = annualInterestRate/100;
        return principle*Math.pow(1+annualInterestRate, durationInYears) - principle;
    }
}
