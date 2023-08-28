package org.velosaurus.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.velosaurus.utils.Gear;

@RestController
public class TrainingController {

    private final Training training;
    private final Training secondTraining;
    private final Gear gear;


    @Autowired
    public TrainingController(@Qualifier("scubaTraining") Training training, @Qualifier("swimTraining") Training secondTraining, Gear gear) {
        System.out.println("Constructor called: " + getClass().getSimpleName());

        this.secondTraining = secondTraining;
        this.training = training;
        this.gear = gear;
    }


    @GetMapping("training")
    public String GetTraining() {
        return secondTraining.Plan();
    }

    @GetMapping("gear")
    public String GetGear() {
        return gear.ShowGear().toString();
    }

    @GetMapping("/check")
    public String CheckScope() {
        var trainingHashCode = System.identityHashCode(training);
        var trainingHashCode2 = System.identityHashCode(secondTraining);
        boolean result = trainingHashCode == trainingHashCode2;
        return "Comparing Training instances hash codes: "
                + trainingHashCode
                + " == "
                + trainingHashCode2
                + " is "
                + result;
    }
}
