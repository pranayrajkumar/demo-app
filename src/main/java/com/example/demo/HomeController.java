package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<html>" +
               "<head><title>EC2 Deployment Success</title></head>" +
               "<body style='font-family: Arial, sans-serif; text-align: center; margin-top: 100px;'>" +
               "  <h1 style='color: #2E7D32;'>🚀 Java Application Deployed Successfully!</h1>" +
               "  <p>Hosted inside a Docker Container on AWS EC2 via GitHub Actions.</p>" +
               "  <p><strong>Port:</strong> 8080</p>" +
               "</body>" +
               "</html>";
    }
}