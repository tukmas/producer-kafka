package com.example.kafkamicroservice.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
public class Metrics {

    @NotNull(message = "metricsId should be not null!")
    private String metricsId;

    @NotNull(message = "metrics should be not null!")
    private List<Metric> metrics;
}
