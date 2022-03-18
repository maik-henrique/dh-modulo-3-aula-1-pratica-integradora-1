package br.com.meli.numerosromanos.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroRomanoService {
    private final static int[] valoresDecimais = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private final static String[] representacaoRomana = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String converterNumeroDecimal(int numeroDecimal) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; numeroDecimal > 0; i++) {
            while (numeroDecimal >= valoresDecimais[i]) {
                resultado.append(representacaoRomana[i]);
                numeroDecimal -= valoresDecimais[i];
            }
        }

        return resultado.toString();
    }
}
