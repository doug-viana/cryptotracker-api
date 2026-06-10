package com.doug.cryptotracker.service;

import com.doug.cryptotracker.client.BinanceClient;
import com.doug.cryptotracker.dto.CotacaoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CryptoService {

    @Autowired
    private BinanceClient binanceClient;

    @Cacheable(value = "cotacoes", key = "#moeda")
    public CotacaoResponseDTO obterCotacao(String moeda) {
        System.out.println("🚨 INDO NA BINANCE BUSCAR O PREÇO AO VIVO PARA: " + moeda.toUpperCase());
        return binanceClient.buscarPreco(moeda.toUpperCase());
    }

    // --- NOVO: O ROBÔ FAXINEIRO ---
    // fixedRate = 60000 significa que ele vai rodar a cada 60.000 milissegundos (1 minuto)
    // CacheEvict avisa qual gaveta ele deve esvaziar
    @CacheEvict(value = "cotacoes", allEntries = true)
    @Scheduled(fixedRate = 60000)
    public void limparCacheDeCotacoes() {
        System.out.println("🧹 [FAXINA] Limpando o cache de cotações! A próxima requisição pegará o preço atualizado.");
    }
}