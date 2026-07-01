package com.java.devdojo.javacore.introducaoclasses.csobrecargametodos.dominio;

public class Livro {
    private String nome;
    private String tipo;
    private int paginas;
    private String genero;

    public void init(String nome, String tipo, int paginas){
        this.nome = nome;
        this.tipo = tipo;
        this.paginas = paginas;
    }

    //Sobrecarga de métodos: mesmo nome, parâmetros diferentes:
    public void init(String nome, int paginas,String genero){
        this.init(nome, tipo, paginas);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.paginas);
        System.out.println(this.genero);
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
        return tipo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return this.paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
