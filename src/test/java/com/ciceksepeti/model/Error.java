package com.ciceksepeti.model;

public class Error {

    private float type;
    private String title = null;
    private String message = null;
    private String returnUrl = null;


    // Getter Methods

    public float getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getReturnUrl() {
        return returnUrl;
    }
}
