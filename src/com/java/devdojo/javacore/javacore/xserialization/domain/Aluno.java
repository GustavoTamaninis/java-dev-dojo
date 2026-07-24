package com.java.devdojo.javacore.javacore.xserialization.domain;

import java.io.*;

public class Aluno implements Serializable {
    // pode ser necessário declarar a serial version uid.
    private int id;
    private String nome;
    private transient String password; // um campo que deve ser ignorado durante a serialização.
    // Em caso de associação, o outro associado deve ser também serializável. Comum haver problemas com API:
    private transient Turma turma; // também estou pedindo para o Java ignorar este atributo.
    // Não é serializado um atributo estático, pois pertence à classe.

    public Aluno(int id, String nome, String password) {
        System.out.println("Dentro do construtor. Isto não será executado/lido na desserialização.");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", Nome='" + nome + '\'' +
                ", Password='" + password + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    // Méthodo para "serializar o objeto" Turma:
    // é tipo uma sobrescrita sem ser sobrescrita. Cuidado...
    @Serial
    private void writeObject(ObjectOutputStream oos) { // deve se escrever exatamente desta forma.
        try {
            // primeiro salvo da forma padrão:
            oos.defaultWriteObject();
            // depois salvo tudo aquilo que não faz parte do seu defaultWriteObject, tipo turma.
            oos.writeUTF(turma.getNome()); // o objeto não pode ser salvo, mas os atributos sim.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Méthodo para "ler o objeto" Turma:
    @Serial
    private void readObject(ObjectInputStream ois) { // deve se escrever exatamente desta forma.
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            this.turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void setPassword(String password) {


        this.password = password;
    }
}
