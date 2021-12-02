package repo;

import config.ChatConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ChatConfigRepo extends MongoRepository<ChatConfig, BigInteger> {
    ChatConfig findAllByChatId(Long chatId);
    void deleteByChatId(Long chatId);
}
