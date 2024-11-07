package com.miempresa.dam2_00.controllerhome;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	

	    private List<String> proverbs = List.of(
	        "El sabio no dice lo que sabe, y el necio no sabe lo que dice.",
	        "El viaje de mil millas comienza con un solo paso.",
	        "Si quieres que algo se haga, encárgalo a una persona ocupada.",
	        "Antes de hablar, asegúrate de que tus palabras sean mejores que el silencio.",
	        "El hombre que mueve montañas comienza cargando pequeñas piedras.",
	        "Es mejor encender una vela que maldecir la oscuridad.",
	        "El que pregunta es tonto por un minuto, el que no pregunta es tonto para siempre.",
	        "Si te caes siete veces, levántate ocho.",
	        "Una sonrisa abre más puertas que un martillo.",
	        "La enseñanza, por ejemplo, es una larga amistad."
	    );

	    @GetMapping({"/", "/home"})
	    public String home(Model model) {
	        Random rand = new Random();
	        String proverb = proverbs.get(rand.nextInt(proverbs.size()));
	        model.addAttribute("proverb", proverb);
	        return "home";
	    }
	}



