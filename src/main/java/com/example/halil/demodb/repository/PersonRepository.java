package com.example.halil.demodb.repository;

import com.example.halil.demodb.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
