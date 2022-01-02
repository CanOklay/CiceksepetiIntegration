package com.ciceksepeti.model;

import java.util.List;

public class Response {

    private List<String> products;
    private String productGroupId;
    private String installmentText;
    private boolean installment;

    public List<String> getProducts() {
        return products;
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public String getInstallmentText() {
        return installmentText;
    }

    public boolean getInstallment() {
        return installment;
    }
}
