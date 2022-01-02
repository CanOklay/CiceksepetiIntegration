package com.ciceksepeti.test;

import com.ciceksepeti.base.BasePage;
import org.testng.annotations.Test;

public class IntegrationTest extends BasePage {

    @Test(testName = "Installment değerine göre dönen sonuçların kontrol edilmesi")
    public void installmentTest() {
        checkInstallment();
    }

    @Test(testName = "InstallmentText değerine göre dönen sonuçların kontrol edilmesi")
    public void installmentTextTest() {
        checkInstallmentText();
    }

    @Test(testName = "ProductGroupId değerine göre dönen sonuçların kontrol edilmesi")
    public void productGroupIdTest() {
        checkProductGroupId();
    }
}
