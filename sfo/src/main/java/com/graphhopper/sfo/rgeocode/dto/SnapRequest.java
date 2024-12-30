package com.graphhopper.sfo.rgeocode.dto;

import static com.graphhopper.util.Helper.round;

public class SnapRequest {
    private double lat;
    private double lon;

    public SnapRequest() {
    }
    public SnapRequest(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = round(lat, 7);
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = round(lon, 7);
    }

    @Override
    public String toString() {
        return "lat: " + this.lat + ", lon: " + this.lon;
    }
}
