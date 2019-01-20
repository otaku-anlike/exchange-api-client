package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRateEntry {

    private double BITCNY;

    private double USDT;

    private double USD;

    private double CNY;

    private double KRW;

    private double JPY;

    private double EUR;

    public double getBITCNY() {
        return BITCNY;
    }

    public void setBITCNY(double BITCNY) {
        this.BITCNY = BITCNY;
    }

    public double getUSDT() {
        return USDT;
    }

    public void setUSDT(double USDT) {
        this.USDT = USDT;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getCNY() {
        return CNY;
    }

    public void setCNY(double CNY) {
        this.CNY = CNY;
    }

    public double getKRW() {
        return KRW;
    }

    public void setKRW(double KRW) {
        this.KRW = KRW;
    }

    public double getJPY() {
        return JPY;
    }

    public void setJPY(double JPY) {
        this.JPY = JPY;
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }
}
