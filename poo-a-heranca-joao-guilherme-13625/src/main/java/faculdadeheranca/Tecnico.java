package faculdadeheranca;

import java.util.Scanner;

public class Tecnico extends Funcionario {

    private String nome;
    private String departamento;
    private String especialidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String
    toString() {
        return "Tecnico{" +
                "nome='" + getNome() + '\'' +
                ", departamento='" + departamento + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }


    public static Tecnico contruir(){
        var tecnico = new Tecnico();
        var scanner = new Scanner(System.in);

        System.out.println("Nome");
        tecnico.setNome(scanner.nextLine());

        System.out.println("departamento");
        tecnico.setDepartamento(scanner.nextLine());

        System.out.println("especialidade");
        tecnico.especialidade = scanner.nextLine();

        return tecnico;
    }
}
