package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.gate;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
public class Market {

    private boolean result;
    private BigDecimal last;
    private BigDecimal lowestAsk;
    private BigDecimal highestBid;
    private BigDecimal percentChange;
    private BigDecimal baseVolume;
    private BigDecimal quoteVolume;
    private BigDecimal high24hr;
    private BigDecimal low24hr;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public BigDecimal getLast() {
        return last;
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }

    public BigDecimal getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(BigDecimal lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public BigDecimal getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(BigDecimal highestBid) {
        this.highestBid = highestBid;
    }

    public BigDecimal getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(BigDecimal percentChange) {
        this.percentChange = percentChange;
    }

    public BigDecimal getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(BigDecimal baseVolume) {
        this.baseVolume = baseVolume;
    }

    public BigDecimal getQuoteVolume() {
        return quoteVolume;
    }

    public void setQuoteVolume(BigDecimal quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    public BigDecimal getHigh24hr() {
        return high24hr;
    }

    public void setHigh24hr(BigDecimal high24hr) {
        this.high24hr = high24hr;
    }

    public BigDecimal getLow24hr() {
        return low24hr;
    }

    public void setLow24hr(BigDecimal low24hr) {
        this.low24hr = low24hr;
    }
}