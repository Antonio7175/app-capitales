package com.miempresa.dam2_00.services;

import org.springframework.stereotype.Service;

import com.miempresa.dam2_00.libro.Genero;
import com.miempresa.dam2_00.libro.Libro;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroService implements ILibroService{

    private final List<Libro> libros = List.of(
            new Libro(1L, "El Quijote", "Miguel de Cervantes", 5, Genero.NOVELA),
            new Libro(2L, "1984", "George Orwell", 8, Genero.NOVELA),
            new Libro(3L, "Cien años de soledad", "Gabriel García Márquez", 4, Genero.NOVELA),
            new Libro(4L, "Crimen y Castigo", "Fiódor Dostoyevski", 6, Genero.NOVELA),
            new Libro(5L, "Orgullo y Prejuicio", "Jane Austen", 7, Genero.NOVELA),
            new Libro(6L, "Matar a un ruiseñor", "Harper Lee", 5, Genero.NOVELA),
            new Libro(7L, "El Gran Gatsby", "F. Scott Fitzgerald", 3, Genero.NOVELA),
            new Libro(8L, "En busca del tiempo perdido", "Marcel Proust", 2, Genero.NOVELA),
            new Libro(9L, "Don Juan Tenorio", "José Zorrilla", 6, Genero.TEATRO),
            new Libro(10L, "La Casa de Bernarda Alba", "Federico García Lorca", 4, Genero.TEATRO),
            new Libro(11L, "Hamlet", "William Shakespeare", 5, Genero.TEATRO),
            new Libro(12L, "Romeo y Julieta", "William Shakespeare", 5, Genero.TEATRO),
            new Libro(13L, "El Zoo de Cristal", "Tennessee Williams", 3, Genero.TEATRO),
            new Libro(14L, "Antígona", "Sófocles", 2, Genero.TEATRO),
            new Libro(15L, "Poeta en Nueva York", "Federico García Lorca", 7, Genero.POESIA),
            new Libro(16L, "Cien poemas de amor", "Pablo Neruda", 8, Genero.POESIA),
            new Libro(17L, "Hojas de hierba", "Walt Whitman", 4, Genero.POESIA),
            new Libro(18L, "Las flores del mal", "Charles Baudelaire", 3, Genero.POESIA),
            new Libro(19L, "Rimas y leyendas", "Gustavo Adolfo Bécquer", 6, Genero.POESIA),
            new Libro(20L, "Meditaciones", "Marco Aurelio", 5, Genero.ENSAYO),
            new Libro(21L, "Walden", "Henry David Thoreau", 4, Genero.ENSAYO),
            new Libro(22L, "El origen de las especies", "Charles Darwin", 3, Genero.ENSAYO),
            new Libro(23L, "El arte de la guerra", "Sun Tzu", 7, Genero.ENSAYO),
            new Libro(24L, "La interpretación de los sueños", "Sigmund Freud", 2, Genero.ENSAYO),
            new Libro(25L, "Sapiens: De animales a dioses", "Yuval Noah Harari", 8, Genero.ENSAYO)
    );

    public List<Libro> obtenerLibros() {
        return libros;
    }

    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public List<Libro> obtenerLibrosPorGenero(Genero genero) {
        return libros.stream().filter(l -> l.getGenero() == genero).collect(Collectors.toList());
    }
}
