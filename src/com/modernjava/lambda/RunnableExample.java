package com.modernjava.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        // below Runnable implementation using inner class
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i=0;i<=10;i++)
                    sum += i;
                System.out.println("Traditional "+sum);
            }
        };
        new Thread(runnable).start();

        // Using Lambda
        Runnable runnable1 = ()->{
            int sum = 0;
            for(int i=0;i<=10;i++)
                sum += i;
            System.out.println("Runnable Lambda Implementation "+sum);
        };
        new Thread(runnable1).start();

        // Implement using Thread with Lambda

        new Thread(
                ()->{
                    int sum = 0;
                    for(int i=0;i<=10;i++)
                        sum += i;
                    System.out.println("Thread Lambda Implementation "+sum);
                }
        ).start();
    }
}
