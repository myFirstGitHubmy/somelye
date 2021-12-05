package somelye.exemple;

import component.BotInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class Application {
    public static void main(String[] args) throws TelegramApiException {
        SpringApplication.run(Application.class, args);
        try{
            BotInit bi = new BotInit();
            bi.init();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
