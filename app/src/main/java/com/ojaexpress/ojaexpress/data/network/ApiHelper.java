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

import io.reactivex.Observable;

/**
 * Created by TerryCheerio on 11/1/17.
 */

public interface ApiHelper {

    ApiHeader getApiHeader();

    Observable<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);
    Observable<LogoutResponse> doLogoutApiCall();
    Observable<RegisterResponse> doServerRegisterApiCall(RegisterRequest.ServerRegisterRequest request);
    Observable<OjaexpressResponse> getOjaexpressApiCall();
    Observable<CategoriesResponse> getCategoriesApiCall();
    Observable<TopProductsResponse> getTopProductsApiCall();
    Observable<ProductsResponse> getProductsApiCall();


}
