
public class Disciplina {
    private String codigo;
    private String nomeDisciplina;
    private int semestre;


    public Disciplina(String codigo, String nomeDisciplina, int semestre) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.semestre = semestre;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNomeDisciplina(){
        return nomeDisciplina;
    }

    public int getSemestre () {
        return semestre;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}

