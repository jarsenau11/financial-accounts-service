package com.skillstorm.financialaccounts.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.financialaccounts.models.Accounts;
import com.skillstorm.financialaccounts.repositories.AccountsRepository;

@Service
public class AccountsService {
    
    @Autowired
    AccountsRepository accountsRepository;

    // get Accounts by userId
    public Accounts findById(String userId) {
        Optional<Accounts> accounts = accountsRepository.findById(userId);
        if(accounts.isPresent()) {
            return accounts.get();
        } else {
            throw new RuntimeException("No accounts associated with this userId");
        }
    }

    // update accounts object
    public Accounts updateAccounts(Accounts accounts) {
        return accountsRepository.save(accounts);
    }
}
