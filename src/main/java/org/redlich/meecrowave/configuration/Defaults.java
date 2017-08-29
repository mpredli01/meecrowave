package org.redlich.meecrowave.configuration;

import org.apache.meecrowave.runner.Cli;
import org.apache.meecrowave.runner.cli.CliOption;

public class Defaults implements Cli.Options {
    @CliOption(name="app-default-name",description="The default first and last names for the app.")
    private String firstName="Michael";
    private String lastName="Redlich";

    public String getFirstName() {
        return firstName;
        }

    public String getLastName() {
        return lastName;
        }
    }
