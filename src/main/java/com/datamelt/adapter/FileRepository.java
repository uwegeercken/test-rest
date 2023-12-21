package com.datamelt.adapter;

import com.datamelt.model.Person;
import com.datamelt.port.DataRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileRepository implements DataRepository
{
    private static final String personsFile = "/home/uwe/development/persons.csv";
    private List<Person> persons;
    public FileRepository()
    {
        loadFile();
    }

    private void loadFile()
    {
        try
        {
            this.persons = Files.lines(Paths.get(personsFile))
                    .map(line -> line.split(","))
                    .map(Person::new)
                    .toList();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    @Override
    public List<Person> getPersons()
    {
        return persons;
    }
}
