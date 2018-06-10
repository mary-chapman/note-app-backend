package com.example.noteappbackend.repositories;

import com.example.noteappbackend.models.User;
import org.springframework.data.repository.CrudRepository;

import java.time.temporal.TemporalAccessor;
import java.util.List;

public interface UserRepository  extends CrudRepository<User, Long> {
     User findById(String userId);
}
