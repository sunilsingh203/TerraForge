package com.sunilsingh.terraformgen.service.Gemini;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeminiService {
    private final ChatClient chatClient;
    public String getAnswer(String question) {
        String response = chatClient
                .prompt()
                .user(question)
                .call()
                .content();
        return response;
    }
}