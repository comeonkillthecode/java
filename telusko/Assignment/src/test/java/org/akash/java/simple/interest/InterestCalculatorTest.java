package simple.intrest;

import org.akash.java.simple.interest.CompoundInterestCalculator;
import org.akash.java.simple.interest.InterestCalculator;
import org.akash.java.simple.interest.SimpleInterestCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterestCalculatorTest {
    private InterestCalculator interestCalculator =  null;
    @Test
    void testSimpleInterestCalculator(){
        interestCalculator = new SimpleInterestCalculator();

        assertEquals(1200, interestCalculator.calculateInterest(10000,12,1));
    }

    @Test
    void testCompoundInterestCalculator(){
        interestCalculator = new CompoundInterestCalculator();
        assertEquals(1200.0000476837158, interestCalculator.calculateInterest(10000,12,1));
    }
}
