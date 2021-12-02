package config;

import enums.BotState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "chats_config")
public class ChatConfig {
    @Id
    private BigDecimal id;

    @NonNull
    private Long chatId;

    @NonNull
    @Field(targetType = FieldType.STRING)
    private BotState botState;
}
