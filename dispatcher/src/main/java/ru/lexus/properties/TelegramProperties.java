package ru.lexus.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("bot")
@Data
public class TelegramProperties {

    private String name;
    private String token;
}
