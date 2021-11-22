package exo46.designPattern;

public class Article {
    private String name;
    private int price;

    public Article(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void payer(PaiementStrategy paiementStrategy){
        paiementStrategy.payer(price);
    }
}
