package org.velosaurus.core.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrainingConfig {

    @Bean
    public Training swimTraining() {
        return new SwimTraining();
    }
}
