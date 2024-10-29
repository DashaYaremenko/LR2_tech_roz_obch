package org.example.lr2_tech_roz_obch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void calculate() {
        Function f = new Function();
        double test1=4.0;
        double expected1=3*Math.sqrt(test1);
        assertEquals(expected1,f.calculate(test1),1e-9);

        double test2=9.0;
        double expected2=3*Math.sqrt(test2);
        assertEquals(expected2,f.calculate(test2),1e-9);

        double test3=1.5;
        double expected3=3*Math.sqrt(test3);
        assertEquals(expected3,f.calculate(test3),1e-9);
    }
}