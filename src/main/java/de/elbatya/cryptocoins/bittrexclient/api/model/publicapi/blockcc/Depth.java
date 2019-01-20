package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author contact@elbatya.de
 */
public class Depth {

    private String timestamps;//": 1527274051003,
    private List<DepthEntry> bids;//": [
    private List<DepthEntry> asks;;//": [
    private String market;//": "binance",
    private String symbol_name;//": "bitcoin",
    private String symbol_pair;//": "BTC_USDT"

    public String getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(String timestamps) {
        this.timestamps = timestamps;
    }

    public List<DepthEntry> getBids() {
        return bids;
    }

    public void setBids(List<DepthEntry> bids) {
        this.bids = bids;
    }

    public List<DepthEntry> getAsks() {
        return asks;
    }

    public void setAsks(List<DepthEntry> asks) {
        this.asks = asks;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getSymbol_name() {
        return symbol_name;
    }

    public void setSymbol_name(String symbol_name) {
        this.symbol_name = symbol_name;
    }

    public String getSymbol_pair() {
        return symbol_pair;
    }

    public void setSymbol_pair(String symbol_pair) {
        this.symbol_pair = symbol_pair;
    }
}