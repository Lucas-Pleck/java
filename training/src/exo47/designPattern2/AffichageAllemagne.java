package exo47.designPattern2;

public class AffichageAllemagne implements AffichageStrategy{

    @Override
    public void Afficher(int montant) {
        System.out.println("Der rechnungsbetrag ist : " +montant +" €");
    }
}
