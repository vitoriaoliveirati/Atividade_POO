package Classes;

public class Bolsista extends Aluno{

    public Bolsista(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade, matricula);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("O bolsista "+ getNome() + "não necessita pagar a mensalidade, continue estudando para não perder a bolsa!");
    }

}
