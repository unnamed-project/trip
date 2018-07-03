package com.unnamed.trip.demo.resource;

import com.unnamed.trip.demo.info.PersonInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.fildan on 6/25/2018.
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoResource {

    @RequestMapping(method = RequestMethod.GET, value = "/persons")
    public List<PersonInfo> gerPersons() {


        return getTeamPersons();
    }

    private List<PersonInfo> getTeamPersons() {

        List<PersonInfo> teamPersons = new ArrayList<>();

        PersonInfo person = new PersonInfo();
        person.setFirstName( "Flaviu" );
        person.setLastName( "Fildan" );
        person.setEmail( "flaviu.fildan@arobs.com" );
        teamPersons.add( person );

        person = new PersonInfo();
        person.setFirstName( "Iulia" );
        person.setLastName( "Timis" );
        person.setEmail( "timis_iulia1@yahoo.com" );
        teamPersons.add( person );

        person = new PersonInfo();
        person.setFirstName( "Dan" );
        person.setLastName( "Dragomir" );
        person.setEmail( "dandragomir1999@gmail.com" );
        teamPersons.add( person );

        person = new PersonInfo();
        person.setFirstName( "Sergiu" );
        person.setLastName( "Elecfi" );
        teamPersons.add( person );

        person = new PersonInfo();
        person.setFirstName( "Alexis" );
        person.setLastName( "Alexis" );
        person.setEmail( "indoleanalexis@yahoo.com" );
        teamPersons.add( person );

        person = new PersonInfo();
        person.setFirstName( "Carina" );
        person.setLastName( "Oprean" );
        person.setEmail( "carina.oprean@yahoo.com" );
        teamPersons.add( person );


        return teamPersons;
    }

}
