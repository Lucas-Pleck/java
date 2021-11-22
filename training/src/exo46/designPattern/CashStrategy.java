package exo46.designPattern;

public class CashStrategy implements PaiementStrategy{
    private int bourse=500;

    public CashStrategy(int bourse) {
        this.bourse = bourse;
    }


    public void payer(int montant) {
        if(montant<bourse){
            System.out.println("l'article d'um montant de :" +montant +" € a été réglé en cash");
        }
        else{
            System.out.println("Pas assez de pognon mon gars");
        }


    }

}
