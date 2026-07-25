package com.java.devdojo.javacore.javacore.ycollections.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /*
        Regras para sobrescrever o equals:
        - Reflexivo: em x.equals(x), x deve ser true para tudo que for diferente de null.  Ao contrário, x.equals(null) deve retornar falso.
        - Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo y.equals(x) == true;
        - Transitividade: para x, y, z diferentes de null, se x.equals(y) == true e x.equals(z) == true, logo y.equals(z) == true;
        - Consistente: x,equals(x) sempre retorna true se x for diferente de null.
        -
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;

        Smartphone smartphone = (Smartphone) obj;
        return this.serialNumber != null && this.serialNumber.equals(smartphone.serialNumber);
        // Cuidado! Se os nomes forem diferentes, vai retornar true:
        // as regras de negócio definem o que são objetos iguais.
    }

    @Override
    /*
        Regras:
        - Se x.equals(y) == true, logo y.hashCode(x) == x.hashCode();
        - y.hashCode() == x.hashCode() não necessariamente y.equals(x) deve ser true.
        - x.equals(y) == false, o hashcode deve ser diferente
        = y.hashCode() != x.hashCode(), x.equals(y) deverá ser false.
     */
    public int hashCode() { // É um native int, ou seja, foi escrito em outra linguagem de programação.
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
