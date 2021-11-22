package exo46.designPattern;

public class PaypalStrategy implements PaiementStrategy {
    private String id;
    private String password;

    public PaypalStrategy(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public void payer(int montant) {
        System.out.println("l'article d'um montant de :" +montant +" € a été réglé par Paypal");
    }
}
