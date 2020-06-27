package ru.jktu88.alfa.model;

import org.springframework.data.annotation.Id;

public class Branche {

    @Id
    private Long id;
    private String address;
    private double lat;
    private double lon;
    private String title;

    public Branche() {
    }

    public Long getId() {
        return id;
    }

    public Branche setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Branche setAddress(String address) {
        this.address = address;
        return this;
    }

    public double getLat() {
        return lat;
    }

    public Branche setLat(double lat) {
        this.lat = lat;
        return this;
    }

    public double getLon() {
        return lon;
    }

    public Branche setLon(double lon) {
        this.lon = lon;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Branche setTitle(String title) {
        this.title = title;
        return this;
    }
}
