package org.velosaurus.core.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mtb_training")
public class MtbTraining implements Training{

    @Override
    public String Plan() {
        return "600hm uphill or 3000hm Downhill";
    }
}
