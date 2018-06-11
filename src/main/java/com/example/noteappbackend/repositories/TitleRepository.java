package com.example.noteappbackend.repositories;

import com.example.noteappbackend.models.Title;
import com.example.noteappbackend.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TitleRepository extends CrudRepository<Title, Long> {

    List<Title> findByUserIdAndText(Long userId, String title);
    //Title findByUserId(Long userId);

}
