package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewPairsList {

    private int length;
    private List<NewPairsListEntry> list;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<NewPairsListEntry> getList() {
        return list;
    }

    public void setList(List<NewPairsListEntry> list) {
        this.list = list;
    }
}
