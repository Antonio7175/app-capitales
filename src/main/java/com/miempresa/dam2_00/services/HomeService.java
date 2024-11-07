package com.miempresa.dam2_00.services;

import org.springframework.stereotype.Service;

@Service
public class HomeService implements IHomeService{

	    public String obtenerProverbioAleatorio() {
	        // Aquí puedes agregar lógica para obtener un proverbio aleatorio si deseas
	        return "El que mucho abarca, poco aprieta."; // Ejemplo de proverbio
	    }
	}



