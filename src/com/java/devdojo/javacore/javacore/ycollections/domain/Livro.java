package com.java.devdojo.javacore.javacore.ycollections.domain;

import java.util.Objects;

// Comparable é a interface que me provê meios de definir que ordem deve ser ordenada uma lista de Livros.
public class Livro implements Comparable<Livro>{
    private Long id; // é um wrapper e já possui compareTo.
    private String nome;
    private double preco;

    public Livro(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser nulo");
        Objects.requireNonNull("nome não pode ser nulo");
        Objects.requireNonNull("preço não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String  toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Double.compare(preco, livro.preco) == 0 && Objects.equals(id, livro.id) && Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public int compareTo(Livro outroLivro) {
        // Retorne negativo se o this < outroLivro;
        // Retorne 0 se this = outroLivro;
        // Retorne positivo this > outroLivro.
//        if(this.id < outroLivro.getId()) return -1;
//        else if(this.id.equals(outroLivro.getId())) return 0;
//        else return 1;
        // O Long, diferente de tipos primitivos, já possui compare:
//        return this.id.compareTo(outroLivro.getId()); // ordenando por id
//        return Double.compare(preco, outroLivro.getPreco()); // ordenando por preço
        return this.nome.compareTo(outroLivro.getNome()); // ordenando por nome.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
