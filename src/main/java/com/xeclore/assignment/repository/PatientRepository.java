package com.xeclore.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xeclore.assignment.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
