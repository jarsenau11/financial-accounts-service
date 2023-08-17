package com.skillstorm.financialaccounts.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.financialaccounts.models.Accounts;
import com.skillstorm.financialaccounts.services.AccountsService;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
    
    @Autowired
    AccountsService accountsService;

    // get accounts by userId
    @GetMapping("/user/{userId}")
    public ResponseEntity<Accounts> getAccountsByUserId(@PathVariable String userId) {
        Accounts accounts = accountsService.findById(userId);
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    // update accounts object
    @PutMapping
    public ResponseEntity<Accounts> updateAccounts(@RequestBody Accounts accounts) {
        Accounts updatedAccounts = accountsService.updateAccounts(accounts);
        return new ResponseEntity<Accounts>(updatedAccounts, HttpStatus.OK);
    } 
}
