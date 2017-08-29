package org.redlich.meecrowave.jaxrs;

import javax.enterprise.context.Dependent;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Dependent
@ApplicationPath("redlich")
public class SimpleApplication extends Application {
    }
