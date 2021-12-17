package be.technocite.ecar.carapi.dto;

import java.util.Date;

public class CarBuyerDto {

    private int id;
    private String brand;
    private double marketPrice;
    private String vin;
    private Date year;

    public CarBuyerDto(int id, String brand, double marketPrice, String vin, Date year) {
        this.id = id;
        this.brand = brand;
        this.marketPrice = marketPrice;
        this.vin = vin;
        this.year = year;
    }

    // getter obligatoire pour sérializer le java en json via la librairie jackson
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public String getVin() {
        return vin;
    }

    public Date getYear() {
        return year;
    }
}
