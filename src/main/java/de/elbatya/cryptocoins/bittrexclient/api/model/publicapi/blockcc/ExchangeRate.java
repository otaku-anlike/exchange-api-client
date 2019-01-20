package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRate {

    private String base;

    private double timestamp;

    private ExchangeRateEntry rates;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    public ExchangeRateEntry getRates() {
        return rates;
    }

    public void setRates(ExchangeRateEntry rates) {
        this.rates = rates;
    }
}
