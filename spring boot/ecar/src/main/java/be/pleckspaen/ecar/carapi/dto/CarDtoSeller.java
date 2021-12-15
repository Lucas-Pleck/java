package be.pleckspaen.ecar.carapi.dto;

import java.util.Date;

public class CarDtoSeller {
    private int id;
    private String brand;
    private double marketPrice;
    private String vin;
    private Date year;
    private double originalPrice;

    public CarDtoSeller(int id, String brand, double marketPrice, String vin, Date year, double originalPrice) {
        this.id = id;
        this.brand = brand;
        this.marketPrice = marketPrice;
        this.vin = vin;
        this.year = year;
        this.originalPrice = originalPrice;
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

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
}
