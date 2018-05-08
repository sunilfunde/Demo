package com.cpc.formulation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpc.formulation.model.FormulationModel;
import com.cpc.formulation.repository.FormulationRepository;
import com.cpc.formulation.service.FormulationService;

import lombok.Setter;

@Service
public class FormulationServiceImpl implements FormulationService {

	@Autowired
	private FormulationRepository formulationRepository;

	@Override
	public List<FormulationModel> insertFormulationService(FormulationModel formulationModel) {

		formulationRepository.save(formulationModel);
		return formulationRepository.findAll();

	}

	@Override
	public List<FormulationModel> getData() {

		return formulationRepository.findAll();
	}

	@Override
	public void updateFormulation(FormulationModel formulationModel) {
formulationRepository.save(formulationModel);
	}

}
