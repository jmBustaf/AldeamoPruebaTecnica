package com.aldeamo.bartender.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aldeamo.bartender.service.ArraysService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.OPTIONS})
@RequestMapping("/Bartender")
public class ArraysController 
{
	@Autowired
	private ArraysService arraysService;
	
	@GetMapping("/buscar/{iteraciones}/{id}")
	private ArrayList<Integer> getArray(@PathVariable("iteraciones") Integer iteraciones, @PathVariable("id") Integer id)
	{
		return arraysService.getArray(iteraciones, id);		
	}	
}