package faculdade;

import java.util.Scanner;

public class Cordenador {
    private String nome;
    private String curso;
    private String turma;

    @Override
    public String
    toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }
    public void  imprimir(){
        System.out.println(this);
    }

    public static Cordenador contruir(){

        var cordenador = new Cordenador();
        var scanner = new Scanner(System.in);

        System.out.println("Nome");
        cordenador.nome = scanner.nextLine();

        System.out.println("curso");
        cordenador.curso = scanner.nextLine();

        System.out.println("turma");
        cordenador.turma = scanner.nextLine();

        return cordenador;
    }

}
