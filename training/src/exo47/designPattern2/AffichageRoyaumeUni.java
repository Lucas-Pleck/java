package exo47.designPattern2;

public class AffichageRoyaumeUni implements AffichageStrategy{
    @Override
    public void Afficher(int montant) {
        System.out.println("The amount of the invoice is : " +montant+" €");
    }
}
