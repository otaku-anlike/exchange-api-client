package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NoticesInfoEntry {

    private String _id;

    private String lang;

    private String zh_name;

    private boolean defalut;

    private String from;

    private BigDecimal timestamp;

    private String title;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getZh_name() {
        return zh_name;
    }

    public void setZh_name(String zh_name) {
        this.zh_name = zh_name;
    }

    public boolean isDefalut() {
        return defalut;
    }

    public void setDefalut(boolean defalut) {
        this.defalut = defalut;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
