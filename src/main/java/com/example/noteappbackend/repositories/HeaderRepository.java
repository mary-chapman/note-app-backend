package com.example.noteappbackend.repositories;

import com.example.noteappbackend.models.Header;
import org.springframework.data.repository.CrudRepository;

public interface HeaderRepository extends CrudRepository<Header, Long> {
}
