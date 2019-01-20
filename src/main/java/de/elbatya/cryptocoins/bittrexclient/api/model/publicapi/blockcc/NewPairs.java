package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public class NewPairs {

    private int page;
    private int size;
    private int total_page;
    private int total_count;
    private List<NewPairsEntry> list;

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

    public int getTotal_page() {
        return total_page;
    }

    public void setTotal_page(int total_page) {
        this.total_page = total_page;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<NewPairsEntry> getList() {
        return list;
    }

    public void setList(List<NewPairsEntry> list) {
        this.list = list;
    }
}
