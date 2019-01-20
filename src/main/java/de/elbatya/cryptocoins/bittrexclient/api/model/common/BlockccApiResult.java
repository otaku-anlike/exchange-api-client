package de.elbatya.cryptocoins.bittrexclient.api.model.common;

import java.util.Optional;

/**
 * @author contact@elbatya.de
 */
public class BlockccApiResult<T> {
    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public Optional<T> getDataAsOptional() {
        return Optional.ofNullable(data);
    }

    public T unwrap() throws BittrexApiException {
        if (data == null) {
            String errorMessage = String.format("Message from Bittrex server: %s", this.message);
            throw new BittrexApiException(errorMessage);
        }
        return data;
    }

}
