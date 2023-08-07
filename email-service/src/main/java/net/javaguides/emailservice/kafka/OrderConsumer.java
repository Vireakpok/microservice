package net.javaguides.emailservice.kafka;

import net.javaguides.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @Bean
    public Consumer<OrderEvent> consume(){
        return payload -> LOGGER.info(String.format("Order event received in email service => %s", payload.toString()));
    }
}
