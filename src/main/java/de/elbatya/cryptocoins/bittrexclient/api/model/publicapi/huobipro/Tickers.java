package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.huobipro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tickers {
    private double open;//":0.044297,      // 日K线 开盘价
    private double close;//":0.042178,     // 日K线 收盘价
    private double low;//":0.040110,       // 日K线 最低价
    private double high;//":0.045255,      // 日K线 最高价
    private double amount;//":12880.8510,  // 24小时成交量
    private long count;//":12838,        // 24小时成交笔数
    private double vol;//":563.0388715740, // 24小时成交额
    private String symbol;//":"ethbtc"     // 交易对

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
