package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.tct;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author contact@elbatya.de
 */
public class Summary {

    private int count;
    private List<SummaryEntry> summaryList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<SummaryEntry> getSummaryList() {
        return summaryList;
    }

    public void setSummaryList(List<SummaryEntry> summaryList) {
        this.summaryList = summaryList;
    }
}