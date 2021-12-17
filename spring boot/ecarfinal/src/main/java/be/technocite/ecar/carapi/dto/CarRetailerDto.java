package be.technocite.ecar.carapi.dto;

import java.util.Date;

public class CarRetailerDto {

    private int id;
    private String brand;
    private double marketPrice;
    private double originalPrice;
    private String vin;
    private Date year;

    public CarRetailerDto(int id, String brand, double marketPrice, double originalPrice, String vin, Date year) {
        this.id = id;
        this.brand = brand;
        this.marketPrice = marketPrice;
        this.originalPrice = originalPrice;
        this.vin = vin;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public String getVin() {
        return vin;
    }

    public Date getYear() {
        return year;
    }
}
