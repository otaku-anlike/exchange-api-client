package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinInfoExData {

    private String name;//": "IDEX",
    private double y;//": 1544326.078298776

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
