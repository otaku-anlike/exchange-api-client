package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
public class TickerEntry {

    private Integer id;
    private BigDecimal price;
    private BigDecimal amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}