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
	private ArraysRepository arraysRepository;
	
	public ArrayList<Integer> getArray(Integer iteraciones, Integer id)
	{
		Optional<Arrays> array = arraysRepository.findById(id);
		return BartenderUtils.prepareDrinks(iteraciones, array.get().getInput_array());
	}
}         