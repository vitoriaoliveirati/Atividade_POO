package Classes; // package é uma boa prática escrever assim, e o package serve para criar um pacote e organizar as classes, seria o pacote raiz//

public abstract class Pessoa {
    public String nome;
    public String cpf;
    public int idade;

    // Construtor
    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    //Os metodos get() tem como finalidade receber os valores fornecidos pelo usuário
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }

    //Os métodos set() tem como finalidade atribuir esses valores capturados pelo get() para que os mesmos sejam armazenados em suas respectivas variáveis
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    //Metodo que recebe a idade atual da pessoa e incrementa mais uma unidade em sua idade
    public void IncrementarIdade(){
        this.idade++;
    }

    //Metodo que recebe o valor fornecido pelo metodo IncrementarIdade e com isso imprime na tela qual será a idade que a pessoa irá completar
    public void fazerAniversario(){
        IncrementarIdade();
        System.out.println("A "+ nome + "irá completar "+ idade + "anos");
    }
}


