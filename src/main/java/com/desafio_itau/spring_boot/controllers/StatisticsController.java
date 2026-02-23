package com.desafio_itau.spring_boot.controllers;

import com.desafio_itau.spring_boot.dtos.StatisticsResponse;
import com.desafio_itau.spring_boot.services.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
@AllArgsConstructor
public class StatisticsController {
    private final TransactionService service;

    @GetMapping
    public ResponseEntity<StatisticsResponse> getStatistics() {
        DoubleSummaryStatistics stats = service.getStatistics();
        return ResponseEntity.ok(new StatisticsResponse(stats));
    }
}
