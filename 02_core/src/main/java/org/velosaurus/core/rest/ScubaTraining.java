package org.velosaurus.core.rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ScubaTraining implements Training {

    public ScubaTraining() {
        System.out.println("Constructor called: " + getClass().getSimpleName());
    }

    @Override
    public String Plan() {
        return "800hm hiking";
    }
}
