package com.java.devdojo.javacore.introducaoclasses.fmodificadorestatico.test;

import com.java.devdojo.javacore.introducaoclasses.fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Ferrari", 320);
        Carro c3 = new Carro("Audio", 290);

        c1.setVelocidadeLimite(190); // por conta do modificador de acesso "static", esse atributo pertence à classe e,
        // ao setá-lo, eu não o modifico na instância, mas na classe. Portanto, o altero em todas as instâncias.
        // Seria o mesmo que esse atributo ser público e eu alterá-lo assim: "Carro.velocidadeLimite = 190".

        //Resumindo, o static faz o objeto pertencer à classe e, portanto, a todas as classes
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
