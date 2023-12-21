package com.datamelt.resources;

import com.datamelt.adapter.FileRepository;
import com.datamelt.model.Person;
import com.datamelt.service.PersonService;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

@Path("/persons")
public class PersonResource
{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons(@QueryParam("yearOfBirth") int yearOfBirth)
    {
        if(yearOfBirth>0)
        {
            return PersonService.getPersonByYearOfBirth(yearOfBirth);
        }
        else
        {
            return PersonService.getPersons();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") int id)
    {
        return PersonService.getPerson(id);
    }

}
