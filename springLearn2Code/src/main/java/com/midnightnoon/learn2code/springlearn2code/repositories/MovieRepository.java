package com.midnightnoon.learn2code.springlearn2code.repositories;

import com.midnightnoon.learn2code.springlearn2code.model.Movie;
import com.midnightnoon.learn2code.springlearn2code.model.dto.MovieDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByName(String name); //o implementaciu sa postara Spring ak pouzijem findBy+nazov premennej
    //netreba nič implementovať, implementaciu bude riadit Spring
}
