package ru.lexus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.lexus.properties.TelegramProperties;

@SpringBootApplication
@EnableConfigurationProperties(TelegramProperties.class)
public class DispatcherApplication {

    public static void main(String[] args) {
        SpringApplication.run(DispatcherApplication.class);
    }
}
