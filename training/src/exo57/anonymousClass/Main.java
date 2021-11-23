package exo57.anonymousClass;

public class Main {
    public static void main(String[] args) {
        CurrentAccount myAccount=new CurrentAccount("2548-568-85",20000);
        myAccount.addMoney(1000);
        System.out.println(myAccount);
        myAccount.retrieveMoney(50);
        System.out.println(myAccount);


        SpareAccount mySpareAccount=new SpareAccount("1259-999-88",100000);
        mySpareAccount.addMoney(1890);
        System.out.println(mySpareAccount);
        mySpareAccount.retrieveMoney(250);
        System.out.println(mySpareAccount);

    }
}
