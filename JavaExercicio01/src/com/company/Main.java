package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Insira um número: ");
        //String numero = n.next();
        //System.out.println(numero);

        int numero = n.nextInt();

        for (int i = 1; i<=numero*2; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}
