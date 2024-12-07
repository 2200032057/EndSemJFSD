package com.klef.jfsd.exam;

package com.klef.jfsd.exam;

import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tablet")
@PrimaryKeyJoinColumn(name = "device_id")
public class Tablet extends Device {
    private String screenSize;
    private int batteryLife;

    public Tablet() {}
    public Tablet(String brand, String model, double price, String screenSize, int batteryLife) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    // Getters and Setters
    public String getScreenSize() { return screenSize; }
    public int getBatteryLife() { return batteryLife; }
    public void setScreenSize(String size) { this.screenSize = size; }
    public void setBatteryLife(int life) { this.batteryLife = life; }
}
