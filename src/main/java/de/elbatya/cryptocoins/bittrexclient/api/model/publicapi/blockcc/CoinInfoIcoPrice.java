package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinInfoIcoPrice {

    private String _id;//": "5b0ee91012fb7d6b5a28fa83",
    private String symbol;//": "USD",
    private Double price;//": 0.0021,
    private Double goal;//": 35000000

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getGoal() {
        return goal;
    }

    public void setGoal(Double goal) {
        this.goal = goal;
    }
}
