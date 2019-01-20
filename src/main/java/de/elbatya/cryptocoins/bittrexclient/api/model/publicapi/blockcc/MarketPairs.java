package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
public class MarketPairs {

    private String name;//": "bitmex",
    private String display_name;//": "BitMEX",
    private String[] symbol_pairs;//": [ "XBT_USD", "BCH_XBT", "ETH_XBT", "LTC_XBT", "XRP_XBT", "ADA_XBT"],
    private String[] base_currencies;//": [ "USD", "XBT"]

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

    public String[] getSymbol_pairs() {
        return symbol_pairs;
    }

    public void setSymbol_pairs(String[] symbol_pairs) {
        this.symbol_pairs = symbol_pairs;
    }

    public String[] getBase_currencies() {
        return base_currencies;
    }

    public void setBase_currencies(String[] base_currencies) {
        this.base_currencies = base_currencies;
    }
}