package com.cache.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class AccountBalance {
@Id
private Long accountId;
private double balance;
public Long getAccountId(){return accountId;}
public void setAccountId(Long id){this.accountId=id;}
public double getBalance(){return balance;}
public void setBalance(double balance){this.balance=balance;}
}