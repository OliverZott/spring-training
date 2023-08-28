package org.velosaurus.core.rest;

public class SwimTraining implements Training {

    public SwimTraining() {
        System.out.println("Constructor called: " + getClass().getSimpleName());
    }

    @Override
    public String Plan() {
        return "Some swimming";
    }
}
