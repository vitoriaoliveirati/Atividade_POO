package br.com.unifor.projetopoo.modelo;

public class Bolsista extends Aluno{

    public Bolsista(String nome, String cpf, int idade, String tipoAluno) {
        super(nome, cpf, idade, tipoAluno);
    }
@
    public void pagarMensalidade(){
        System.out.println("O(a) " + getNome() + "não necessita  pagar a mensalidade! Continue estudando para manter a " +
                "bolsa");
    }

}
