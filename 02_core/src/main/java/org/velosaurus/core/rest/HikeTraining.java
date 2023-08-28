package org.velosaurus.core.rest;

import org.springframework.stereotype.Component;

@Component
public class HikeTraining implements Training{

    public HikeTraining() {
        System.out.println("Constructor called: " + getClass().getSimpleName());
    }

    @Override
    public String Plan() {
        return "800hm hiking";
    }
}
