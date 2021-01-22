package com.example.halil.demodb.repository;

import com.example.halil.demodb.entity.NoteBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NoteBookRepository extends JpaRepository<NoteBook, Integer> {
}
