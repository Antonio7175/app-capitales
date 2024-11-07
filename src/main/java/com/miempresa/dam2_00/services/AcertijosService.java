package com.miempresa.dam2_00.services;

import org.springframework.stereotype.Service;

import com.miempresa.dam2_00.capital.Capital;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class AcertijosService implements IAcertijosService{

    private final List<Capital> capitales = Arrays.asList(
            new Capital("paris", "/img/capitals/paris.jpg"),
            new Capital("london", "/img/capitals/london.jpg"),
            new Capital("madrid", "/img/capitals/madrid.jpg"),
            new Capital("tokyo", "/img/capitals/tokyo.jpg"),
            new Capital("newyork", "/img/capitals/newyork.jpg"),
            new Capital("roma", "/img/capitals/roma.jpg"),
            new Capital("berlin", "/img/capitals/berlin.jpg"),
            new Capital("beijing", "/img/capitals/beijing.jpg"),
            new Capital("moscú", "/img/capitals/moscú.jpg"),
            new Capital("sydney", "/img/capitals/sydney.jpg")
    );

    public Capital obtenerCapitalAleatoria() {
        Random random = new Random();
        return capitales.get(random.nextInt(capitales.size()));
    }

    public List<Capital> obtenerOpciones(Capital capitalCorrecta) {
        List<Capital> opciones = capitales.stream()
                .filter(c -> !c.getNombre().equals(capitalCorrecta.getNombre()))
                .collect(Collectors.toList());
        Collections.shuffle(opciones);

        // Tomamos las primeras 3 opciones y agregamos la capital correcta
        opciones = opciones.subList(0, 3);
        opciones.add(capitalCorrecta);

        // Mezclamos las opciones (para que la correcta no esté siempre en el mismo lugar)
        Collections.shuffle(opciones);

        return opciones;
    }
}
