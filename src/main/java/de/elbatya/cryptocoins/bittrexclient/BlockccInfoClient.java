package de.elbatya.cryptocoins.bittrexclient;


import de.elbatya.cryptocoins.bittrexclient.api.BlockccInfoApi;
import de.elbatya.cryptocoins.bittrexclient.api.BlockccInfoApi;
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
public class BlockccInfoClient {

    public static final String DEFAULT_BASE_URL = "https://block.cc/api/v1";


    private BlockccInfoApi infoApi;

    private boolean credentialsAvailable = true;

    public BlockccInfoClient() {
        this(DEFAULT_BASE_URL, null, null);
    }

    public BlockccInfoClient(@Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, null, logLevel);
    }

    public BlockccInfoClient(@Nullable ApiCredentials credentials) {
        this(DEFAULT_BASE_URL, credentials, null);
    }

    public BlockccInfoClient(@Nullable ApiCredentials credentials, @Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, credentials, logLevel);
    }


    public BlockccInfoClient(
            String baseUrl,
            @Nullable ApiCredentials credentials,
            @Nullable Logger.Level logLevel)
    {
        Util.checkNotNull(baseUrl, "The baseUrl must not be null!");

        ApiBuilderFactory apiBuilderFactory = new ApiBuilderFactory(baseUrl);

        Feign.Builder apiBuilder = apiBuilderFactory.createApiBuilder(credentials);

        if (logLevel != null) {
            apiBuilder
                    .logger(new Slf4jLogger(BlockccInfoClient.class))
                    .logLevel(logLevel);
        }

        infoApi = apiBuilder.target(BlockccInfoApi.class, baseUrl);


        credentialsAvailable = credentials != null;


    }

    public BlockccInfoApi getInfoApi() {
        return infoApi;
    }

    private void failIfNoCredentials(String message){
        if(!credentialsAvailable){
            throw new RuntimeException(message);
        }
    }
}
