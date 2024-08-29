import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String turma;
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private Professor professor;
    private String disciplina;

    public Turma(String turma) {
        this.turma = turma;
    }

    public String getTurma() {
        return this.turma;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
