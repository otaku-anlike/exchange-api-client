package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewPairsListEntryId {

    private String market_display_name;
    private String exchange_symbol;
    private String exchange_symbol_id;

    public String getMarket_display_name() {
        return market_display_name;
    }

    public void setMarket_display_name(String market_display_name) {
        this.market_display_name = market_display_name;
    }

    public String getExchange_symbol() {
        return exchange_symbol;
    }

    public void setExchange_symbol(String exchange_symbol) {
        this.exchange_symbol = exchange_symbol;
    }

    public String getExchange_symbol_id() {
        return exchange_symbol_id;
    }

    public void setExchange_symbol_id(String exchange_symbol_id) {
        this.exchange_symbol_id = exchange_symbol_id;
    }
}