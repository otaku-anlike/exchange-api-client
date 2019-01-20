package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
public class TradeHistory {

    private String date;//": "2018-10-11 17:12:10",
    private double amount;//": "895.9935",
    private String type;//": "sell",
    private double total;//": "0.281156244937868708",
    private double price;//": "0.000313792728337726",
    private String orderHash;//": "0xc0cca964a3b829541841ebdc2d938936b9593924cf2bd0de359bc6a5ff4a0ee8",
    private String uuid;//": "ca5ca940-cd78-11e8-812d-3b7d27265b69",
    private BigDecimal tid;//": 2564227,
    private double buyerFee;//": "0.8959935",
    private double sellerFee;//": "0.000562312489875737",
    private double gasFee;//": "0.00425",
    private BigDecimal timestamp;//": 1539277930,
    private String maker;//": "0x1d1fa573d0d1d4ab62cf59273941a27e3862f55b",
    private String taker;//": "0x2d98a4263084f918130410c66d9ecbe5325f7edf",
    private String transactionHash;//": "0x1b651d0c0578008296f0edf237fdbece67797a0bee9a28c5e4313e44844b25a2",
    private double usdValue;//": "55.976138551905106037"

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderHash() {
        return orderHash;
    }

    public void setOrderHash(String orderHash) {
        this.orderHash = orderHash;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getTid() {
        return tid;
    }

    public void setTid(BigDecimal tid) {
        this.tid = tid;
    }

    public double getBuyerFee() {
        return buyerFee;
    }

    public void setBuyerFee(double buyerFee) {
        this.buyerFee = buyerFee;
    }

    public double getSellerFee() {
        return sellerFee;
    }

    public void setSellerFee(double sellerFee) {
        this.sellerFee = sellerFee;
    }

    public double getGasFee() {
        return gasFee;
    }

    public void setGasFee(double gasFee) {
        this.gasFee = gasFee;
    }

    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getTaker() {
        return taker;
    }

    public void setTaker(String taker) {
        this.taker = taker;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public double getUsdValue() {
        return usdValue;
    }

    public void setUsdValue(double usdValue) {
        this.usdValue = usdValue;
    }
}