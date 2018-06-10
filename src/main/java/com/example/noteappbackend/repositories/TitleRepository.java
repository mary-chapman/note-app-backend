package com.example.noteappbackend.repositories;

import com.example.noteappbackend.models.Title;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TitleRepository extends CrudRepository<Title, Long> {
//    List<Title> findByuser_id(String userId);
//    List<Title> findByText(String title);

    List<Title> findByUserIdAndText(Long userId, String title);
//    Title deleteByUserIdAndTitleId(Long userId, Long titleId);
}
