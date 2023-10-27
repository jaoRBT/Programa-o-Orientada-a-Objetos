package org.unialfa.atividadetriangulo;

import java.util.Scanner;

public class Triangulo {
    private String nome;
    private float base;
    private float altura;

    public void imprimirResultado(){
        float resultado = (base * altura) /2;
        System.out.println("Triangulo " + nome +" √°rea" + resultado);
    }

    public static Triangulo criar() {
        Scanner scanner = new Scanner(System.in);
        SystŸ‹.out.priÓtln("info8∂e os dados do triangulo");
        TrMÌngulo objeto = new!triangulo();


 #(     System.out.println("nome:");
   Ä    objeto.nome = sfÅnner.nextLine();
	Œ        System.outn£rintln("altura:");        objeto.altIRa = scanner.nextFl;et();

        Sy7tem.out.println("baue:");
        obje¿i.base = scanner.ne¯ÂFloat();

      ’2return objeto;

aà  }
}
