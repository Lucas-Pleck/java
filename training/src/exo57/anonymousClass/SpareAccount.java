package exo57.anonymousClass;

import java.util.ArrayList;
import java.util.List;

public class SpareAccount {
    private String accountNbr;
    private int accountBalance;
    private List<Transaction> lastTransactions =new ArrayList<>();

    public SpareAccount(String accountNbr, int accountBalance) {
        this.accountNbr = accountNbr;
        this.accountBalance = accountBalance;
        lastTransactions.add(new Transaction(accountBalance, "Opening"));
    }

    public String getAccountNbr() {
        return accountNbr;
    }

    public void setAccountNbr(String accountNbr) {
        this.accountNbr = accountNbr;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "SpareAccount{" +
                "accountNbr='" + accountNbr + '\'' +
                ", accountBalance=" + accountBalance +
                ", beforeLastTransaction=" + lastTransactions.get(lastTransactions.size()-2) +
                ", lastTransaction=" + lastTransactions.get(lastTransactions.size()-1) +
                '}';
    }

    public void addMoney(int amountToAdd){
        this.accountBalance=accountBalance+amountToAdd;
        lastTransactions.add(new Transaction(amountToAdd, "Add Money"));
    }

    public void retrieveMoney(int amountToRetrieve){
        accountBalance=accountBalance-amountToRetrieve;
        lastTransactions.add(new Transaction(amountToRetrieve,"Retrieve Money"));
    }

    private class Transaction{
        private int amountTransaction;
        private String operationType;

        public Transaction(int amountTransaction, String operationType) {
            this.amountTransaction = amountTransaction;
            this.operationType = operationType;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "amountTransaction=" + amountTransaction +
                    ", operationType='" + operationType + '\'' +
                    '}';
        }
    }
}
