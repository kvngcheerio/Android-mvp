package com.ojaexpress.ojaexpress.data.network.model;

/**
 * Created by TerryCheerio on 11/1/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class LoginRequest {

    private LoginRequest() {
        // This class is not publicly instantiable
    }

    public static class ServerLoginRequest {
        @Expose
        @SerializedName("username")
        private String username;

        @Expose
        @SerializedName("password")
        private String password;

        public ServerLoginRequest(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            ServerLoginRequest that = (ServerLoginRequest) object;

            if (username != null ? !username.equals(that.username) : that.username != null) return false;
            return password != null ? password.equals(that.password) : that.password == null;

        }

        @Override
        public int hashCode() {
            int result = username != null ? username.hashCode() : 0;
            result = 31 * result + (password != null ? password.hashCode() : 0);
            return result;
        }
    }



}
