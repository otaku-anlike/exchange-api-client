package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeTickersEntry {

    private String _id;//": "5aa734ccce79d2cf9bbd3809",
    private String display_pair_name;//": "CNN/ETH",
    private String coin_symbol;//": "CNN",
    private String coin_name;//": "Content Neutrality Network",
    private String coin_id;//": "content-neutrality-network",
    private String base_symbol;//": "ETH",
    private double change1d;//": 3.13,
    private String type;//": 3,
    private double bid;//": 0,
    private double ask;//": 0,
    private double native_price;//": 0.0000028247,
    private double low1d;//": 0.001261590866094,
    private double high1d;//": 0.001416815065349181,
    private String status;//": "0",
    private String exchange_display_name;//": "HADAX",
    private String exchange_zh_name;//": "HADAX",
    private String exchange_name;//": "hadax",
    private String url;//": "http://www.hadax.com",
    private String dataCenter_pair_name;//": "CNN/ETH",
    private BigDecimal timestamps;//": 1528979309122,
    private boolean enableKline;//": true,
    private double volume;//": 911305.6262186101,
    private double price;//": 0.001370621430559893,
    private double percent;//": 0.017289500202242524

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDisplay_pair_name() {
        return display_pair_name;
    }

    public void setDisplay_pair_name(String display_pair_name) {
        this.display_pair_name = display_pair_name;
    }

    public String getCoin_symbol() {
        return coin_symbol;
    }

    public void setCoin_symbol(String coin_symbol) {
        this.coin_symbol = coin_symbol;
    }

    public String getCoin_name() {
        return coin_name;
    }

    public void setCoin_name(String coin_name) {
        this.coin_name = coin_name;
    }

    public String getCoin_id() {
        return coin_id;
    }

    public void setCoin_id(String coin_id) {
        this.coin_id = coin_id;
    }

    public String getBase_symbol() {
        return base_symbol;
    }

    public void setBase_symbol(String base_symbol) {
        this.base_symbol = base_symbol;
    }

    public double getChange1d() {
        return change1d;
    }

    public void setChange1d(double change1d) {
        this.change1d = change1d;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public double getNative_price() {
        return native_price;
    }

    public void setNative_price(double native_price) {
        this.native_price = native_price;
    }

    public double getLow1d() {
        return low1d;
    }

    public void setLow1d(double low1d) {
        this.low1d = low1d;
    }

    public double getHigh1d() {
        return high1d;
    }

    public void setHigh1d(double high1d) {
        this.high1d = high1d;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExchange_display_name() {
        return exchange_display_name;
    }

    public void setExchange_display_name(String exchange_display_name) {
        this.exchange_display_name = exchange_display_name;
    }

    public String getExchange_zh_name() {
        return exchange_zh_name;
    }

    public void setExchange_zh_name(String exchange_zh_name) {
        this.exchange_zh_name = exchange_zh_name;
    }

    public String getExchange_name() {
        return exchange_name;
    }

    public void setExchange_name(String exchange_name) {
        this.exchange_name = exchange_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDataCenter_pair_name() {
        return dataCenter_pair_name;
    }

    public void setDataCenter_pair_name(String dataCenter_pair_name) {
        this.dataCenter_pair_name = dataCenter_pair_name;
    }

    public BigDecimal getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(BigDecimal timestamps) {
        this.timestamps = timestamps;
    }

    public boolean isEnableKline() {
        return enableKline;
    }

    public void setEnableKline(boolean enableKline) {
        this.enableKline = enableKline;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
