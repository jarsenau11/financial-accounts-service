package com.skillstorm.financialaccounts.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
public class Accounts {
    
    @Id
    private String id;

    private String userId;

    private List<BankAccount> bankAccounts;

    private List<CreditCard> creditCards;

    private List<Loan> loans;

    public Accounts() {}

    public Accounts(String userId, List<BankAccount> bankAccounts, List<CreditCard> creditCards, List<Loan> loans) {
        this.userId = userId;
        this.bankAccounts = bankAccounts;
        this.creditCards = creditCards;
        this.loans = loans;
    }

    public Accounts(String id, String userId, List<BankAccount> bankAccounts, List<CreditCard> creditCards,
            List<Loan> loans) {
        this.id = id;
        this.userId = userId;
        this.bankAccounts = bankAccounts;
        this.creditCards = creditCards;
        this.loans = loans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((bankAccounts == null) ? 0 : bankAccounts.hashCode());
        result = prime * result + ((creditCards == null) ? 0 : creditCards.hashCode());
        result = prime * result + ((loans == null) ? 0 : loans.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Accounts other = (Accounts) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        if (bankAccounts == null) {
            if (other.bankAccounts != null)
                return false;
        } else if (!bankAccounts.equals(other.bankAccounts))
            return false;
        if (creditCards == null) {
            if (other.creditCards != null)
                return false;
        } else if (!creditCards.equals(other.creditCards))
            return false;
        if (loans == null) {
            if (other.loans != null)
                return false;
        } else if (!loans.equals(other.loans))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Accounts [id=" + id + ", userId=" + userId + ", bankAccounts=" + bankAccounts + ", creditCards="
                + creditCards + ", loans=" + loans + "]";
    }
    
}
