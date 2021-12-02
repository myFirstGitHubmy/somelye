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
}
