package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
public class Market {

    private Integer code;
    private String msg;
    private long time;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal vol;
    private BigDecimal buy;
    private BigDecimal sell;
    private MarketEntry data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getVol() {
        return vol;
    }

    public void setVol(BigDecimal vol) {
        this.vol = vol;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public void setBuy(BigDecimal buy) {
        this.buy = buy;
    }

    public BigDecimal getSell() {
        return sell;
    }

    public void setSell(BigDecimal sell) {
        this.sell = sell;
    }

    public MarketEntry getData() {
        return data;
    }

    public void setData(MarketEntry data) {
        this.data = data;
    }
}
