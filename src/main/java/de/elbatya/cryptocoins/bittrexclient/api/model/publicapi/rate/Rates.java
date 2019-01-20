package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.rate;

/**
 * @author contact@elbatya.de
 */
public class Rates {

    private String disclaimer;
    private String license;
    private long timestamp;
    private String base;
    private RatesEntry rates;

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public RatesEntry getRates() {
        return rates;
    }

    public void setRates(RatesEntry rates) {
        this.rates = rates;
    }
}
