package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.gate;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public class Ticker {

    private List<TickerEntry> bids;
    private List<TickerEntry> asks;

    public List<TickerEntry> getBids() {
        return bids;
    }

    public void setBids(List<TickerEntry> bids) {
        this.bids = bids;
    }

    public List<TickerEntry> getAsks() {
        return asks;
    }

    public void setAsks(List<TickerEntry> asks) {
        this.asks = asks;
    }
}
