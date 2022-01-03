package com.ciceksepeti.installment;

import com.ciceksepeti.base.BaseTest;
import com.ciceksepeti.model.InstallmentResponse;
import com.ciceksepeti.model.Product;
import okhttp3.Response;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

import static com.ciceksepeti.constants.Constants.*;

public class InstallmentTest extends BaseTest {

    public void shouldCheckInstallment(String url) throws IOException {
        Response response = getResponse(url);
        Assert.assertEquals(response.code(), 200);
        InstallmentResponse installmentResponse = getFromJson(response.body().string());
        List<Product> products = installmentResponse.getResult().getData().getProducts();
        for (Product product : products) {
            boolean productInstallment = product.getInstallment();
            Assert.assertTrue(productInstallment, "Bu üründe taksit seçeneği bulunuyor: " + product.getName());
        }
    }

    public void shouldCheckInstallmentText(String url) throws IOException {
        Response response = getResponse(url);
        Assert.assertEquals(response.code(), 200);
        InstallmentResponse installmentResponse = getFromJson(response.body().string());
        List<Product> products = installmentResponse.getResult().getData().getProducts();
        for (Product product : products) {
            String productInstallmentText = product.getInstallmentText();
            Assert.assertTrue(productInstallmentText.contains(EXPECTED_INSTALLMENT_TEXT), "Bu üründe taksit seçeneği bulunuyor: " + product.getName());
        }
    }

    public void shouldCheckProductGroupId(String url) throws IOException {
        Response response = getResponse(url);
        Assert.assertEquals(response.code(), 200);
        InstallmentResponse installmentResponse = getFromJson(response.body().string());
        List<Product> products = installmentResponse.getResult().getData().getProducts();
        for (Product product : products) {
            String productGroupId = product.getProductGroupId();
            Assert.assertEquals(productGroupId, "1", "Bu üründe taksit seçeneği bulunuyor: " + product.getName());
        }
    }

    public void shouldReturnNull(String url) throws IOException {
        Response response = getResponse(url);
        Assert.assertEquals(response.code(), 500);
    }
}
