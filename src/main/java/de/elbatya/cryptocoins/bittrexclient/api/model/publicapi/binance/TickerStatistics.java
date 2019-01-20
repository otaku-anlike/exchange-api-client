package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.binance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerStatistics {

    private String symbol;//": "BNBBTC",
    private double priceChange;//": "-94.99999800",
    private double priceChangePercent;//": "-95.960",
    private double weightedAvgPrice;//": "0.29628482",
    private double prevClosePrice;//": "0.10002000",
    private double lastPrice;//": "4.00000200",
    private double lastQty;//": "200.00000000",
    private double bidPrice;//": "4.00000000",
    private double askPrice;//": "4.00000200",
    private double openPrice;//": "99.00000000",
    private double highPrice;//": "100.00000000",
    private double lowPrice;//": "0.10000000",
    private double volume;//": "8913.30000000",
    private double quoteVolume;//": "15.30000000",
    private double openTime;//": 1499783499040,
    private double closeTime;//": 1499869899040,
    private int fristId;//": 28385,   // First tradeId
    private int lastId;//": 28460,    // Last tradeId
    private int count;//": 76         // Trade count

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(double priceChange) {
        this.priceChange = priceChange;
    }

    public double getPriceChangePercent() {
        return priceChangePercent;
    }

    public void setPriceChangePercent(double priceChangePercent) {
        this.priceChangePercent = priceChangePercent;
    }

    public double getWeightedAvgPrice() {
        return weightedAvgPrice;
    }

    public void setWeightedAvgPrice(double weightedAvgPrice) {
        this.weightedAvgPrice = weightedAvgPrice;
    }

    public double getPrevClosePrice() {
        return prevClosePrice;
    }

    public void setPrevClosePrice(double prevClosePrice) {
        this.prevClosePrice = prevClosePrice;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public double getLastQty() {
        return lastQty;
    }

    public void setLastQty(double lastQty) {
        this.lastQty = lastQty;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(double highPrice) {
        this.highPrice = highPrice;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getQuoteVolume() {
        return quoteVolume;
    }

    public void setQuoteVolume(double quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    public double getOpenTime() {
        return openTime;
    }

    public void setOpenTime(double openTime) {
        this.openTime = openTime;
    }

    public double getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(double closeTime) {
        this.closeTime = closeTime;
    }

    public int getFristId() {
        return fristId;
    }

    public void setFristId(int fristId) {
        this.fristId = fristId;
    }

    public int getLastId() {
        return lastId;
    }

    public void setLastId(int lastId) {
        this.lastId = lastId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
