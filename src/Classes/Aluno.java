package Classes; // package é uma boa prática escrever assim, e o package serve para criar um pacote e organizar as classes, seria o pacote raiz//

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno (String nome, String cpf, int idade, String matricula){
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    //O método pagarMensalidade ficará vazio, pois ele será sobrescrito nas classes filhas
    public void pagarMensalidade(float valorMensalidade){}
}
