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

    private String botName;

    private String accessToken;

    private List<Command> commands;
}
