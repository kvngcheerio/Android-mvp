package com.ojaexpress.ojaexpress.data.network;

/**
 * Created by TerryCheerio on 11/1/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApiHeader {

    private ProtectedApiHeader mProtectedApiHeader;
    private PublicApiHeader mPublicApiHeader;

    @Inject
    public ApiHeader(PublicApiHeader publicApiHeader, ProtectedApiHeader protectedApiHeader) {
        mPublicApiHeader = publicApiHeader;
        mProtectedApiHeader = protectedApiHeader;
    }

    public ProtectedApiHeader getProtectedApiHeader() {
        return mProtectedApiHeader;
    }

    public PublicApiHeader getPublicApiHeader() {
        return mPublicApiHeader;
    }

    public static final class PublicApiHeader {


    }

    public static final class ProtectedApiHeader {
        @Expose
        @SerializedName("id")
        private Long mId;

        @Expose
        @SerializedName("access_token")
        private String mAccessToken;

        public ProtectedApiHeader(Long mId, String mAccessToken) {
            this.mId = mId;
            this.mAccessToken = mAccessToken;
        }

        public Long getId() {
            return mId;
        }

        public void setId(Long mId) {
            this.mId = mId;
        }

        public String getAccessToken() {
            return mAccessToken;
        }

        public void setAccessToken(String accessToken) {
            mAccessToken = accessToken;
        }
    }
}
