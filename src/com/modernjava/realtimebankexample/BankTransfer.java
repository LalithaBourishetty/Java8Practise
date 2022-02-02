package com.modernjava.realtimebankexample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {
        AccountFactory accountFactory=BankAccount::new;
        BankAccount studentBankAccount = accountFactory.getBankAccount(1,50000,"StudentA");
        BankAccount universityBankAccount = accountFactory.getBankAccount(2,100000,"UniversityA");

        BiPredicate<Double,Double> p1=(balance,amount)-> balance>amount;
        BiConsumer<String,Double> printer = (x,y) ->System.out.println(x+y);
        BiConsumer<BankAccount,BankAccount> printer2= (student,university) ->
        System.out.println("Ending balance of student account "+studentBankAccount.getBalance()+" and university account "+universityBankAccount.getBalance());

        ExecutorService service = Executors.newFixedThreadPool(10);

        Thread t= new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" says :: Executing transfer");
            try {
                double amount = 1000;
                if (!p1.test(studentBankAccount.getBalance(), amount)) {
                    printer.accept(Thread.currentThread().getName() + " says :: Balance insufficient,", amount);
                    return;
                }
                while (!studentBankAccount.transfer(universityBankAccount, amount)) {
                    TimeUnit.MILLISECONDS.sleep(1000);
                    continue;
                }
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        });
        printer.accept(Thread.currentThread().getName()+ " says :: transfer is successful : Balance in account "
                ,universityBankAccount.getBalance());

        for(int i=0;i<20;i++){
            service.submit(t);
        }
        service.shutdown();
        try {
            while (!service.awaitTermination(24L, TimeUnit.HOURS)) {
                System.out.println("Not yet.Still waiting for termination");
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        printer2.accept(studentBankAccount,universityBankAccount);
    }
}
