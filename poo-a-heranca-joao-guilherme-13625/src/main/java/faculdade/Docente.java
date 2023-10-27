package faculdade;

import java.util.Scanner;

public class Docente {
    private String nome;
    private String formacao;
    private String cidade;

    @Override
    public String
    toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", formacao='" + formacao + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
    public void  imprimir(){
        System.out.println(this);
    }

    public static  Docente contruir(){
        var docente = new Docente();
        var scanner = new Scanner(System.in);

        System.out.println("Nome");
        docente.nome = scanner.nextLine();

        System.out.println("formação");
        docente.formacao = scanner.nextLine();

        System.out.println("cidade");
        docente.cidade = scanner.nextLine();

        return docente;
    }
}

