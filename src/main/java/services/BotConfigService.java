package services;

import config.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.BotConfigRepo;

import java.util.List;

@Service
public class BotConfigService {
    @Autowired
    private BotConfigRepo botConfigRepo;

    public List<Command> getAllCommands(){
        return botConfigRepo.findAll().get(0).getCommands();
    }

    public String getBotAccessToken(){
        return botConfigRepo.findAll().get(0).getAccessToken();
    }

    public String getTelegramCallbackAnswerTemp(){
        return this.botConfigRepo.findAll().get(0).getTelegramCallbackAnswerTemp();
    }

    public String getNowApiTemp(){
        return this.botConfigRepo.findAll().get(0).getNowWeatherApiTemp();
    }

    public String getBotUsername(){
        return botConfigRepo.findAll().get(0).getBotName();
    }
}
