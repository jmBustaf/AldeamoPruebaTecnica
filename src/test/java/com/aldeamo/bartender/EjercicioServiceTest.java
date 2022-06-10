package com.aldeamo.bartender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import com.aldeamo.bartender.service.EjercicioService;

//import com.aldeamo.bartender.service.EjercicioService;

public class EjercicioServiceTest 
{
	
	@Test
	public void cualquiercosa()
	{
		
		EjercicioService ejer = new EjercicioService();
		ArrayList respuesta = ejer.pizacaremonda(3, "2,3,4,5,6,7");
		assertEquals(Arrays.asList(new int[]{6,4,2,3,5,7}), respuesta);
		
		respuesta = ejer.pizacaremonda(3, "2,4,5,6,7,8");
		assertEquals(Arrays.asList(new int[]{8,6,4,2,5,7}), respuesta);
	}
}