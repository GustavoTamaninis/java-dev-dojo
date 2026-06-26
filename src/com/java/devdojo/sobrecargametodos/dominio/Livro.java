package com.java.devdojo.sobrecargametodos.dominio;

public class Livro {
    private String nome;
    private String tipo;
    private int paginas;

    public void init(String nome, String tipo, int paginas){
        this.nome = nome;
        this.tipo = tipo;
        this.paginas = paginas;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.paginas);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return this.paginas;
    }
}
