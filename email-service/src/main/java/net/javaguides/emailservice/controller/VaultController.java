package net.javaguides.emailservice.controller;

import net.javaguides.emailservice.config.AppConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/vault")
public class VaultController {

    private final AppConfiguration appConfiguration;

    public VaultController(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    @GetMapping
    String getConfiguration() {
        return this.appConfiguration.getUsername().concat(" ").concat(this.appConfiguration.getToken());
    }
}
