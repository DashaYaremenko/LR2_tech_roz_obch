package org.example.lr2_tech_roz_obch;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class CalculateIntegralTest {

    @Test
    void calculateIntegral() throws InterruptedException, ExecutionException {
        CalculateIntegral calc = new CalculateIntegral();
        Function func = new Function();
        double a=1.0;
        double b=9.0;
        int n=1000000;
        int nThreads=4;
        double result=calc.calculateIntegral(a,b,n,nThreads,func);
        double expectedValue=3*(2.0/3.0)*(Math.pow(b,1.5)-Math.pow(a,1.5));
        assertEquals(expectedValue,result,1e-3);
    }
}