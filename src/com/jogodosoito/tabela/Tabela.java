package com.jogodosoito.tabela;

public class Tabela {

    public static String[][] gerarTabela() {

        String array[][] = new String[3][3];
        int i, j;
        int k = 0;
        String number[] = {"1","2","3","4","5","6","7","8",""};


        System.out.println("Enter Elements for Matrix 3x3 :");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                array[i][j] = number[k];
                k++;
            }
        }

        return array;
    }


}
