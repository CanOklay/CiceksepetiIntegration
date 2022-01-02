package com.ciceksepeti.base;

import com.ciceksepeti.logs.Logs;
import com.ciceksepeti.model.Product;
import com.ciceksepeti.service.Service;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.List;

import static com.ciceksepeti.constants.Constants.*;

public class BasePage extends Service {

    Logger logger = LogManager.getLogger(Logs.class.getName());

    public void checkInstallment() {
        try {
            List<Product> products = getProducts();
            for (Product product : products) {
                boolean productInstallment = product.getInstallment();
                if (productInstallment) {
                    logger.info("Bu üründe taksit seçeneği bulunuyor: " + product.getName());
                } else {
                    logger.info("Taksit seçeneği bulunmayan ürün: " + product.getName());
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Kontrol başarısız!");
            Assert.fail();
        }
    }

    public void checkInstallmentText() {
        try {
            List<Product> products = getProducts();
            for (Product product : products) {
                String  productInstallmentText = product.getInstallmentText();
                if (productInstallmentText.contains(EXPECTED_INSTALLMENT_TEXT)) {
                    logger.info("Bu üründe taksit seçeneği bulunuyor: " + product.getName());
                } else {
                    logger.info("Taksit seçeneği bulunmayan ürün: " + product.getName());
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Kontrol başarısız!");
            Assert.fail();
        }
    }

    public void checkProductGroupId() {
        try {
            List<Product> products = getProducts();
            for (Product product : products) {
                String productGroupId = product.getProductGroupId();
                if (productGroupId.equals("1")) {
                    logger.info("Bu üründe taksit seçeneği bulunuyor: " + product.getName());
                } else {
                    logger.info("Taksit seçeneği bulunmayan ürün: " + product.getName());
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Kontrol başarısız!");
            Assert.fail();
        }
    }
}
