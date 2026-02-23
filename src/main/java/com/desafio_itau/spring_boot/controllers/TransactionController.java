package com.desafio_itau.spring_boot.controllers;

import com.desafio_itau.spring_boot.domain.Transaction;
import com.desafio_itau.spring_boot.dtos.TransactionRequest;
import com.desafio_itau.spring_boot.services.TransactionService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transacao")
@AllArgsConstructor
public class TransactionController {
    private final TransactionService service;

    @PostMapping
    public ResponseEntity<Void> createTransaction(@Valid @RequestBody TransactionRequest request) {
        if (request.getDataHora().isAfter(OffsetDateTime.now())) {
            return ResponseEntity.unprocessableContent().build();
        }
        service.addTransaction(new Transaction(request.getValor(), request.getDataHora()));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransactions() {
        service.clearTransactions();
        return ResponseEntity.ok().build();
    }
}
