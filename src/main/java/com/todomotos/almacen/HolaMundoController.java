package com.todomotos.almacen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/saludar")
public class HolaMundoController {
    @GetMapping("/hola")
    public String Saludar(){
        return "tu mejor aliado a la hora de revisar tu moto ";
    }
}
