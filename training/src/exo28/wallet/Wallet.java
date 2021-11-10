package exo28.wallet;

public class Wallet {

    private double[][] wallet = new double[2][8];

    public Wallet(double i, double i1, double i2, double i3, double i4, double i5, double i6, double i7) {
    }

    private void initWallet() {
        wallet[0] = new double[]{0.01, 0.02, 0.05, 0.10, 0.20, 0.5, 1, 2};
        wallet[1] = new double[8];
    }

    public Wallet(double[][] wallet) {
        this.wallet = wallet;
    }

    public double totalAmount() {
        double amount=0;
        for (int i = 0; i < wallet[0].length; i++) {
            amount = wallet[0][i] * wallet[1][i];
        }
        return amount;
    }

    public void modifyMoney(double[] quantity) {
        wallet[1] = quantity;
    }



}
