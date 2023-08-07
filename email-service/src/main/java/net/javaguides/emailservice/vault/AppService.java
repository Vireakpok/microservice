package net.javaguides.emailservice.vault;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.emailservice.config.AppConfiguration;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AppService {
    private final AppConfiguration appConfiguration;

    @PostConstruct
    public void readConfig() {
        log.info("Reading configuration {} - {}", appConfiguration.getToken(), appConfiguration.getUsername());
    }
}
