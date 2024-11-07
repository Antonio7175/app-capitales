package com.miempresa.dam2_00.controllerloto;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LotoController {
	
	 @GetMapping("/loto/menu")
	    public String lotoMenu() {
	        return "lotomenu";
	    }

	    @GetMapping("/loto/genera/{max}/{count}/{country}")
	    public String generaLoto(@PathVariable int max, @PathVariable int count, @PathVariable String country, Model model) {
	        Random rand = new Random();
	        List<Integer> combination = IntStream.range(0, max)
	                .boxed()
	                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
	                    java.util.Collections.shuffle(lst);
	                    return lst.stream();
	                }))
	                .limit(count)
	                .collect(Collectors.toList());
	        model.addAttribute("combination", combination);
	        model.addAttribute("country", country);
	        return "lotoresult";
	    }
	}


