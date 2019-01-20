package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
public class Market {

    private String name;//": "binance",
    private String display_name;//": "Binance",
    private double volume;//": 1204087727.9724,
    private double display_volume;//": 1204087727.9724,
    private String home_url;//": "www.binance.com",
    private String[] symbol_pairs;//": [ "BTC_USDT",

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDisplay_volume() {
        return display_volume;
    }

    public void setDisplay_volume(double display_volume) {
        this.display_volume = display_volume;
    }

    public String getHome_url() {
        return home_url;
    }

    public void setHome_url(String home_url) {
        this.home_url = home_url;
    }

    public String[] getSymbol_pairs() {
        return symbol_pairs;
    }

    public void setSymbol_pairs(String[] symbol_pairs) {
        this.symbol_pairs = symbol_pairs;
    }
}