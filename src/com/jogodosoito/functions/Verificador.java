package com.jogodosoito.functions;

import java.util.Scanner;

public class Verificador {

    public static boolean verificarSeGanhou(String[][] tabelaEmbaralhada ){
        int i, j;
        int k = 0;
        String number[] = {"1","2","3","4","5","6","7","8",""};

        Scanner s = new Scanner(System.in);

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {

                String a = tabelaEmbaralhada[i][j];
                String n = number[k];
                k++;
                if( a != n){
                    return false;
                }


            }
        }
        return true;

    }

    public static boolean verificarEntrada( int linhaEspacoBranco, int colunaEspacoBranco,
                                            int linhaValorInserido, int colunaValorInserido){

        if(linhaEspacoBranco == linhaValorInserido && colunaEspacoBranco == colunaValorInserido ){
            return false;
        }

        if((linhaValorInserido>2) || (linhaValorInserido<0) || (colunaValorInserido>2) || (colunaValorInserido<0)){
            return false;
        }


        if(Math.abs(linhaEspacoBranco-linhaValorInserido) + Math.abs(colunaEspacoBranco-colunaValorInserido) > 1){
            return false;
        }
        return true;
    }

}
