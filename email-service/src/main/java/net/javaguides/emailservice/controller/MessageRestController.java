package net.javaguides.emailservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {
    @Value("${server.url:Unable to connect to config server}")
    private String url;

    @RequestMapping("/server/url/production")
    String getURL() {
        return this.url;
    }
}
