package com.finsecure.finsecurepay;

import com.finsecure.finsecurepay.controller.ValidationController;
import com.finsecure.finsecurepay.dto.TransactionRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationControllerTest {

    @Test
    void validTransaction() {

        ValidationController controller =
                new ValidationController();

        TransactionRequest request =
                new TransactionRequest();

        request.setAccountNumber("ACC1001");
        request.setAmount(500.0);
        request.setCurrency("SGD");

        assertTrue(controller.validate(request).isValid());
    }

    @Test
    void invalidAmount() {

        ValidationController controller =
                new ValidationController();

        TransactionRequest request =
                new TransactionRequest();

        request.setAccountNumber("ACC1001");
        request.setAmount(-10.0);
        request.setCurrency("SGD");

        assertFalse(controller.validate(request).isValid());
    }
}