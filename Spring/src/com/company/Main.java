package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um numero (de 1 a 5) para converter em numeral Romano ");
        int n = leitor.nextInt(); // variavel n com valor inserido pelo usuario

        switch (n){
            case 1: // condicional para verificar entrada n e devolver resposta na saida de acordo com posicao n
                System.out.println("O numero "+n+" eh presentado pelo numeral romano: I"); break;
            case 2:
                System.out.println("O numero "+n+" eh presentado pelo numeral romano: II"); break;
            case 3:
                System.out.println("O numero "+n+" eh presentado pelo numeral romano: III"); break;
            case 4:
                System.out.println("O numero "+n+" eh presentado pelo numeral romano: IV"); break;
            case 5:
                System.out.println("O numero "+n+" eh presentado pelo numeral romano: V"); break;
            default:{
                System.out.println("opcao invalida!");
                return;

            }
        }

    }
}