package org.velosaurus.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {

//    Setter Injection
//    @Autowired
//    @Qualifier("mtb_training")
//    private final Training training;

    private final Training training;

    @Autowired
    public TrainingController(@Qualifier("mtb_training") Training training) {

        this.training = training;
    }


    @GetMapping("training")
    public String GetTraining() {
        return training.Plan();
    }
}
