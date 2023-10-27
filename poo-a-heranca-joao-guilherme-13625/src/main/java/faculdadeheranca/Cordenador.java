package faculdadeheranca;

import java.util.Scanner;

public class Cordenador extends Funcionario {

    private String Nome;
    private String curso;
    private String turma;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String
    toString() {
        return "Cordenador{" +
                "nome='" + getNome() + '\'' +
                ", curso='" + curso + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }


    public static Cordenador contruir(){

        var cordenador = new Cordenador();
        var scanner = new Scanner(System.in);

        System.out.println("Nome");
        cordenador.setNome(scanner.nextLine());

        System.out.println("curso");
        cordenador.setCurso(scanner.nextLine());

        System.out.println("turma");
        cordenador.setTurma(scanner.nextLine());

        return cordenador;
    }

}
