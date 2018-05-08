package com.cpc.formulation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cpc.formulation.model.FormulationModel;
@CrossOrigin(origins = "http://localhost:4200")
@Repository
public interface FormulationRepository extends JpaRepository<FormulationModel, Integer> {

	

}
