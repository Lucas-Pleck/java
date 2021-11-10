package exo25.tva;

public class Produit {

    private String reference;
    private String libelle;
    private int quantity;
    private double unitPrice;
    private double tva;

    public Produit(String reference, String libelle, int quantity, double unitPrice, double tva) {
        this.reference = reference;
        this.libelle = libelle;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.tva = tva;
    }

    public Produit(String reference, String libelle, int quantity, double unitPrice) {
        this(reference,libelle,quantity,unitPrice,0.21);
    }
    public void addStock(){
        this.quantity++;
    }
    public void addStock(int quantity){
        this.quantity+=quantity;
    }
    public void reduceStock(){
        if(quantity>0){
           quantity--;
        }
        else{
            System.out.println("ERROR NOT ENOUGH QUANTITY");
        }
    }
    public void reduceStock(int quantity){
        if(quantity>this.quantity){
            System.out.println("ERROR NOT ENOUGH QUANTITY");
        }
        else{
            this.quantity-=quantity;
        }
    }
    public double invoice(int orderedQuantity){
        double price = orderedQuantity*unitPrice;
        price-=this.promotion(price,orderedQuantity);
        return  price*(1+tva);
    }
    private double promotion(double amount, int orderedQuantity){
        return orderedQuantity>100?(amount*0.05):0;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "reference='" + reference + '\'' +
                ", libelle='" + libelle + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", tva=" + tva +
                '}';
    }
}
