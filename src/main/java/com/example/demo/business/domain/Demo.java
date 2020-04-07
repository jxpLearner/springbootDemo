package com.example.demo.business.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;


public class Demo {

    @NotBlank
    private String name;
    @NotNull
    private Double longitude;
    @NotNull
    private Double latitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
