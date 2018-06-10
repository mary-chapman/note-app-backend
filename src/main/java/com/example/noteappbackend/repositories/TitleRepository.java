package com.example.noteappbackend.repositories;

import com.example.noteappbackend.models.Title;
import org.springframework.data.repository.CrudRepository;


public interface TitleRepository extends CrudRepository<Title, Long> {
}
