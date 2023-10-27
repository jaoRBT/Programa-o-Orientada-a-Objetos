package faculdadeheranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Unialfa faculdade");

        List<Funcionario> funcionarios = new ArrayList<>();

        cadastrarFuncionarios(funcionarios);

        funcionarios.forEach(Funcionario::imprimir);


    }

    private static void cadastrarFuncionarios(List<Funcionario> funcionarios){
        var scanenr = new Scanner(System.in);

        do {

            System.out.println("Edcolha cadastro");
            System.out.println("Docente [d]");
            System.out.println("Tecnico [t]");
            System.out.println("Assistente [a]");
            System.out.println("Coordenador [c]");
            var TipoCadastro = scanenr.nextLine();

            if (TipoCadastro.equals("d")) funcionarios.add(Docente.contruir());
            if (TipoCadastro.equals("t")) funcionarios.add(Tecnico.contruir());
            if (TipoCadastro.equals("a")) funcionarios.add(Assistente.contruir());
            if (TipoCadastro.equals("c")) funcionarios.add(Cordenador.contruir());


            System.out.println("continuar[1]");
        }while (scanenr.nextLine().equals("1"));
    }
}
