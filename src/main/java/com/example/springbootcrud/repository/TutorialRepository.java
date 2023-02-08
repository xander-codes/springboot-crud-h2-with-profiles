package com.example.springbootcrud.repository;

import com.example.springbootcrud.exceptions.TutorialException;
import com.example.springbootcrud.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    List<Tutorial> findByPublished(boolean published) throws TutorialException;

    List<Tutorial> findByTitleContaining(String title) throws TutorialException;
}
