package exo24.bike;

public class Bike {

    private static int nbrWheels=2;

    private String brand;
    private String color;
    private int speed;
    private int weight;

    public Bike(String brand, String color, int speed, int weight) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }
    public Bike(String color, int speed, int weight) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }
    public static void wheeling(){
        System.out.println("frontwheel up!");
    }
    public void accelerate(){
        this.speed+=10;
    }
    public void slowDown(){
        this.speed+=10;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
    public Bike clone(){
        return new Bike(this.brand,this.color,this.speed,this.weight);
    }
}
