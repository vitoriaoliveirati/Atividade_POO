package Classes;

public class Regular extends Aluno{
    private float saldo;

    public Regular(String nome, String cpf, int idade, String matricula, String tipoAluno) {
        super(nome, cpf, idade, matricula, tipoAluno);
    }

    @override
    public void pagarMensalidade(float valorMensalidade){
        if(saldo >= valorMensalidade){
            saldo-=valorMensalidade;
            System.out.println("A mensalidade do aluno "+ getNome() + "foi paga com sucesso!");
        } else{
            System.out.println("Saldo insuficiente para pagar a mensalidade");
        }
    }

}
