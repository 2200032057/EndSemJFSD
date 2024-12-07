package com.klef.jfsd.exam;

package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "smartphone")
@PrimaryKeyJoinColumn(name = "device_id")
public class Smartphone extends Device {
    private String operatingSystem;
    private String cameraResolution;

    public Smartphone() {}
    public Smartphone(String brand, String model, double price, String operatingSystem, String cameraResolution) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    // Getters and Setters
    public String getOperatingSystem() { return operatingSystem; }
    public String getCameraResolution() { return cameraResolution; }
    public void setOperatingSystem(String os) { this.operatingSystem = os; }
    public void setCameraResolution(String res) { this.cameraResolution = res; }
}
