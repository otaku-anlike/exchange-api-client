package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author contact@elbatya.de
 */
public class Ticker {

    private long timestamps;//": 1527273611389,
    private double last;//": 7411.68,
    private double bid;//": 7402.57,
    private double ask;//": 7411.66,
    private double high;//": 7649.55,
    private double low;//": 7308.15,
    private double vol;//": 28734.917028,
    private double base_volume;//": 215488045.436684,
    private double change_daily;//": -0.0185,
    private String market;//": "binance",
    private String symbol_name;//": "bitcoin",
    private String symbol_pair;//": "BTC_USDT",
    private double rating;//": 3,
    private boolean has_kline;//": true,
    private double usd_rate;//": 0.99999999

    public long getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(long timestamps) {
        this.timestamps = timestamps;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
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

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public double getBase_volume() {
        return base_volume;
    }

    public void setBase_volume(double base_volume) {
        this.base_volume = base_volume;
    }

    public double getChange_daily() {
        return change_daily;
    }

    public void setChange_daily(double change_daily) {
        this.change_daily = change_daily;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isHas_kline() {
        return has_kline;
    }

    public void setHas_kline(boolean has_kline) {
        this.has_kline = has_kline;
    }

    public double getUsd_rate() {
        return usd_rate;
    }

    public void setUsd_rate(double usd_rate) {
        this.usd_rate = usd_rate;
    }
}
