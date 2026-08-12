package com.java.devdojo.javacore.javacore.ycollections.test;

import com.java.devdojo.javacore.javacore.ycollections.domain.Livro;
import com.java.devdojo.javacore.javacore.ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet; // é uma interface
import java.util.TreeSet;

// Quando não tenho acesso à classe, pode-se utilizar o Comparable ou passar o comparator direto na criação do treeset.
// A seguir, a primeira forma:
class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class LivroPrecoComparator implements Comparator<Livro>{

    @Override
    public int compare(Livro o1, Livro o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args){
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator()); // uma das classes que implementam NavigableSet. E é do tipo sort.
        Smartphone smartphone01 = new Smartphone("123", "Nokia");
        set.add(smartphone01);
        System.out.println(set + "\n");

        NavigableSet<Livro> livros = new TreeSet<>();
        livros.add(new Livro(3L, "O Senhor dos Anéis: A Sociedade do Anel", 79.99, 0));
        livros.add(new Livro(2L, "O Hobbit", 27.90, 1));
        livros.add(new Livro(1L, "Ortodoxia", 25.50, 0));
        livros.add(new Livro(5L, "Crime e Castigo", 50D, 2));
        livros.add(new Livro(4L, "O Livro das Virtudes", 43.90, 0));
        livros.add(new Livro(4L, "O Livro das Virtudes", 43.90, 0));

        System.out.println("Ordem normal:");
        for (Livro livro : livros) {
            System.out.println(livro);// o TreeSet reordena automaticamente seus itens baseado no méthodo compareTo ou no Comparator passado no TreeSet.
            // Portanto ele não usa equals, mas apenas compara o ID e o Nome.
            // Por ser um Set, ele também ignora itens repetidos.
        }

        System.out.println("\n==================================\n");

        System.out.println("Ordem descendente:");
        for (Livro livro : livros.descendingSet()) {
            System.out.println(livro);
        }

        System.out.println("\n==================================\n");

        NavigableSet<Livro> livros02 = new TreeSet<>(new LivroPrecoComparator()); // novo critério de comparação/ordenação.
        livros02.add(new Livro(3L, "O Senhor dos Anéis: A Sociedade do Anel", 79.99, 0));
        livros02.add(new Livro(2L, "O Hobbit", 27.90, 1));
        livros02.add(new Livro(1L, "Ortodoxia", 25.50, 0));
        livros02.add(new Livro(6L, "A Ilha do Tesouro", 30D, 1));
        livros02.add(new Livro(5L, "Crime e Castigo", 50D, 2));
        livros02.add(new Livro(4L, "O Livro das Virtudes", 43.90, 0));
        livros02.add(new Livro(4L, "O Livro das Virtudes", 43.90, 0));

        System.out.println("Ordenado pelo preço:");
        for (Livro livro : livros02) {
            System.out.println(livro);
        }

        System.out.println("\n==================================\n");

        /*
            lower: o imediatamente menor (<)
            floor: o objeto ou, caso ele não exista, o imediato abaixo dele (≤)
            higher: o imediatamente maior (>)
            ceiling: o objeto ou, caso ele não exista, o imediato acima dele (≥)
        */

        Livro padreBrown = new Livro(7L, "A Inocência do Padre Brown", 30D, 4);

        System.out.println("Livro com preço imediatamente menor que R$" + padreBrown.getPreco() + ":");
        System.out.println(livros02.lower(padreBrown));

        System.out.println("\n==================================\n");
        System.out.println("Livro com preço igual ou imediatamente menor que R$" + padreBrown.getPreco() + ":");
        System.out.println(livros02.floor(padreBrown));

        // Mesma coisa com higher e ceiling.

        System.out.println("\n==================================\n");
        System.out.println("Retirar itens da lista começando pelo primeiro");
        System.out.println(livros02.size());
        System.out.println(livros02.pollFirst()); // retorna e remove o primeiro.
        // O mesmo com pollLast

    }
}


