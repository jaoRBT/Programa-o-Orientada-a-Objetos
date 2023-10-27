package faculdade;

import java.util.Scanner;

public class Assistente {

    private String nome;
    private String setor;
    private String atribuicao;

    @Override
    public String
    toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", atribuicao='" + atribuicao + '\'' +
                '}';
    }
    public void  imprimir(){
        System.out.println(this);
    }

    public static Assistente contruir(){

        var assistente = new Assistente();
        var scanner = new Scanner(System.in);

        System.out.println("Nome");
        assistente.nome = scanner.nextLine();

        System.out.println("setor");
        assistente.setor = scanner.nextLine();

        System.out.println("atribuicao");
        assistente.atribuicao = scanner.nextLine();

        return assistente;
    }

}
