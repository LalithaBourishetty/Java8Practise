package com.modernjava.realtimebankexample;

public interface AccountFactory {
    public BankAccount getBankAccount(int id,double balance,String name);
}