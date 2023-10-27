package Faculdade;

import java.util.Scanner;

public class Cordenador {

    private String nome;
    private String curso;

    private String turno;

    public void imprimirDados() {
        System.out.println(nome + "-" + curso + "-"+ turno);
    }
    public static Cordenador criar() {
        var cordenador = new Cordenador();
        var scanner = new Scanner(System.in);

        System.out.println("nome: ");
        cordenador.nome = scanner.nextLine();

        System.out.println("curso: ");
        cordenador.curso = scanner.nextLine();

        System.out.println("turno: ");
        cordenador.turno = scanner.nextLine();

        return cordenador;
    }

}
