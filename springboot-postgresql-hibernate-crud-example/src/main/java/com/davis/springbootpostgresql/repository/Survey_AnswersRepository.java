package com.davis.springbootpostgresql.repository;

import org.springframework.stereotype.Repository;

import com.davis.springbootpostgresql.model.Survey_Answers;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Survey_AnswersRepository extends JpaRepository<Survey_Answers, Double> {

}
