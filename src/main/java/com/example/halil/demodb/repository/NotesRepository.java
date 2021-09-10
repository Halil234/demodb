package com.example.halil.demodb.repository;

import com.example.halil.demodb.entity.Notes;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface NotesRepository extends JpaRepository<Notes, Integer> {

    Optional<Notes> findById(ID id);

    Optional<Notes> findTopByOrderByIdDesc();

    @Override
    <S extends Notes> List<S> saveAll(Iterable<S> iterable);
}

