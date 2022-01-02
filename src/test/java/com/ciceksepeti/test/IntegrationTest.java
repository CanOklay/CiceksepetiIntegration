package com.ciceksepeti.test;

import com.ciceksepeti.service.Service;
import org.testng.annotations.Test;

public class IntegrationTest extends Service {

    @Test(testName = "Installment değerine göre dönen sonuçların kontrol edilmesi")
    public void installmentTest() {
        getProducts();
    }

    @Test(testName = "InstallmentText değerine göre dönen sonuçların kontrol edilmesi")
    public void installmentTextTest() {

    }

    @Test(testName = "ProductGroupId değerine göre dönen sonuçların kontrol edilmesi")
    public void productGroupIdTest() {

    }
}
