package com.example.noteappbackend.repositories;

import com.example.noteappbackend.models.Title;
import com.example.noteappbackend.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {
//    Title deleteByUserIdAndTitle(Long userId, String title);
}
