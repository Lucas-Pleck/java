package exo47.designPattern2;

public class AffichageBelgique implements AffichageStrategy{

    @Override
    public void Afficher(int montant) {
        System.out.println("Le montant de la facture est de : " +montant+" €");
    }
}
