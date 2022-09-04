package recofit.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import recofit.registration.dto.*;

@Service
public class KafkaProducer {
    private static final String TOPIC = "recofit_regstration_topic";
    private final KafkaTemplate<String, RegistrationDto> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(RegistrationDto regDto) {
        System.out.println(String.format("Produce message : %s", regDto.toString()));
        this.kafkaTemplate.send(TOPIC, regDto);
    }
}