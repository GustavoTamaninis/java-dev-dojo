package com.java.devdojo.javacore.javacore.ycollections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // chave e valor
        // não pode haver chaves duplicadas no Map, por isso devo implementar o HashMap ou Equals

        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("vc", "você2"); // sobrescreve.
        map.putIfAbsent("vc", "você3"); // só vai adicionar caso não existe uma chave repetida.
        map.put("cê", "você2"); // o valor pode ser repetido.
        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("--------------------");
        for(String value : map.values()){
            System.out.println(value);
        }

        System.out.println("--------------------");
        for(Map.Entry<String, String> entry: map.entrySet()){ // a variável entry armazena chave e valor.
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
