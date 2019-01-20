package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinInfoIco {

    private List<String> ico_coins;//": ["ETH","BTC"]
    private List<CoinInfoIcoPrice> icoPrice;

    public List<String> getIco_coins() {
        return ico_coins;
    }

    public void setIco_coins(List<String> ico_coins) {
        this.ico_coins = ico_coins;
    }

    public List<CoinInfoIcoPrice> getIcoPrice() {
        return icoPrice;
    }

    public void setIcoPrice(List<CoinInfoIcoPrice> icoPrice) {
        this.icoPrice = icoPrice;
    }
}
