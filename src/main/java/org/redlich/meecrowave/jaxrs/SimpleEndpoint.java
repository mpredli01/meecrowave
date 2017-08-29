package org.redlich.meecrowave.jaxrs;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.redlich.meecrowave.configuration.Defaults;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import static java.util.Optional.ofNullable;

@Path("meecrowave")
@ApplicationScoped
public class SimpleEndpoint {
    @Inject
    private Defaults defaults;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Hello sayFullName(@QueryParam("firstName") final String firstName,@QueryParam("lastName") final String lastName) {
        return new Hello(ofNullable(firstName).orElse(defaults.getFirstName()),ofNullable(lastName).orElse(defaults.getLastName()));
        }

    public static class Hello {
        private String firstName;
        private String lastName;

        public Hello() {
            }

        private Hello(final String firstName,final String lastName) {
            setFirstName(firstName);
            setLastName(lastName);
            }

        public String getFirstName() {
            return firstName;
            }

        public void setFirstName(final String firstName) {
            this.firstName = firstName;
            }

        public String getLastName() {
            return lastName;
            }

        public void setLastName(final String lastName) {
            this.lastName = lastName;
            }
        }
    }
