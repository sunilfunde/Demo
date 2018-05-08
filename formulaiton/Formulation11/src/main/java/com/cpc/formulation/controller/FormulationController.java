package com.cpc.formulation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpc.formulation.model.FormulationModel;
import com.cpc.formulation.service.FormulationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/formulation"})
public class FormulationController {
     
	
	@Autowired
	private FormulationService formulationService;
	
	
		
	
	
	@PostMapping(value="insertformulation.json")
	public List<FormulationModel> insertFormulation(@RequestBody FormulationModel formulationmodel) {
		return formulationService.insertFormulationService(formulationmodel);
	}

	@GetMapping(value="getformulation.json")
     public List<FormulationModel> getData(){

	        return formulationService.getData();
		}
	
	@PutMapping(value="updateFormulation.json")
	public void updateFormulation(@RequestBody FormulationModel formulationModel )
	
	{
		formulationService.updateFormulation(formulationModel);
	}		
	
	 
}
