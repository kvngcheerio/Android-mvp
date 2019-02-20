package com.ojaexpress.ojaexpress.data.network.model;

/**
 * Created by TerryCheerio on 11/1/17.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class LoginResponse {

    @Expose
    @SerializedName("status_code")
    private String statusCode;

    @Expose
    @SerializedName("id")
    private Long Id;

    @Expose
    @SerializedName("access_token")
    private String accessToken;

    @Expose
    @SerializedName("username")
    private String userName;

    @Expose
    @SerializedName("first_name")
    private String firstName;

    @Expose
    @SerializedName("last_name")
    private String lastName;

    @Expose
    @SerializedName("gender")
    private String userGender;

    @Expose
    @SerializedName("birth")
    private String userBirth;

    @Expose
    @SerializedName("country_id")
    private String countryId;

    @Expose
    @SerializedName("zip_code")
    private String zipCode;

    @Expose
    @SerializedName("phone_number")
    private String phoneNumber;


    @Expose
    @SerializedName("email")
    private String email;

    @Expose
    @SerializedName("avatar")
    private String userAvatar;


    @Expose
    @SerializedName("message")
    private String message;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getUserEmail() {
        return email;
    }

    public void setUserEmail(String email) {
        this.email = email;
    }


    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        LoginResponse that = (LoginResponse) object;

        if (statusCode != null ? !statusCode.equals(that.statusCode) : that.statusCode != null)
            return false;
        if (Id != null ? !Id.equals(that.Id) : that.Id != null) return false;
        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null)
            return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null)
            return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null)
            return false;
        if (userBirth != null ? !userBirth.equals(that.userBirth) : that.userBirth != null)
            return false;
        if (userGender != null ? !userGender.equals(that.userGender) : that.userGender != null)
            return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null)
            return false;
        if (userAvatar != null ? !userAvatar.equals(that.userAvatar)
                : that.userAvatar != null)
            return false;

        return message != null ? message.equals(that.message) : that.message == null;

    }

    @Override
    public int hashCode() {
        int result = statusCode != null ? statusCode.hashCode() : 0;
        result = 31 * result + (Id != null ? Id.hashCode() : 0);
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (userAvatar != null ? userAvatar.hashCode() : 0);
        result = 31 * result + (userGender != null ? userGender.hashCode() : 0);
        result = 31 * result + (userBirth != null ? userBirth.hashCode() : 0);
       result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }
}

