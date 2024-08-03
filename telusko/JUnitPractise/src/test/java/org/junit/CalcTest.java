package org.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testDivide(){
        Calc calc = new Calc();

        int result = calc.divide(4,2);
        Assertions.assertEquals(2, result);
    }

}
