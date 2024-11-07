package com.miempresa.dam2_00.services;

import java.util.List;
import java.util.Optional;

import com.miempresa.dam2_00.libro.Genero;
import com.miempresa.dam2_00.libro.Libro;

public interface ILibroService {
	
	public List<Libro> obtenerLibros();
	
	public Optional<Libro> obtenerLibroPorId(Long id);
	
	public List<Libro> obtenerLibrosPorGenero(Genero genero);
}
