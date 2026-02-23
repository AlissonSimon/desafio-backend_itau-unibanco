package com.desafio_itau.spring_boot.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
public class TransactionRequest {
    @NotNull
    @Min(0)
    private Double valor;
    @NotNull
    private OffsetDateTime dataHora;
}
