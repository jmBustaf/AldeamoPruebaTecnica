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
	
	/*@Autowired
	private EjercicioService servEjercicioService;*/

	public ArrayList<Integer> getArray(Integer iteraciones, Integer id)
	{
		Optional<Arrays> array = servBarTender.findById(id);
		return pizacaremonda(iteraciones, array.get().getInput_array());
	}
	
	public ArrayList<Integer> pizacaremonda(Integer iteraciones, String array)
	{
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> vasos = new ArrayList<Integer>();
        ArrayList<Integer> respuesta = new ArrayList<Integer>();
        int primos[] = {2,3,5,7,11,13,17};
       
        String[] cadenaSeparada = array.split(",");
		for (String i: cadenaSeparada) {
            vasos.add(Integer.parseInt(i));
        }		
		
        
        for (int i = 0; i < iteraciones; i ++)
        {
            int p = primos[i];
            for (int j = 0; j < vasos.size(); j ++) 
            {
                if(vasos.get(j) % p == 0)
                {
                    B.add(vasos.get(j));
                    vasos.remove(j);
                }   
            }
            
            invertirArray(B);
            invertirArray(vasos);
            
            for (int z = 0; z < B.size(); z++) 
            {
                respuesta.add(B.get(z));
            }
            
            System.out.println(B + " b  iteracion:  " + i);
            System.out.println(vasos + " vasos  iteracion:  " + i);
            
            B.clear();
            
            if(i >= iteraciones -1)
            {
                for (int n = 0; n < vasos.size(); n++)
                {
                    respuesta.add(vasos.get(n));
                }
            }
            
            System.out.println(respuesta + " respuesta  iteracion:  " + i);
        }
        return respuesta;
    }
	
	public ArrayList<Integer> invertirArray(ArrayList<Integer> array)
	{
		ArrayList<Integer> copy = (ArrayList<Integer>)array.clone();
        for (int i = 0; i < array.size(); i++) 
        {
        	copy.set(i, array.get(copy.size() - (1 + i)));
        }
        array = (ArrayList<Integer>)copy.clone();
        return array;
	}
}         