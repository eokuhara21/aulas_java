import java.util.Scanner;

public class Main {
    public static void main (String args[]){
            // mostrar os primeiros numeros multiplos de n sendo que m e n sao valores inseridos pelo usuario
            // n = range de numeros definidos pelo valor inserido
            // m = valor final e multiplo

        int n,m,r;
            Scanner ler = new Scanner(System.in);
            System.out.println("Insira um numero de vezes dos multiplos: ");
                n = ler.nextInt();
            System.out.println("Insira um numero que será multiplado: ");
                m = ler.nextInt();

            for (int i = 1; i <=n; i++){
                r = m*i;
                System.out.println(r);
            }


    }

}
