package com.laurentsolutions.chatbot.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatBotController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from ChatBot!";
    }

    @PostMapping("/message")
    public String receiveMessage(@RequestBody String message) {
        return "I am your chatbot assistant, you sent a message: " + message;
    }
}
