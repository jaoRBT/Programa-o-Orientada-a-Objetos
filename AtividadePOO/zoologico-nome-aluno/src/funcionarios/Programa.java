package funcionarios;

import funcionarios.Funcionario;

public class Programa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os dados do funcionario" + (i + 1) + ":");
            funcionarios[i] = Funcionario.criarNovoFuncionario();
        }

        System.out.println("\nLista de funcionarios cadastrados:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.imprimirInformacoes();
            System.out.println();
        }
    }
}
