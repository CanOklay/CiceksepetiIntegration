package com.ciceksepeti.service;

import com.ciceksepeti.logs.Logs;
import com.ciceksepeti.model.Product;
import com.ciceksepeti.model.Response;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.List;
import java.util.Objects;

import static com.ciceksepeti.constants.Constants.*;

public class Service {

    Logger logger = LogManager.getLogger(Logs.class.getName());

    public static Response getFromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Response.class);
    }

    public String getResponse() {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(URL)
                    .header("Content-Type", "application/json")
                    .get()
                    .build();
            okhttp3.Response response = client.newCall(request).execute();
            logger.info(response);
            Assert.assertNotNull(response.body());
            String responseText = Objects.requireNonNull(response.body()).string();
            logger.info("Response: " + responseText);
            if (response.code() == 500) {
                logger.info("Response code: " + response.code());
                Assert.fail("Installment değeri null geldi!");
            }
            return responseText;
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("İstek gönderilemedi!");
            Assert.fail();
        }
        return null;
    }

    public List<Product> getProducts() {
        try {
            String responseJson = getResponse();
            Response response = getFromJson(responseJson);
            List<Product> products = response.getResult().getData().getProducts();
            logger.info("Products: " + products);
            return products;
        } catch (Exception e) {
            logger.error(e.getMessage());
            Assert.fail();
        }
        return null;
    }
}
