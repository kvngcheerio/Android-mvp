package com.ojaexpress.ojaexpress.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TerryCheerio on 11/3/17.
 */

public class RegisterRequest {
    private RegisterRequest() {
        // This class is not publicly instantiable
    }

    public static class ServerRegisterRequest {
        @Expose
        @SerializedName("firstname")
        private String firstname;

        @Expose
        @SerializedName("lastname")
        private String lastname;

        @Expose
        @SerializedName("email")
        private String email;


        @Expose
        @SerializedName("password")
        private String password;

        public ServerRegisterRequest(String firstname, String lastname, String email, String password) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
            this.password = password;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


    }



}
