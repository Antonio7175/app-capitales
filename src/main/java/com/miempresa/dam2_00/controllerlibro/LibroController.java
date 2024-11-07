package com.miempresa.dam2_00.controllerlibro;

import com.miempresa.dam2_00.libro.Genero;
import com.miempresa.dam2_00.libro.Libro;
import com.miempresa.dam2_00.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros/menu")
    public String librosMenu(Model model) {
        List<Libro> libros = libroService.obtenerLibros();
        model.addAttribute("libros", libros);
        return "librosmenu";
    }

    @GetMapping("/libros/{id}")
    public String libroDetalle(@PathVariable Long id, Model model) {
        libroService.obtenerLibroPorId(id).ifPresent(libro -> model.addAttribute("libro", libro));
        return "librodetalle";
    }

    @GetMapping("/libros/genero/{genero}")
    public String librosPorGenero(@PathVariable Genero genero, Model model) {
        List<Libro> librosPorGenero = libroService.obtenerLibrosPorGenero(genero);
        model.addAttribute("libros", librosPorGenero);
        return "librosmenu";
    }
}
