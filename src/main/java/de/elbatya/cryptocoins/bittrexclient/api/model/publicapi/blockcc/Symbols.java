package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
public class Symbols {

    private String name;//": "bitcoin",
    private String symbol;//": "BTC",
    private double volume_usd;//": 4589380919.9093,
    private String[] alias;//": [ "XBT"],
    private String status;//": "enable"

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

    public double getVolume_usd() {
        return volume_usd;
    }

    public void setVolume_usd(double volume_usd) {
        this.volume_usd = volume_usd;
    }

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}