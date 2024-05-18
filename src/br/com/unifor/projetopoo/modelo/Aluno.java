package br.com.unifor.projetopoo.modelo; // package é uma boa prática escrever assim, e o package serve para criar um pacote e organizar as classes, seria o pacote raiz//

public class Aluno extends Pessoa {
    private String matricula;
    private String tipoAluno;

    public Aluno (String nome, String cpf, int idade, String matricula, String tipoAluno){
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.tipoAluno = tipoAluno;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getTipoAluno(){
        return tipoAluno;
    }
    public void setTipoAluno(String tipoAluno){
        this.tipoAluno = tipoAluno;
    }

    public void pagarMensalidade(){
        System.out.println("Os alunos pagam a mensalidade");
    }

}
