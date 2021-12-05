package component;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import services.BotConfigService;

@Component
public class WeatherBot extends TelegramLongPollingBot {
    @Autowired
    private BotConfigService botConfigService;

    @Autowired
    private WeatherBotFacade weatherBotFacade;

//    private final String USER_NAME;
//
//    private final String ACCESS_TOKEN;

    public WeatherBot() {
        this.botConfigService = new BotConfigService();
        this.weatherBotFacade = new WeatherBotFacade();
    }

    @Override
    public String getBotUsername() {
        return "weather_get_c_bot";
//        return botConfigService.getBotUsername();
    }

    @Override
    public String getBotToken() {
        return "5068811508:AAHp_i0cS-UoOBKF8gekgG98X7UP5ooGbOg";
//        return botConfigService.getBotAccessToken();
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        weatherBotFacade.handleUpdate(update);
    }
}
