package org.redlich.meecrowave.configuration;

import org.apache.meecrowave.Meecrowave;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@Dependent
public class DefaultsProducer {
    @Inject
    private Meecrowave.Builder builder;

    @Produces
    @ApplicationScoped
    public Defaults defaults() {
        return builder.getExtension(Defaults.class);
        }
    }
