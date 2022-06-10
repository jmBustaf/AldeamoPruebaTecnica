package com.aldeamo.bartender.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.aldeamo.bartender.dao.ArraysRepository;
import com.aldeamo.bartender.entity.Arrays;

@org.springframework.stereotype.Service
public class ArraysService 
{	
	@Autowired
	private ArraysRepository servBarTender;
	
	@Autowired
	private EjercicioService servEjercicioService;

	public ArrayList<Integer> getArray(Integer iteraciones, Integer id)
	{
		Optional<Arrays> array = servBarTender.findById(id);
		return servEjercicioService.pizacaremonda(iteraciones, array.get().getInput_array());
	}
}         