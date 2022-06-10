package com.aldeamo.bartender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import com.aldeamo.bartender.service.BartenderUtils;

public class BartenderUtilsTest 
{
	
	@Test
	public void prepareDrinksTest()
	{		
		ArrayList respuesta = BartenderUtils.prepareDrinks(3, "2,3,4,5,6,7");
		assertEquals(Arrays.asList(new int[]{6,4,2,3,5,7}), respuesta);
		
		respuesta = BartenderUtils.prepareDrinks(3, "2,4,5,6,7,8");
		assertEquals(Arrays.asList(new int[]{8,6,4,2,5,7}), respuesta);
		
		respuesta = BartenderUtils.prepareDrinks(3, "3,7,9,5,4,2");
		assertEquals(Arrays.asList(new int[]{2,4,9,3,5,7}), respuesta);
		
		respuesta = BartenderUtils.prepareDrinks(3, "5,7,9,11,13");
		assertEquals(Arrays.asList(new int[]{9,5,7,11,13}), respuesta);
		
		respuesta = BartenderUtils.prepareDrinks(3, "6,4,2,12,15");
		assertEquals(Arrays.asList(new int[]{12,2,4,6,15}), respuesta);
		
		respuesta = BartenderUtils.prepareDrinks(3, "7,10,15,11,9");
		assertEquals(Arrays.asList(new int[]{10,9,15,7,11}), respuesta);
	}
}