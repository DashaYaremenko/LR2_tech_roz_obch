package org.example.lr2_tech_roz_obch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CalculateIntegral {
    public double calculateIntegral(double a, double b, int n, int nThreads, Function fun ) throws InterruptedException, ExecutionException {
        double h=(b-a)/n;
        ExecutorService executorService= Executors.newFixedThreadPool(nThreads);
        List<Future<Double>> futures= new ArrayList<>();
        for (int i=0; i<nThreads; i++) {
            final int threadInd=i;
            futures.add(executorService.submit(()->{
                double sum = 0;
                for (int j=threadInd; j<n; j+=nThreads) {
                    double x=a+j*h;
                    sum+=fun.calculate(x)*h;
                }
                return sum;
            }));
        }
        double result = 0;
        for (Future<Double> future : futures) {
            result += future.get();
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MICROSECONDS);
        return result;
    }
}

