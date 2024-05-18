package br.com.unifor.projetopoo.modelo;

public class Regular extends Aluno{

    //construtor
    public Regular (String nome, String cpf, int idade, String tipoAluno) {
        super(nome, cpf, idade, tipoAluno);
    }

    public void pagarMensalidade(){
        System.out.println("O(a) "+ getNome() + "deve pagar a mensalidade!");
    }

}
