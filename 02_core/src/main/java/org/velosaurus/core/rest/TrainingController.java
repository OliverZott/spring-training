package org.velosaurus.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.velosaurus.utils.Gear;

@RestController
public class TrainingController {

//    Setter Injection
//    @Autowired
//    @Qualifier("mtb_training")
//    private final Training training;

    private final Training training;
    private final Gear gear;


    @Autowired
    public TrainingController(@Qualifier("mtb_training") Training training, Gear gear) {

        this.training = training;
        this.gear = gear;
    }


    @GetMapping("training")
    public String GetTraining() {
        return training.Plan();
    }

    @GetMapping("gear")
    public String GetGear() {
        return gear.ShowGear().toString();
    }
}
