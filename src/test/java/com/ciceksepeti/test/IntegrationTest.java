package com.ciceksepeti.test;

import com.ciceksepeti.installment.InstallmentTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.ciceksepeti.constants.Constants.*;

public class IntegrationTest extends InstallmentTest {

    @Test(testName = "Check values according to Installment=0 path")
    public void installmentZeroTest() throws IOException {
        shouldCheckInstallment(URL_INSTALLMENT_0);
        shouldCheckInstallmentText(URL_INSTALLMENT_0);
        shouldCheckProductGroupId(URL_INSTALLMENT_0);
    }

    @Test(testName = "Check values according to Installment=1 path")
    public void installmentOneTest() throws IOException {
        shouldCheckInstallment(URL_INSTALLMENT_1);
        shouldCheckInstallmentText(URL_INSTALLMENT_1);
        shouldCheckProductGroupId(URL_INSTALLMENT_1);
    }

    @Test(testName = "Check values according to Installment=null path")
    public void installmentNullTest() throws IOException {
        shouldReturnNull(URL_INSTALLMENT_NULL);
    }
}
