package config;

import com.sun.javafx.beans.IDProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collation = "bot_config")
public class BotConfig {
    @Id
    private BigInteger id;

    private String botName = "weather_get_c_bot";

    private String accessToken = "5068811508:AAHp_i0cS-UoOBKF8gekgG98X7UP5ooGbOg";

    private String tokenOpenWeather = "7726e13fc7f9181c60fba8f815942106";

    private List<Command> commands;

    /**https://api.openweathermap.org/data/2.5/weather?q=Perm&appid=7726e13fc7f9181c60fba8f815942106&units=metric&lang=ru*/
    private String nowWeatherApiTemp = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid="+ tokenOpenWeather +"&units=metric&lang=ru";

    private String telegramCallbackAnswerTemp = "https://api.telegram.org/bot{token}/answerCallbackQuery?callback_query_id={id}";
}
