package com.davis.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davis.springbootpostgresql.model.Survey_Questions;

@Repository
public interface Survey_QuestionsRepository extends JpaRepository<Survey_Questions, Integer> {

}
