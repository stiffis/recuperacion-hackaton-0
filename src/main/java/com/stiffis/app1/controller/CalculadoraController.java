package com.stiffis.app1.controller;

import com.stiffis.app1.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/multiplicar/{a}/{b}")
    public ResponseEntity<Double> multiplicar(@PathVariable Long a, @PathVariable Long b) {
        try {
            Double resultado = calculadoraService.multiplicar(a, b);
            return ResponseEntity.ok(resultado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null); // Devuelve null en caso de error
        } catch (ArithmeticException e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(null);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/dividir/{a}/{b}")
    public ResponseEntity<Long> dividir(@PathVariable Long a, @PathVariable Long b) {
        try {
            Long resultado = calculadoraService.dividir(a, b);
            return ResponseEntity.ok(resultado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null); // Devuelve null en caso de error
        }
    }
}
