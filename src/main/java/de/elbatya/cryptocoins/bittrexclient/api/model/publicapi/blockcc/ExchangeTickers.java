package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeTickers {

    private List<ExchangeTickersEntry> tickers;
    private int page;
    private int size;
    private int pageCount;

    public List<ExchangeTickersEntry> getTickers() {
        return tickers;
    }

    public void setTickers(List<ExchangeTickersEntry> tickers) {
        this.tickers = tickers;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
