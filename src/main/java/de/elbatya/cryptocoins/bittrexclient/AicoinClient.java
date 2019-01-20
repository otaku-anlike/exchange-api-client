package de.elbatya.cryptocoins.bittrexclient;


import de.elbatya.cryptocoins.bittrexclient.api.AicoinPublicApi;
import de.elbatya.cryptocoins.bittrexclient.config.ApiBuilderFactory;
import de.elbatya.cryptocoins.bittrexclient.config.ApiCredentials;
import feign.Feign;
import feign.Logger;
import feign.Util;
import feign.slf4j.Slf4jLogger;

import javax.annotation.Nullable;

/**
 * @author contact@elbatya.de
 */
public class AicoinClient {

    public static final String DEFAULT_BASE_URL = "https://widget.aicoin.net.cn/chart/api/data";

    private AicoinPublicApi publicApi;

    private boolean credentialsAvailable = true;

    public AicoinClient() {
        this(DEFAULT_BASE_URL, null, null);
    }

    public AicoinClient(@Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, null, logLevel);
    }

    public AicoinClient(@Nullable ApiCredentials credentials) {
        this(DEFAULT_BASE_URL, credentials, null);
    }

    public AicoinClient(@Nullable ApiCredentials credentials, @Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, credentials, logLevel);
    }


    public AicoinClient(
            String baseUrl,
            @Nullable ApiCredentials credentials,
            @Nullable Logger.Level logLevel)
    {
        Util.checkNotNull(baseUrl, "The baseUrl must not be null!");

        ApiBuilderFactory apiBuilderFactory = new ApiBuilderFactory(baseUrl);

        Feign.Builder apiBuilder = apiBuilderFactory.createApiBuilder(credentials);

        if (logLevel != null) {
            apiBuilder
                    .logger(new Slf4jLogger(AicoinClient.class))
                    .logLevel(logLevel);
        }

        publicApi = apiBuilder.target(AicoinPublicApi.class, baseUrl);

        credentialsAvailable = credentials != null;


    }

    public AicoinPublicApi getPublicApi() {
        return publicApi;
    }

    private void failIfNoCredentials(String message){
        if(!credentialsAvailable){
            throw new RuntimeException(message);
        }
    }
}
