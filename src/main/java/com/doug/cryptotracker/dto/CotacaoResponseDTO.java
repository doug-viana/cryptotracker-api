package com.doug.cryptotracker.dto;

// O Spring vai pegar o JSON da Binance e colar automaticamente aqui dentro!
public record CotacaoResponseDTO(
        String symbol,
        String price
) {
}