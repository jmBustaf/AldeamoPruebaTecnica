package com.aldeamo.bartender.service;

import java.util.ArrayList;

public class BartenderUtils 
{
	public static ArrayList<Integer> prepareDrinks(Integer iteraciones, String array)
	{
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> vasos = new ArrayList<Integer>();
        ArrayList<Integer> respuesta = new ArrayList<Integer>();
        int primos[] = {2,3,5,7,11,13,17};
       
		vasos = coverStringToArray(array, vasos);
        
        for (int i = 0; i < iteraciones; i ++)
        {
            int p = primos[i];
            for (int j = vasos.size() - 1; j >= 0; j--) 
            {
                if(vasos.get(j) % p == 0)
                {
                    B.add(vasos.get(j));
                    vasos.remove(j);
                }   
            }
            
            for (int z = 0; z < B.size(); z++) 
            {
                respuesta.add(B.get(z));
            }
            
            B.clear();
            
            if(i >= iteraciones -1)
            {
                for (int n = 0; n < vasos.size(); n++)
                {
                    respuesta.add(vasos.get(n));
                }
            }
        }
        return respuesta;
    }
	
	private static ArrayList<Integer> coverStringToArray(String array, ArrayList<Integer> vasos)
	{
		String[] cadenaSeparada = array.split(",");
		for (String i: cadenaSeparada) 
		{
            vasos.add(Integer.parseInt(i));
        }
        return vasos;
	}
}