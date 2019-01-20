package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
public class Markets {

    private String name;//": "binance",
    private String display_name;//": "Binance",
    private String home_url;//": "www.binance.com",
    private String volume;//": 1208579440.5758,
    private String display_volume;//": 1208579440.5758,
    private String status;//": "enable",
    private double ping;//": 2.75,
    private boolean has_kline;//": true,
    private long timestamps;//": 1527271200000,
    private double inflow_30m;//": 8041181.949999996,
    private double outflow_30m;//": 14087565.169999998,
    private double inflow_1h;//": 19480615.33,
    private double outflow_1h;//": 30184694.160000015,
    private double inflow_1d;//": 576156266.2599995,
    private double outflow_1d;//": 617166813.66,
    private double inflow_1w;//": 4164997896.4600005,
    private double outflow_1w;//": 4448011787.319999

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getHome_url() {
        return home_url;
    }

    public void setHome_url(String home_url) {
        this.home_url = home_url;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getDisplay_volume() {
        return display_volume;
    }

    public void setDisplay_volume(String display_volume) {
        this.display_volume = display_volume;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPing() {
        return ping;
    }

    public void setPing(double ping) {
        this.ping = ping;
    }

    public boolean isHas_kline() {
        return has_kline;
    }

    public void setHas_kline(boolean has_kline) {
        this.has_kline = has_kline;
    }

    public long getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(long timestamps) {
        this.timestamps = timestamps;
    }

    public double getInflow_30m() {
        return inflow_30m;
    }

    public void setInflow_30m(double inflow_30m) {
        this.inflow_30m = inflow_30m;
    }

    public double getOutflow_30m() {
        return outflow_30m;
    }

    public void setOutflow_30m(double outflow_30m) {
        this.outflow_30m = outflow_30m;
    }

    public double getInflow_1h() {
        return inflow_1h;
    }

    public void setInflow_1h(double inflow_1h) {
        this.inflow_1h = inflow_1h;
    }

    public double getOutflow_1h() {
        return outflow_1h;
    }

    public void setOutflow_1h(double outflow_1h) {
        this.outflow_1h = outflow_1h;
    }

    public double getInflow_1d() {
        return inflow_1d;
    }

    public void setInflow_1d(double inflow_1d) {
        this.inflow_1d = inflow_1d;
    }

    public double getOutflow_1d() {
        return outflow_1d;
    }

    public void setOutflow_1d(double outflow_1d) {
        this.outflow_1d = outflow_1d;
    }

    public double getInflow_1w() {
        return inflow_1w;
    }

    public void setInflow_1w(double inflow_1w) {
        this.inflow_1w = inflow_1w;
    }

    public double getOutflow_1w() {
        return outflow_1w;
    }

    public void setOutflow_1w(double outflow_1w) {
        this.outflow_1w = outflow_1w;
    }
}