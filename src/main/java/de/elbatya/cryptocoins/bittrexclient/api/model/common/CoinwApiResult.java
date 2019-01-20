package de.elbatya.cryptocoins.bittrexclient.api.model.common;

import java.util.Optional;

/**
 * @author contact@elbatya.de
 */
public class CoinwApiResult<T> {
    private String code;
    private String msg;
    private long time;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public T getData() {
        return data;
    }

    public Optional<T> getResultAsOptional() {
        return Optional.ofNullable(data);
    }

    public T unwrap() throws BittrexApiException {
        if (data == null) {
            String errorMessage = String.format("Message from coinw server: %s", this.msg);
            throw new CoinwApiException(errorMessage);
        }
        return data;
    }

}
