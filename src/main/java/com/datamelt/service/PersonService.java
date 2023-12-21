package com.datamelt.service;

import com.datamelt.adapter.FileRepository;
import com.datamelt.model.Person;
import com.datamelt.port.DataRepository;
import com.datamelt.resources.DataNotFoundException;

import java.util.List;
import java.util.Optional;

public class PersonService
{
    private static final DataRepository dataRepository = new FileRepository();

    public static List<Person> getPersons()
    {
        return dataRepository.getPersons();
    }

    public static Person getPerson(int id)
    {
        Optional<Person> selectedPerson = dataRepository.getPersons().stream()
                .filter(person -> person.getId() == id)
                .findFirst();
        if(selectedPerson.isPresent())
        {
            return selectedPerson.get();
        }
        else
        {
            throw new DataNotFoundException("person not found with id: " + id);
        }
    }

    public static List<Person> getPersonByYearOfBirth(int yearOfBirth)
    {
        List<Person> persons = dataRepository.getPersons().stream()
            .filter(person -> person.getBirthdate().getYear() == yearOfBirth)
            .toList();
        if(!persons.isEmpty())
        {
            return persons;
        }
        else
        {
            throw new DataNotFoundException("no persons found with year of birth: " + yearOfBirth);
        }
    }

    public static List<Person> getPersonsPaginated(int skip, int limit)
    {
        List<Person> persons = dataRepository.getPersons().stream()
                .skip(skip)
                .limit(limit)
                .toList();
        if(!persons.isEmpty())
        {
            return persons;
        }
        else
        {
            throw new DataNotFoundException("no persons found for selected range. skip: " + skip + " and limit: " + limit);
        }
    }
}
