package com.cache.service;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cache.model.AccountBalance;
@Service
public class BalanceService {
@Autowired
private JpaRepository<AccountBalance, Long> repo;
@Cacheable(value = "balance", key = "#accountId")
public double getBalance(Long accountId){
return repo.findById(accountId).map(AccountBalance::getBalance).orElse(0.0);
}
}