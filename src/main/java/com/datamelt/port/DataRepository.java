package com.datamelt.port;

import com.datamelt.model.Person;

import java.util.List;

public interface DataRepository
{
    List<Person> getPersons();
}
