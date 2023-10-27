package org.unialfa.atividadetriangulo;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class programa {
    public static void main(String[] args){
        List<Triangulo> Triangulolist = Arrays.asList(
                Triangulo.criar(),
                Triangulo.criar(),
                Triangulo.criar()
        );


        Triangulo objetoTriangulo = Triangulo.criar();
        objetoTriangulo.imprimirResultado();
    }
}
