package br.com.meli.numerosromanos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/numeros-romanos")
public class NumeroRomanoController {

    private final static int[] valoresDecimais = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private final static String[] representacaoRomana = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


    @GetMapping("/{numeroDecimal}")
    public ResponseEntity<?> getNumeroDecimal(@PathVariable int numeroDecimal) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; numeroDecimal > 0; i++) {
            while (numeroDecimal >= valoresDecimais[i]) {
                resultado.append(representacaoRomana[i]);
                numeroDecimal -= valoresDecimais[i];
            }
        }
        return ResponseEntity.ok(resultado.toString());
    }

}
