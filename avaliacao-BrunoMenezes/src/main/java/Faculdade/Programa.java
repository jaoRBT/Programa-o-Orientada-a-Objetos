package Faculdade;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        System.out.println("Cadastro De Coordenadores: ");

        List<Cordenador> ListaCordenador=  Arrays.asList(Cordenador.criar(), Cordenador.criar(), Cordenador.criar(),
                Cordenador.criar());

        ListaCordenador.forEach(Cordenador::imprimirDados);
    }
}
