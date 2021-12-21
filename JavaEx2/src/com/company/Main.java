package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // ^ classe para ler dados inseridos do teclado da maquina
        int n = 0, cont = 0; // definida variavel n que recebe um valor digitado pelo usuario,
        // cont recebe valor para um contador onde este sera usado para verificacao de numero primo ateh que chegue nele mesmo.
        System.out.println("Insira um numero e descubra se ele eh um numero primo ou naum: ");
        // ^ imprime mensagem na tela para interacao com usuario
        n = ler.nextInt();
        // ^ varial que espera e lê o valor da linha inserida pelo usuario

        // criado array para fazer incremento para limitacao de valor referencia para uso de verificacao
        // numero primmo + funcao condicional para tratamento de resultado e mensagem para usuario.
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }

            if (cont ==2 ){
                System.out.println(+n+" :numero é primo");
            }else{
                System.out.println(+n+" :numero naum é primo");
            }
        }

    }

