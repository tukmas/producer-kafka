package com.example.kafkamicroservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Metric {
    private Long usedTimeMs;
    private Long usedMemoryMb;
    private String serviceName;
    private Boolean wasError;
}
