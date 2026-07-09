package com.java.devdojo.javacore.javacore.dconstrutor.dominio;

public class Livro {
    private String nome;
    private String tipo;
    private int paginas;
    private String genero;
    private String editora;

    // If I don't write a constructor, the compiler will add it for me.
    public Livro(String nome, String tipo, int paginas, String genero){ //in a Java certification exam or during a Java tests, they might try to trick me by adding "void" here, turning this constructor into a method.
        this(); //call the other constructor... It must be the first statement in the constructor body.
        this.nome = nome;
        this.tipo = tipo;
        this.paginas = paginas;
        this.genero = genero;
    }

    public Livro(String nome, String tipo, int paginas, String genero, String editora){ //in a Java certification exam or during a Java tests, they might try to trick me by adding "void" here, turning this constructor into a method.
        this(nome, tipo, paginas, genero); //call the other constructor...
        this.editora = editora;
    }

    // Sobrecarga mais uma vez / Overload once again:
    public Livro(){ //The parameteres need to be either different in amount the quantity or the types.
        System.out.println("Inside no args constructor.");
    }

//    public void init(String nome, String tipo, int paginas){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.paginas = paginas;
//    }
//
//    //Sobrecarga de métodos: mesmo nome, parâmetros diferentes:
//    public void init(String nome, int paginas,String genero){
//        this.init(nome, tipo, paginas);
//        this.genero = genero;
//    }

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
