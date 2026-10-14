package com.jaroso.cafe.controllers;

import com.jaroso.cafe.services.CafeService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class CafeController {

    private final CafeService cafeService;

    public CafeController(CafeService cafeService) {
        this.cafeService = cafeService;
    }

    @GetMapping({"/", "/cafes"})
    public String listar(Model model) {
        model.addAttribute("cafes", cafeService.findAll());
        return "cafes";
    }

    @GetMapping("/cafes/{id}")
    public String detalle(@PathVariable Long id, Model model) {
        model.addAttribute("cafe", cafeService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Café no encontrado")));
        return "cafe";
    }
}
