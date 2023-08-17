package com.skillstorm.financialaccounts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.financialaccounts.services.AccountsService;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
    
    @Autowired
    AccountsService accountsService;

    
}
