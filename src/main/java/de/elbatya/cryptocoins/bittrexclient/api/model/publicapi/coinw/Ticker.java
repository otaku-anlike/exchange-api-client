package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw;

import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.OrderBookEntry;

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
