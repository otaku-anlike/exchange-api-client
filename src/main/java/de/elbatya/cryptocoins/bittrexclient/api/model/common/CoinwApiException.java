package de.elbatya.cryptocoins.bittrexclient.api.model.common;

/**
 * @author contact@elbatya.de
 */
public class CoinwApiException extends RuntimeException {

    public CoinwApiException() {
    }

    public CoinwApiException(String message) {
        super(message);
    }

    public CoinwApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinwApiException(Throwable cause) {
        super(cause);
    }

    public CoinwApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
