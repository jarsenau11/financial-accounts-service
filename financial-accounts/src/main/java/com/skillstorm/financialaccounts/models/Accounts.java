package com.skillstorm.financialaccounts.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
public class Accounts {
    
    @Id
    private String id;

    private String userId;

    // bankAccounts[]
    // creditCards[]
    // loans[]
}
