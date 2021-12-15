package be.pleckspaen.ecar.carapi.dto;

import java.util.Date;

public class CarDtoBuyer {
    private int id;
    private String brand;
    private double marketPrice;
    private String vin;
    private Date year;

    public CarDtoBuyer(int id, String brand, double marketPrice, String vin, Date year) {
        this.id = id;
        this.brand = brand;
        this.marketPrice = marketPrice;
        this.vin = vin;
        this.year = year;
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
}
