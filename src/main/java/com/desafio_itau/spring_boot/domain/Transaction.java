package com.desafio_itau.spring_boot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private Double valor;
    private OffsetDateTime dataHora;
}
