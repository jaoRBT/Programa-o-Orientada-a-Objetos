package funcionarios;

import java.util.Scanner;


public class Funcionario {

    private String nome;

    private String funcao;

    private String setor;

    public Funcionario(String nome, String funcao, String setor) {
        this.nome = nome;
        this.funcao = funcao;
        this.setor = setor;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Funcao: " + funcao);
        System.out.println("Setor: " + setor);
    }

    public static Funcionario criarNovoFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do funcionario:");
        String nome = scanner.nextLine();
        System.out.println("Ijnforme a funcao do funcionario:");
        String funcao = scanner.nextLine();
        System.out.println("Informe o setor do funcionario:");
        String setor = scanner.nextLine();
        return new Funcionario(nome, funcao, setor);
    }
}
