public class Aluno {
    private String name;
    private String dataNasc;
    private String email;
    private String cpf;
    private String turma;
    private String matricula;

    public Aluno(String matricula, String nome, String dataNasc, String email, String cpf, String turma) {
        this.name = nome;
        this.dataNasc = dataNasc;
        this.email = email;
        this.cpf = cpf;
        this.turma = turma;
    }

    public String getNome() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getAnoNasc() {
        return this.dataNasc.substring(this.dataNasc.length() - 4);
    }


    public String getDataNasc() {
        return this.dataNasc;
    }

    public String getMatricula() {
        return matricula;
    }
}
