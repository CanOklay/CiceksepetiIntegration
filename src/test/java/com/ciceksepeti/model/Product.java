package com.ciceksepeti.model;

public class Product {

    private boolean installment;
    private String installmentText;
    private String productGroupId;
    private String name;

    public String getName() {
        return name;
    }

    public boolean getInstallment() {
        return installment;
    }

    public String getInstallmentText() {
        return installmentText;
    }

    public String getProductGroupId() {
        return productGroupId;
    }
}
