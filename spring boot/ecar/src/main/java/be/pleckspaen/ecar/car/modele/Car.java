package be.pleckspaen.ecar.car.modele;

import java.util.Date;
import java.util.Objects;

public class Car {

    private static int idIndex;
    private int id;
    private String brand;
    private double originPrice;
    private double marketPrice;
    private String vin;
    private Date year;

    public Car(String brand, double originPrice, double marketPrice, String vin, Date year) {
        idIndex++;
        this.id = idIndex;
        this.brand = brand;
        this.originPrice = originPrice;
        this.marketPrice = marketPrice;
        this.vin = vin;
        this.year = year;
    }

    public static int getIdIndex() {
        return idIndex;
    }

    public static void setIdIndex(int idIndex) {
        Car.idIndex = idIndex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(double originPrice) {
        this.originPrice = originPrice;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Double.compare(car.originPrice, originPrice) == 0 && brand.equals(car.brand) && vin.equals(car.vin) && year.equals(car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, originPrice, vin, year);
    }
}
