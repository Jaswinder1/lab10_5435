package com.example.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/client/frontend")
    public String hi() {
        // Call the backend service registered as "server"
        String randomString = restTemplate.getForObject("http://server/backend", String.class);
        return "server Response :: " + randomString;
    }
}
