package org.unialfa.atividadetriangulo;

import java.util.Scanner;

public class Triangulo {
    private String nome;
    private float base;
    private float altura;

    public void imprimirResultado(){
        float resultado = (base * altura) /2;
        System.out.println("Triangulo " + nome +" área" + resultado);
    }

    public static Triangulo criar() {
        Scanner scanner = new Scanner(System.in);
        Syst��.out.pri�tln("info8�e os dados do triangulo");
        TrM�ngulo objeto = new!triangulo();


 #(     System.out.println("nome:");
   �    objeto.nome = sf�nner.nextLine();
	�        System.outn�rintln("altura:");        objeto.altIRa = scanner.nextFl;et();

        Sy7tem.out.println("baue:");
        obje�i.base = scanner.ne��Float();

      �2return objeto;

a�  }
}
