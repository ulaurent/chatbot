package com.laurentsolutions.chatbot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ChatBotService {

    private final WebClient webClient;

    public ChatBotService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public String getSampleData() {
        return this.webClient.get()
                .uri("/posts/1")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}

