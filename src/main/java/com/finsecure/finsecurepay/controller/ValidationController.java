package com.finsecure.finsecurepay.controller;

import com.finsecure.finsecurepay.dto.TransactionRequest;
import com.finsecure.finsecurepay.dto.ValidationResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class ValidationController {

    @PostMapping("/validate")
    public ValidationResponse validate(
            @RequestBody TransactionRequest request) {

        if (request.getAmount() <= 0) {
            return new ValidationResponse(
                    false,
                    "Invalid amount");
        }

        if (request.getAccountNumber() == null ||
            request.getAccountNumber().isEmpty()) {

            return new ValidationResponse(
                    false,
                    "Account missing");
        }

        if (!request.getCurrency().equals("SGD") &&
            !request.getCurrency().equals("USD")) {

            return new ValidationResponse(
                    false,
                    "Unsupported currency");
        }

        return new ValidationResponse(
                true,
                "Transaction valid");
    }
}