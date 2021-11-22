package exo46.designPattern;

public class Main {
    public static void main(String[] args) {
        Article article1=new Article("chaussure",50);
        Article article2=new Article("chaussure",50);
        PaiementStrategy strategy = new PaypalStrategy("Pay01","1234");
        PaiementStrategy strategy1 = new CarteDeCreditStrategy("Credit01","1234","07/22");
        PaiementStrategy strategy3 =new CashStrategy(500);
        article1.payer(strategy1);
        article2.payer(strategy3);
    }
}
