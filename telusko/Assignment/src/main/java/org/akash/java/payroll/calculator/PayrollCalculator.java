package org.akash.java.payroll.calculator;

public class PayrollCalculator {
    private static final int REGULAR_HOURS = 8;
    private static final double REGULAR_PAY_PER_HOUR = 100;
    private static final double OVERTIME_PAY_PER_HOUR = 150;

    public double calculatePay(int hoursWorked){
        if(hoursWorked <= REGULAR_HOURS){
            return REGULAR_PAY_PER_HOUR * hoursWorked;
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            return (REGULAR_PAY_PER_HOUR * REGULAR_HOURS) + overtimeHours * OVERTIME_PAY_PER_HOUR;
        }
    }

}
