package org.unialfa.praticando;

import java.util.Scanner;

public class PraticaNumero {
        public static void main(String[] args) {
            int[] numero = new int[5];
            int maior = 0;
            Scanner scanner =  new Scanner(System.in);

            for (int i = 0; i < 5; i++){
                do {
                    System.out.println("Informe um número");
                    numero[i] = scanner.nextInt();
                } while(numero[i] < 0);

                if (numero[i] >  maior){
                    maior = numero[i];
                }
            }
            System.out.println("Maior número: "+ maior);
            scanner.close();
        }
    }