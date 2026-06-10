package com.doug.cryptotracker.client;

import com.doug.cryptotracker.dto.CotacaoResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Avisamos ao Spring que este é um comunicador que vai bater na porta da Binance
@FeignClient(name = "binanceClient", url = "https://api.binance.com")
public interface BinanceClient {

    // Dizemos o caminho exato e qual variável ele deve mandar (ex: symbol=BTCUSDT)
    @GetMapping("/api/v3/ticker/price")
    CotacaoResponseDTO buscarPreco(@RequestParam("symbol") String symbol);

}