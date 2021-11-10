package exo27.interest;
//. Soit une classe Placement. Définissez une méthode capable de
//        calculer la valeur final du capital selon sa durée (en année).
//        Formule à utiliser :
//        capital initial * (1 + taux d’intérêts composés / 100) nombre d’années
//        De plus, créez trois constructeurs

public class Placement {
    private double capital;
    private double interet;

    public Placement(double capital, double interet) {
        this.capital = capital;
        this.interet = interet;
    }

    public double calcul(int years) {
        double result = capital;
        for (int i = 0; i < years; i++) {
            result += (result * interet);
        }
        return result;
    }
}
