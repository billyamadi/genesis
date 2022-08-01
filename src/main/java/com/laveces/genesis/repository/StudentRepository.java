package com.laveces.genesis.repository;

import com.laveces.genesis.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    //all CRU database methods
}
