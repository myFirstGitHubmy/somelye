package services;

import config.ChatConfig;
import enums.BotState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ChatConfigRepo;

@Service
public class ChatConfigService {

    private ChatConfigRepo chatConfigRepo;

    public boolean isChatInit(Long chatId){
        return chatConfigRepo.findAllByChatId(chatId)!=null;
    }

    public void initChat(Long chatId){
        chatConfigRepo.save(new ChatConfig(chatId, BotState.DEFAULT));
    }

    public void deleteChat(Long chatId){
        chatConfigRepo.deleteByChatId(chatId);
    }

    public void setBotState(Long chatId, BotState botState){
        ChatConfig config = chatConfigRepo.findAllByChatId(chatId);
        config.setBotState(botState);
        chatConfigRepo.save(config);
    }

    public BotState getBotState(Long chatId){
       return chatConfigRepo.findAllByChatId(chatId).getBotState();
    }

    public void setCity(Long chatId,String city){
        ChatConfig chatConfig = chatConfigRepo.findAllByChatId(chatId);
        chatConfig.setCity(city);
        chatConfigRepo.save(chatConfig);
    }

    public String getCity(Long chatId){
        return chatConfigRepo.findAllByChatId(chatId).getCity();
    }
}
