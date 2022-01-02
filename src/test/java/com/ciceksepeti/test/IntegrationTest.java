package com.ciceksepeti.test;

import com.ciceksepeti.installment.InstallmentTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.ciceksepeti.constants.Constants.*;

public class IntegrationTest extends InstallmentTest {

    @Test(testName = "Installment=0 değerine göre dönen sonuçların kontrol edilmesi")
    public void installmentZeroTest() throws IOException {
        shouldCheckInstallment(URL_INSTALLMENT_0);
        shouldCheckInstallmentText(URL_INSTALLMENT_0);
        shouldCheckProductGroupId(URL_INSTALLMENT_0);
    }

    @Test(testName = "Installment=1 değerine göre dönen sonuçların kontrol edilmesi")
    public void installmentOneTest() throws IOException {
        shouldCheckInstallment(URL_INSTALLMENT_1);
        shouldCheckInstallmentText(URL_INSTALLMENT_1);
        shouldCheckProductGroupId(URL_INSTALLMENT_1);
    }

    @Test(testName = "Installment=null değerine göre dönen sonuçların kontrol edilmesi")
    public void installmentNullTest() throws IOException {
        shouldReturnNull(URL_INSTALLMENT_NULL);
    }
}
