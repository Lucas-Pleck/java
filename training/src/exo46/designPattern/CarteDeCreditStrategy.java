package exo46.designPattern;

public class CarteDeCreditStrategy implements PaiementStrategy{
    private String numeroCarte;
    private String cryptogramme;
    private String dateExpiration;

    public CarteDeCreditStrategy(String numeroCarte, String cryptogramme, String dateExpiration) {
        this.numeroCarte = numeroCarte;
        this.cryptogramme = cryptogramme;
        this.dateExpiration = dateExpiration;
    }


    @Override
    public void payer(int montant) {
        System.out.println("l'article d'um montant de :\" +montant +\" € a été réglé par carte de crédit");
    }
}
