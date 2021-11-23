package exo57.anonymousClass;

public class CurrentAccount {
    private String accountNbr;
    private int accountBalance;
    private Transaction lastTransaction;

    public CurrentAccount(String accountNbr, int accountBalance) {
        this.accountNbr = accountNbr;
        this.accountBalance = accountBalance;
        lastTransaction= new Transaction(accountBalance, "Opening");
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
        return "CurrentAccount{" +
                "accountNbr='" + accountNbr + '\'' +
                ", accountBalance=" + accountBalance +
                ", lastTransaction=" + lastTransaction +
                '}';
    }

    public void addMoney(int amountToAdd){
        this.accountBalance=accountBalance+amountToAdd;
        lastTransaction= new Transaction(amountToAdd, "Add Money");
    }

    public void retrieveMoney(int amountToRetrieve){
        accountBalance=accountBalance-amountToRetrieve;
        lastTransaction=new Transaction(amountToRetrieve,"Retrieve Money");
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
