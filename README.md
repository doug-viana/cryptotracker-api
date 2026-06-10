# CryptoTracker API 🚀

API de integração de alta performance construída com Spring Boot, focada em consumo de dados externos e otimização de recursos.

## 📌 Sobre o Projeto
O CryptoTracker é um sistema que integra a sua aplicação Java com a API oficial da **Binance**. Ele não apenas busca cotações em tempo real, mas implementa técnicas avançadas de engenharia de software para garantir escalabilidade e resiliência.

## 🛠️ Tecnologias Utilizadas
* **Java 21**
* **Spring Boot 3.2.x**
* **Spring Cloud OpenFeign:** Para integração declarativa e simplificada com serviços REST externos.
* **Spring Cache:** Para evitar sobrecarga na API de terceiros, mantendo dados em memória de curto prazo.
* **Spring Scheduling:** Para automação de tarefas de limpeza (limpeza de cache programada).

## 💡 Diferenciais Técnicos
1. **Performance:** Utilização de cache (Redis ou RAM) para reduzir latência e evitar bloqueios por excesso de requisições (Rate Limiting).
2. **Resiliência:** Implementação de rotinas de limpeza automática para garantir que o usuário nunca receba dados obsoletos.
3. **Clean Architecture:** Código organizado em camadas (Controller, Service, Client, DTO) seguindo as melhores práticas de mercado.

## 🚀 Como rodar
1. Clone este repositório.
2. Certifique-se de ter o JDK 21 instalado.
3. Execute a classe `CryptotrackerApplication`.
4. Acesse o endpoint: `http://localhost:8080/cripto/{moeda}` (ex: `btcusdt`).