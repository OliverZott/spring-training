package org.velosaurus.core.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hike_training")
public class HikeTraining implements Training{

    @Override
    public String Plan() {
        return "800hm hiking";
    }
}
