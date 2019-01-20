package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {

    private String name;//": "bitcoin",
    private String symbol;//": "BTC",
    private double price;//": 7459.37690681,
    private double high;//": 7664.21504016,
    private double low;//": 7398.49856797,
    private double hist_high;//": 7664.21504016,
    private double hist_low;//": 7398.49856797,
    private long timestamps;//": 1527275085724,
    private double volume;//": 627860.4903,
    private double change_hourly;//": -0.0044,
    private double change_daily;//": -0.0109,
    private double change_weekly;//": -0.0839,
    private double change_monthly;//": -0.1766

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHist_high() {
        return hist_high;
    }

    public void setHist_high(double hist_high) {
        this.hist_high = hist_high;
    }

    public double getHist_low() {
        return hist_low;
    }

    public void setHist_low(double hist_low) {
        this.hist_low = hist_low;
    }

    public long getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(long timestamps) {
        this.timestamps = timestamps;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getChange_hourly() {
        return change_hourly;
    }

    public void setChange_hourly(double change_hourly) {
        this.change_hourly = change_hourly;
    }

    public double getChange_daily() {
        return change_daily;
    }

    public void setChange_daily(double change_daily) {
        this.change_daily = change_daily;
    }

    public double getChange_weekly() {
        return change_weekly;
    }

    public void setChange_weekly(double change_weekly) {
        this.change_weekly = change_weekly;
    }

    public double getChange_monthly() {
        return change_monthly;
    }

    public void setChange_monthly(double change_monthly) {
        this.change_monthly = change_monthly;
    }
}
