package com.jogodosoito.functions;

import com.jogodosoito.tabela.Tabela;

import java.util.Scanner;

public class Controlador {

    public static void entrada(){

        String tabelaObjetivo[][];
        String tabelaEmbaralhada[][];
        Object [] retorno;
        boolean y;

        y = false;
        tabelaObjetivo = Tabela.gerarTabela();

        System.out.println("Tabela objetivo:");
        Exibidor.exibirTabela(tabelaObjetivo);
        System.out.println("\n");


        tabelaEmbaralhada = Embaralhador.embaralhar(tabelaObjetivo);

        while(y == false){
            System.out.println("Tabela embaralhada:");
            Exibidor.exibirTabela(tabelaEmbaralhada);
            System.out.println("\n");

            Scanner s = new Scanner(System.in);
            System.out.println("Inserir numero: \n");
            String i = s.next();

            retorno = jogar(i, tabelaEmbaralhada);
            if((boolean) retorno[1] == true){
                System.out.println("Você chegou ao objetivo! \n");
                Exibidor.exibirTabela((String[][]) retorno[0]);
                y = true;
            }else{
                y = (boolean) retorno[1];
                tabelaEmbaralhada = (String[][]) retorno[0];
            }

        }

    }

    public static Object [] jogar(String insert, String tabelaEmbaralhada[][]){
        int [] index  = Buscador.buscarIndexEspaco(tabelaEmbaralhada);
        boolean resultado = Verificador.verificarSeGanhou(tabelaEmbaralhada);
        String [][] arrayModificado = Mover.mover(insert, index, tabelaEmbaralhada);
        Object[] retorno = new Object[2];

        if(resultado == false){
            retorno[0] = arrayModificado;
            retorno[1] = false;
            return retorno;
        }else{
            retorno[0] = arrayModificado;
            retorno[1] = true;
            return retorno;
        }

    }

}
