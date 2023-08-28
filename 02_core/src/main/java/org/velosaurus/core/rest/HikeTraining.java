package org.velosaurus.core.rest;

import org.springframework.stereotype.Component;

@Component
public class HikeTraining implements Training{

    @Override
    public String Plan() {
        return "800hm hiking";
    }
}
