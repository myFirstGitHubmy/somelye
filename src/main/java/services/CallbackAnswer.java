package services;

import lombok.Builder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;

@Service
public class CallbackAnswer {
    @Autowired
    private BotConfigService botConfigService;

    public void callbackAnswer(String callbackId) throws IOException, InterruptedException {
//        HttpClient telegramApiClient =  new HttpClient();
//        HttpRequest telegramCallbackAnswerReq = new Builder(
//                URI.create(botConfigService
//                        .getTelegramCallbackAnswerTemp()
//                        .replace("{token}", botConfigService.getBotAccessToken())
//                        .replace("{id}", callbackId)))
//                .GET().build();
//
//        telegramApiClient.send(telegramCallbackAnswerReq, HttpResponse.BodyHandlers
//                .ofString());
    }
}
