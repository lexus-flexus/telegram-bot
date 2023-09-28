package ru.lexus.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.lexus.properties.TelegramProperties;

@Component
@RequiredArgsConstructor
public class TelegramBot extends TelegramLongPollingBot {

    private final TelegramProperties telegramProperties;

    @Override
    public void onUpdateReceived(Update update) {
        var originalMessage = update.getMessage();
        System.out.println(originalMessage.getText());
    }

    @Override
    public String getBotToken() {
        return telegramProperties.getToken();
    }

    @Override
    public String getBotUsername() {
        return telegramProperties.getName();
    }
}
