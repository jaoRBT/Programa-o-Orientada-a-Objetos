package faculdadeheranca;

import java.util.Scanner;

public class Assistente extends Funcionario {

    private String Nome;
    private String setor;
    private String atribuicao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getAtribuicao() {
        return atribuicao;
    }

    public void setAtribuicao(String atribuicao) {
        this.atribuicao = atribuicao;
    }

    @Override
    public String
    toString() {
        return "Assistente{" +
                "nome='" + getNome() + '\'' +
                ", setor='" + setor + '\'' +
                ", atribuicao='" + atribuicao + '\'' +
                '}';
    }


    public static Assistente contruir(){

        var assistente = new Assistente();
        var scanner = new Scanner(System.in);

        System.out.println("Nome");
        assistente.setNome(scanner.nextLine());

        System.out.println("setor");
        assistente.setSetor(scanner.nextLine());

        System.out.println("atribuicao");
        assistente.setAtribuicao(scanner.nextLine());

        return assistente;
    }

}
