package de.elbatya.cryptocoins.bittrexclient.api.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Optional;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HuobiproApiResult<T> {
    private String status;
    private String ch;
    private long ts;
    private T data;

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public T getData() {
        return data;
    }

    public Optional<T> getDataAsOptional() {
        return Optional.ofNullable(data);
    }

    public T unwrap() throws BittrexApiException {
        if (data == null) {
            String errorMessage = String.format("Message from Bittrex server: %s", this.status);
            throw new BittrexApiException(errorMessage);
        }
        return data;
    }

}
