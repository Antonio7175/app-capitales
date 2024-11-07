package com.miempresa.dam2_00.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class LotoService implements ILotoService{
	
	public List<Integer> generarNumerosLoto() {
        Random random = new Random();
        return random.ints(1, 50) // Cambia el rango según tu necesidad
                .distinct()
                .limit(6) // Limitar a 6 números
                .sorted()
                .boxed()
                .toList();
    }

}
