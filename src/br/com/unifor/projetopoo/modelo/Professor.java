package br.com.unifor.projetopoo.modelo; // package é uma boa prática escrever assim, e o package serve para criar um pacote e organizar as classes, seria o pacote raiz//

public class Professor extends Pessoa {
    private String centro;

    public Professor(String nome, String cpf, int idade, String matricula, String tipoAluno, String centro) {
        super(nome, cpf, idade);
        this.centro = centro;
    }

    public String getCentro(){
        return centro;
    }
    public void setCentro(String centro){

        this.centro = centro;
    }

    public void darAula(){
        //nao sei//
    }



}
