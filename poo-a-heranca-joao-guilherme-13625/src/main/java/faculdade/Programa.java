package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Unialfa faculdade");

        List<Docente> docentes = new ArrayList<>();
        List<Tecnico> tecnicos = new ArrayList<>();
        List<Assistente> assistentes = new ArrayList<>();
        List<Cordenador> cordenadors = new ArrayList<>();

        cadastrarFuncionarios(docentes, tecnicos, assistentes, cordenadors);


        imprimirLista(docentes, tecnicos, assistentes, cordenadors);
    }

    private static void cadastrarFuncionarios(List<Docente> docentes, List<Tecnico> tecnicos, List<Assistente> assistentes, List<Cordenador> cordenadors) {
        var scanenr = new Scanner(System.in);

        do {

            System.out.println("Edcolha cadastro");
            System.out.println("Docente [d]");
            System.out.println("Tecnico [t]");
            System.out.println("Assistente [a]");
            System.out.println("Coordenador [c]");
            var TipoCadastro = scanenr.nextLine();

            if (TipoCadastro.equals("d")) docentes.add(Docente.contruir());
            if (TipoCadastro.equals("t")) tecnicos.add(Tecnico.contruir());
            if (TipoCadastro.equals("a")) assistentes.add(Assistente.contruir());
            if (TipoCadastro.equals("c")) cordenadors.add(Cordenador.contruir());


            System.out.println("continuar[1]");
        }while (scanenr.nextLine().equals("1"));
    }

    private static void imprimirLista(List<Docente> docentes, List<Tecnico> tecnicos, List<Assistente> assistentes, List<Cordenador> cordenadors) {
        docentes.forEach(Docente::imprimir);
        tecnicos.forEach(Tecnico::imprimir);
        assistentes.forEach(Assistente::imprimir);
        cordenadors.forEach(Cordenador::imprimir);
    }

}
