package de.elbatya.cryptocoins.bittrexclient.api.model.common;

import java.util.Optional;

/**
 * @author contact@elbatya.de
 */
public class EthApiResult<T> {
    private String status;
    private String message;
    private T result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public Optional<T> getResultAsOptional() {
        return Optional.ofNullable(result);
    }

    public T unwrap() throws BittrexApiException {
        if (result == null) {
            String errorMessage = String.format("Message from tct server: %s", this.message);
            throw new CoinwApiException(errorMessage);
        }
        return result;
    }

}
