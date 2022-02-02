package com.modernjava.lambda;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingLambda {
    public static int[] intArray=IntStream.rangeClosed(0,5000).toArray();
    public static long arrayCount=IntStream.rangeClosed(0,5000).sum();
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable callable = ()->{
            int sum=0;
            for(int i=0;i<intArray.length/2;i++)
                sum += i;
            return sum;
        };
        Callable callable1 = ()->{
            int sum=0;
            for(int i=intArray.length/2;i<intArray.length;i++)
                sum += i;
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> callableList = Arrays.asList(callable,callable1);
        List<Future<Integer>> futureList = executorService.invokeAll(callableList);
        int sum =0;
        int k=0;
        for (Future<Integer> value: futureList) {
            sum += value.get();
            System.out.println("Sum of "+ ++k +" is "+ value.get());
        }

        System.out.println("total sum of integers using callable "+sum);
        System.out.println("total sum of integers using IntStream "+arrayCount);
        executorService.shutdown();
    }

}
