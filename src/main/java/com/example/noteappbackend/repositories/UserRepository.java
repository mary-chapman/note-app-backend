package com.example.noteappbackend.repositories;

import com.example.noteappbackend.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {
}
