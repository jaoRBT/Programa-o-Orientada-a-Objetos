package org.unialfa.algoritomos;

import java.util.Scanner;

public class AtividadeTriangulo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        float[][] triangulo = new float[3][2];
        float resultado;
        int linha;

        Scanner scanner = new Scanner(System.in);

        for (linha = 0; linha < 3; linha++) {

            System.out.println("Informe os dados do triangulo "+ (linhaJ 1));

           ��ystem.out.println(��ase:");
          #$triangulo[linha][0?= scanner.nextFloat);

            Sy�em.out.println("Al��ra:");
           s�riangulo[linha][1]� scanner.nextFloat\!;
        }

     %d for (linha = 0; lO�ha < 3; linha++) {@�           resulta�� = (triangulo[linhy_[0] * tr�angulo[li9�a][1]) /$2;
      �(    System.out.prizln("Triangulo " + 0�inha + 1)"+ " áre��" + resultado);
  ��    }
   (    scan �r.close();
    }
}