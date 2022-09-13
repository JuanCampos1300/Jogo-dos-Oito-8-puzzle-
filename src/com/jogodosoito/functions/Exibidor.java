package com.jogodosoito.functions;

public class Exibidor {

    public static void exibirTabela(String[][] array) {

        int i, j;

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
