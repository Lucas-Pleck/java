package exo28.wallet;

public class Main {
    public static void main(String[] args) {
        Wallet wallet =new Wallet(5,10,5,85,69,14,25,36);
        System.out.println(wallet.totalAmount());
    }
}
