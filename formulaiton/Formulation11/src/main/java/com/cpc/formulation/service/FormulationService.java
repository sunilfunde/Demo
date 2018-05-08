package com.cpc.formulation.service;

import java.util.List;

import com.cpc.formulation.model.FormulationModel;





public interface FormulationService {
	
	
	List<FormulationModel>  insertFormulationService(FormulationModel formulationModel);
	
	List<FormulationModel> getData();
	
     public void  updateFormulation(FormulationModel formulationModel);


}