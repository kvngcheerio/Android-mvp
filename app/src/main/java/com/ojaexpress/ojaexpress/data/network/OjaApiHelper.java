package com.ojaexpress.ojaexpress.data.network;

import com.ojaexpress.ojaexpress.data.network.model.CategoriesResponse;
import com.ojaexpress.ojaexpress.data.network.model.LoginRequest;
import com.ojaexpress.ojaexpress.data.network.model.LoginResponse;
import com.ojaexpress.ojaexpress.data.network.model.LogoutResponse;

import com.ojaexpress.ojaexpress.data.network.model.OjaexpressResponse;
import com.ojaexpress.ojaexpress.data.network.model.ProductsResponse;
import com.ojaexpress.ojaexpress.data.network.model.RegisterRequest;
import com.ojaexpress.ojaexpress.data.network.model.RegisterResponse;
import com.ojaexpress.ojaexpress.data.network.model.TopProductsResponse;
import com.rx2androidnetworking.Rx2AndroidNetworking;


import javax.inject.Inject;
import javax.inject.Singleton;


import io.reactivex.Observable;

/**
 * Created by TerryCheerio on 11/1/17.
 */

@Singleton
public class OjaApiHelper implements ApiHelper {

    private ApiHeader mApiHeader;

    @Inject
    public OjaApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHeader;
    }


    @Override
    public Observable<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest
                                                                  request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectObservable(LoginResponse.class);
    }

    @Override
    public Observable<RegisterResponse> doServerRegisterApiCall(RegisterRequest.ServerRegisterRequest
                                                                        request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_REGISTER)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(RegisterResponse.class);
    }

    @Override
    public Observable<LogoutResponse> doLogoutApiCall() {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_LOGOUT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectObservable(LogoutResponse.class);
    }

   @Override
    public Observable<OjaexpressResponse> getOjaexpressApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_OJAEXPRESS)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectObservable(OjaexpressResponse.class);
    }

    @Override
    public Observable<CategoriesResponse> getCategoriesApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_CATEGORIES)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectObservable(CategoriesResponse.class);
    }

    @Override
    public Observable<TopProductsResponse> getTopProductsApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_TOP_PRODUCTS)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectObservable(TopProductsResponse.class);
    }
    @Override
    public Observable<ProductsResponse> getProductsApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_PRODUCTS)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectObservable(ProductsResponse.class);
    }



}

