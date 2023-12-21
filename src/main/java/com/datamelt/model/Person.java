package com.datamelt.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Person
{
    private long id;
    private String lastName;
    private String firstName;
    private LocalDate birthdate;

    public Person()
    {}
    public Person(String[] fields)
    {
        this.id = Integer.parseInt(fields[0]);
        this.lastName = fields[1];
        this.firstName = fields[2];
        this.birthdate = LocalDate.parse(fields[3], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public LocalDate getBirthdate()
    {
        return birthdate;
    }
}
