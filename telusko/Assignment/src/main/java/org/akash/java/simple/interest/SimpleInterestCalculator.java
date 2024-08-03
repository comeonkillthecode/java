package org.akash.java.simple.interest;


public class SimpleInterestCalculator implements InterestCalculator {
    @Override
    public double calculateInterest(long principle, float annualInterestRate, int durationInYears) {
        return principle*annualInterestRate*durationInYears/100;
    }
}
