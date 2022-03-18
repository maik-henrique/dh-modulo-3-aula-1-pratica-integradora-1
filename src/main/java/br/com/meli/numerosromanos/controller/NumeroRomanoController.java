package br.com.meli.numerosromanos.controller;

import br.com.meli.numerosromanos.service.NumeroRomanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/numeros-romanos")
public class NumeroRomanoController {

    @Autowired
    private NumeroRomanoService numeroRomanoService;


    @GetMapping("/{numeroDecimal}")
    public ResponseEntity<?> getNumeroDecimal(@PathVariable int numeroDecimal) {
        String numeroRomano = numeroRomanoService.converterNumeroDecimal(numeroDecimal);
        return ResponseEntity.ok(numeroRomano);
    }

}
