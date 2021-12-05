package component;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class BotInit {
    @Autowired
    private WeatherBot weatherBot;

//    public BotInit(){
//        this.weatherBot = new WeatherBot();
//    }

    @EventListener({Application.class})
    public void init() throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        try {
            telegramBotsApi.registerBot(weatherBot);
        }catch (TelegramApiRequestException e){
            e.printStackTrace();
        }
    }
}
