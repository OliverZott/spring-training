package org.velosaurus.core.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MtbTraining implements Training{

    @Override
    public String Plan() {
        return "600hm uphill or 3000hm Downhill";
    }
}
