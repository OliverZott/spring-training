package org.velosaurus.core.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MtbTraining implements Training {

    public MtbTraining() {
        System.out.println("Constructor called: " + getClass().getSimpleName());
    }

    @Override
    public String Plan() {
        return "600hm uphill or 3000hm Downhill";
    }
}
