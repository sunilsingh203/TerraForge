package com.sunilsingh.terraformgen.controller.Gemini;

import com.sunilsingh.terraformgen.service.Gemini.GeminiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AiController {
    private final GeminiService geminiService;
    public AiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }
    @GetMapping("/{question}")
    public String ask(@PathVariable String question) {
        return geminiService.getAnswer(question);
    }
}