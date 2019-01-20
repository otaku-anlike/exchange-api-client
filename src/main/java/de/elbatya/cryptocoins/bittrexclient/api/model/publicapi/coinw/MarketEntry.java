package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
public class MarketEntry {

    private BigDecimal last;

    public BigDecimal getLast() {
        return last;
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }
}