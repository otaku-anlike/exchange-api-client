package de.elbatya.cryptocoins.bittrexclient.api.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TctApiResult<T> {
    private String code;
    private String message;
    private T data;
    private BigDecimal timestamp;//": 1529359351216,

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return data;
    }

    public Optional<T> getResultAsOptional() {
        return Optional.ofNullable(data);
    }

    public T unwrap() throws BittrexApiException {
        if (data == null) {
            String errorMessage = String.format("Message from tct server: %s", this.message);
            throw new CoinwApiException(errorMessage);
        }
        return data;
    }

}
