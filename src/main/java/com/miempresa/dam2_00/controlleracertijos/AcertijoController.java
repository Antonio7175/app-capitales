package com.miempresa.dam2_00.controlleracertijos;

import com.miempresa.dam2_00.capital.Capital;
import com.miempresa.dam2_00.services.AcertijosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcertijoController {

    @Autowired
    private AcertijosService acertijosService;

    @GetMapping("/acertijo")
    public String mostrarAcertijo(Model model) {
        // Seleccionamos una capital aleatoria
        Capital capitalAleatoria = acertijosService.obtenerCapitalAleatoria();

        // Obtenemos las opciones para el acertijo
        List<Capital> opciones = acertijosService.obtenerOpciones(capitalAleatoria);

        // Agregamos la imagen y las opciones al modelo
        model.addAttribute("capitalAleatoria", capitalAleatoria);
        model.addAttribute("opciones", opciones);

        return "acertijo";
    }

    @GetMapping("/verificar")
    public String verificarRespuesta(@RequestParam String respuesta, @RequestParam String correcta, Model model) {
        if (respuesta.equals(correcta)) {
            model.addAttribute("mensaje", "¡Correcto! La capital es " + correcta);
        } else {
            model.addAttribute("mensaje", "Incorrecto. La respuesta correcta era " + correcta);
        }
        return "resultado";
    }
}
