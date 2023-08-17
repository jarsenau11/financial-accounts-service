package com.skillstorm.financialaccounts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.financialaccounts.repositories.AccountsRepository;

@Service
public class AccountsService {
    
    @Autowired
    AccountsRepository accountsRepository;

    
}
