package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inverter {
    public static void invertendo(){
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();

        List letras = new ArrayList<>();
        List letrasInvertidas = new ArrayList();

        letras = List.of(texto.split(""));

        for (int i = letras.size()-1; i >= 0; i--) {
            letrasInvertidas.add(letras.get(i));
        }

        System.out.println(texto);
        System.out.println(letras);
        System.out.println(letrasInvertidas);
    }
}

