package com.midnightnoon.learn2code.resources;

import com.midnightnoon.learn2code.model.Person;
import com.midnightnoon.learn2code.services.PersonService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
public class PersonsResource {

    @GET    //nastavenie metody (get, delete, put, set)
    @Produces(MediaType.APPLICATION_JSON) //respond typ
    public List<Person> getPersons(@QueryParam("name") String name){
        if(name != null){
            return PersonService.getPersonService().getAllPersonsWithName(name);
        }
        return PersonService.getPersonService().getAllPersons();
    }

    @GET
    @Path("/{personId}")    //pripája sa na predchadzajuci Path /persons
                            //to co je v {} je v podstate akakolvek hodnota
    @Produces(MediaType.APPLICATION_JSON)
    public Person getText(@PathParam("personId") long personId){
        //cez @PathParam dam jersey vediet, ze ako premennú chcem do metody injectnut premennu z cesty
        return PersonService.getPersonService().getPersonById(personId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Person addPerson(Person person){
        return PersonService.getPersonService().addPerson(person);
    }

    @PUT
    @Path("{personId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Person updatePerson(Person person, @PathParam("personId") long personId){
        person.setId(personId);
        return PersonService.getPersonService().updatePerson(person);
    }

    @DELETE
    @Path("{personId}")
    public void deletePerson(@PathParam("personId") long personId){
        PersonService.getPersonService().deletePerson(personId);
    }
}
