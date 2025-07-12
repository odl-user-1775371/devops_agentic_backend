package com.example.demo.controller;

import com.example.demo.model.ContactForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @PostMapping
    public String submitContact(@RequestBody ContactForm form) {
        logger.info("Received contact form: Name={}, Email={}, Message={}", form.getName(), form.getEmail(), form.getMessage());
        return "Contact form submitted successfully!";
    }
}
