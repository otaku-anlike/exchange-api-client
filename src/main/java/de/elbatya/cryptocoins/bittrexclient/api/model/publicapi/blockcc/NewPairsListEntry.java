package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewPairsListEntry {

    private NewPairsListEntryId _id;
    private LocalDateTime charge_at;
    private LocalDateTime withdraw_at;
    private LocalDateTime end_at;
    private LocalDateTime trade_at;
    private List<String> symbol;
    private List<String> coin_info;
    private List<String> coin_url;
    private Double price;
    private Double change1d;

    public NewPairsListEntryId get_id() {
        return _id;
    }

    public void set_id(NewPairsListEntryId _id) {
        this._id = _id;
    }

    public LocalDateTime getCharge_at() {
        return charge_at;
    }

    public void setCharge_at(LocalDateTime charge_at) {
        this.charge_at = charge_at;
    }

    public LocalDateTime getWithdraw_at() {
        return withdraw_at;
    }

    public void setWithdraw_at(LocalDateTime withdraw_at) {
        this.withdraw_at = withdraw_at;
    }

    public LocalDateTime getEnd_at() {
        return end_at;
    }

    public void setEnd_at(LocalDateTime end_at) {
        this.end_at = end_at;
    }

    public LocalDateTime getTrade_at() {
        return trade_at;
    }

    public void setTrade_at(LocalDateTime trade_at) {
        this.trade_at = trade_at;
    }

    public List<String> getSymbol() {
        return symbol;
    }

    public void setSymbol(List<String> symbol) {
        this.symbol = symbol;
    }

    public List<String> getCoin_info() {
        return coin_info;
    }

    public void setCoin_info(List<String> coin_info) {
        this.coin_info = coin_info;
    }

    public List<String> getCoin_url() {
        return coin_url;
    }

    public void setCoin_url(List<String> coin_url) {
        this.coin_url = coin_url;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getChange1d() {
        return change1d;
    }

    public void setChange1d(Double change1d) {
        this.change1d = change1d;
    }
}