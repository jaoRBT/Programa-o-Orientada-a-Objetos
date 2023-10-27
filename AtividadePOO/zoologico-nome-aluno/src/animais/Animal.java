package animais;

import java.util.Scanner;

public class Animal {
    private String nome;
    private String especie;
    private String alimentacao;

    public Animal(String nome, String especie, String alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.alimentacao = alimentacao;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Alimentação: " + alimentacao);
    }

    public static Animal criarNovoAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do animal:");
        String nome = scanner.nextLine();
        System.out.println("Informe a espécie do animal:");
        String especie = scanner.nextLine();
        System.out.println("Informe a alimentação do animal:");
        String alimentacao = scanner.nextLine();
        return new Animal(nome, especie, alimentacao);
    }
}