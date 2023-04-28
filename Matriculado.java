package Tarefa;

public class Matriculado {

    private final Aluno aluno;
    private final int ano;
    private final int semestre;

    public Matriculado(Aluno aluno, int ano, int semestre) {
        this.aluno = aluno;
        this.ano = ano;
        this.semestre = semestre;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }


}
