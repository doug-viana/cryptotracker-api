package com.doug.cryptotracker.controller;

import com.doug.cryptotracker.dto.CotacaoResponseDTO;
import com.doug.cryptotracker.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cripto")
public class CryptoController {

    @Autowired
    private CryptoService service;

    // O usuário digita o nome da moeda na URL (ex: /cripto/btcusdt)
    @GetMapping("/{moeda}")
    public CotacaoResponseDTO cotacaoAoVivo(@PathVariable String moeda) {
        return service.obterCotacao(moeda);
    }
}