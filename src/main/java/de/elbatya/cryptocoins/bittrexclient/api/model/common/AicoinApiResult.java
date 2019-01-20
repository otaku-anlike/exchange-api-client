package de.elbatya.cryptocoins.bittrexclient.api.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Optional;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AicoinApiResult<T> {
    private String count;
    private T data;


    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public Optional<T> getDataAsOptional() {
        return Optional.ofNullable(data);
    }

    public T unwrap() throws BittrexApiException {
        if (data == null) {
            String errorMessage = String.format("Message from Aicoin server: %s", this.count);
            throw new BittrexApiException(errorMessage);
        }
        return data;
    }

}
