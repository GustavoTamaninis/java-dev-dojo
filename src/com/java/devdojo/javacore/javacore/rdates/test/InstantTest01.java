package com.java.devdojo.javacore.javacore.rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    static void main(String[] args) {
        // Trabalha com nanossegundos. De 1970 pra cá
        Instant now = Instant.now(); // também é imutável, então cada alteração cria uma instância.
        System.out.println(now); // vai imprimir um Z, que representa o zulu time. Horário neutro do mundo, usado por militares.
        System.out.println(LocalDateTime.now()); // para servir de comparação.
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());  // máximo 999.999.999
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
    }
}
