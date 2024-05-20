package com.example.kafkamicroservice.service;

import com.example.kafkamicroservice.model.Metrics;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaService {

    private final KafkaTemplate<String, Metrics> template;
    public static String METRICS_TOPIC = "metrics-topic";
    public void sendMetrics(Metrics metrics) {
        log.info("sendMetrics: {}", metrics);
        template.send(METRICS_TOPIC, metrics);
    }
}
