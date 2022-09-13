package com.jogodosoito.functions;

import java.util.Objects;

public class Buscador {

    public static int[] buscarIndexEspaco(String[][] tabelaEmbaralhada) {
        int i, j;

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                if(tabelaEmbaralhada[i][j] == ""){

                    int index[] = new int[2];
                    index[0] = i;
                    index[1] = j;

                    return index;
                }
            }

        }
        return new int[0];
    }

    public static int[] buscarIndexValorInserido(String[][] tabelaEmbaralhado, String insert) {
        int i, j;

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                if(Objects.equals(tabelaEmbaralhado[i][j], insert)){

                    int index[] = new int[2];
                    index[0] = i;
                    index[1] = j;

                    return index;
                }
            }

        }
        return new int[0];
    }



}
