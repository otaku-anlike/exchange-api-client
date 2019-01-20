package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
public class NewPairsEntry {

    private String market_name;
    private String symbol;
    private String currency;
    private String status;
    private String listAt;
    private LocalDateTime tradedAt;

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getListAt() {
        return listAt;
    }

    public void setListAt(String listAt) {
        this.listAt = listAt;
    }

    public LocalDateTime getTradedAt() {
        return tradedAt;
    }

    public void setTradedAt(LocalDateTime tradedAt) {
        this.tradedAt = tradedAt;
    }
}