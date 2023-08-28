package org.velosaurus.core.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ScubaTraining implements Training {

    public ScubaTraining() {
        System.out.println("Constructor called: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartupStuff() {
        System.out.println("Bean Lifecycle Startup method called in " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doDCleanupStuff() {
        System.out.println("Bean Lifecycle Cleanup method called in " + getClass().getSimpleName());
    }

    @Override
    public String Plan() {
        return "800hm hiking";
    }
}
