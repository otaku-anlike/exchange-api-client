package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.aicoin;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public class Depth {


    private List<DepthEntry> bids;//": [
    private List<DepthEntry> asks;;//": [


    public List<DepthEntry> getBids() {
        return bids;
    }

    public void setBids(List<DepthEntry> bids) {
        this.bids = bids;
    }

    public List<DepthEntry> getAsks() {
        return asks;
    }

    public void setAsks(List<DepthEntry> asks) {
        this.asks = asks;
    }
}