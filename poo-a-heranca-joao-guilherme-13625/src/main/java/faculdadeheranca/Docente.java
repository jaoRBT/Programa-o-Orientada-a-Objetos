package faculdadeheranca;

import java.util.Scanner;

public class Docente extends Funcionario {

    private String Nome
    private String formacao;
    private String cidade;


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + getNome() + '\'' +
                ", formacao='" + formacao + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }




    public static  Docente contruir(){
        var docente = new Docente();
        var scanner = new Scanner(System.in);

        System.out.println("Nome");
        docente.setNome(scanner.nextLine());

        System.out.println("formação");
        docente.setFormacao(scanner.nextLine());

        System.out.println("cidade");
        docente.setCidade(scanner.nextLine());

        return docente;
    }
}

