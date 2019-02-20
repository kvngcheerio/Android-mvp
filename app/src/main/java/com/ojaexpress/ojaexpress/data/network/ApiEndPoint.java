package com.ojaexpress.ojaexpress.data.network;

import com.ojaexpress.ojaexpress.BuildConfig;
/**
 * Created by TerryCheerio on 11/1/17.
 */

public final class ApiEndPoint {

    public static final String ENDPOINT_SERVER_LOGIN = BuildConfig.BASE_URL + "v1/oauth/token";

    public static final String ENDPOINT_LOGOUT = BuildConfig.BASE_URL
            + "";

    public static final String ENDPOINT_SERVER_REGISTER = BuildConfig.BASE_URL
            + "register";

    public static final String ENDPOINT_SERVER_OJAEXPRESS = BuildConfig.BASE_URL
            + "products";

    public static final String ENDPOINT_SERVER_CATEGORIES = BuildConfig.BASE_URL
            + "categories";

    public static final String ENDPOINT_SERVER_TOP_PRODUCTS = BuildConfig.BASE_URL
            + "v1/top-products";

    public static final String ENDPOINT_SERVER_PRODUCTS = BuildConfig.BASE_URL
            + "products";




    private ApiEndPoint() {
        // This class is not publicly instantiable
    }

}
