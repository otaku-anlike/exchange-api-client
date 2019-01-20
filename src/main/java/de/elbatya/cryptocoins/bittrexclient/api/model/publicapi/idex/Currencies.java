package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex;

/**
 * @author contact@elbatya.de
 */
public class Currencies {

    private int decimals;
    private String address;
    private String name;

    public int getDecimals() {
        return decimals;
    }

    public void setDecimals(int decimals) {
        this.decimals = decimals;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}