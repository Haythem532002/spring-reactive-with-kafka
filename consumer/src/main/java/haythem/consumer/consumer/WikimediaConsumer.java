package haythem.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-topic")
    public void consumerMessage(String message) {
        log.info(String.format("Consuming message from wikimedia Stream %s", message));
    }
}
