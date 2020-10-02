package com.davis.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davis.springbootpostgresql.model.Employees_Survey_Answers;
@Repository
public interface Employees_Survey_AnswersRepository extends JpaRepository<Employees_Survey_Answers, Long> {

}
