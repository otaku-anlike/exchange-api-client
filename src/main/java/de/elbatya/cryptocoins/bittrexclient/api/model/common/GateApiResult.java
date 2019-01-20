package de.elbatya.cryptocoins.bittrexclient.api.model.common;

import java.util.Optional;

/**
 * @author contact@elbatya.de
 */
public class GateApiResult<T> {
    private String elapsed;
    private boolean result;
    private T data;

    public String getElapsed() {
        return elapsed;
    }

    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public T getData() {
        return data;
    }

    public Optional<T> getResultAsOptional() {
        return Optional.ofNullable(data);
    }

    public T unwrap() throws BittrexApiException {
        if (data == null) {
            //TODO String errorMessage = String.format("Message from gate server: %s", this.msg);
            String errorMessage = "Message from gate server: error";
            throw new CoinwApiException(errorMessage);
        }
        return data;
    }

}
