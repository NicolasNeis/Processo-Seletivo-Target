package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {

    public static boolean ex2(){
        boolean resultado = false;
        int ant = 0;
        int prox = 1;
        List sequencia = new ArrayList();
        sequencia.add(ant);
        sequencia.add(prox);

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual numero voce deseja saber se faz parte da sequencia de Fibonacci? ");
        int n = scan.nextInt();

        for(int i=0; i <= (n-2); i++) {
            prox = prox + ant;
            ant = prox - ant;
            sequencia.add(prox);
        }

        for (int i = 0; i < sequencia.size(); i++) {
            if(sequencia.get(i) == Integer.valueOf(n)){
                resultado = true;
            } else if (n == 2) {
                resultado = true;
            } else if (n == 3) {
                resultado = true;
            }
        }
        return resultado;
    }

}
