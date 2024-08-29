import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<Aluno> sala1Alunos = new ArrayList<>();
    private static ArrayList<String> sala1Profs = new ArrayList<>();
    private static ArrayList<Aluno> sala2Alunos = new ArrayList<>();
    private static ArrayList<String> sala2Profs = new ArrayList<>();
    private static ArrayList<Aluno> sala3Alunos = new ArrayList<>();
    private static ArrayList<String> sala3Profs = new ArrayList<>();
    private static Turma turma1 = new Turma("1");
    private static Turma turma2 = new Turma("2");
    private static Turma turma3 = new Turma("3");

    public static void main(String[] args) {

        Aluno MarinaMartins = new Aluno("12","Marina", "03/03/2001", "pegradowski@gmail.com", "02902376904", "3");
        sala3Alunos.add(MarinaMartins);
        turma3.addAluno(MarinaMartins);
        Scanner scanner = new Scanner(System.in);

        perguntar();
    }
    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do aluno:");
        String name = scanner.next();
        System.out.println("Matrícula do aluno:");
        String matricula = scanner.next();
        System.out.println("Data de nascimento do aluno:");
        String dataNasc = scanner.next();
        System.out.println("Email do aluno:");
        String email = scanner.next();
        System.out.println("CPF do aluno:");
        String cpf = scanner.next();
        System.out.println("Turma do aluno (1, 2, ou 3):");
        String turma = scanner.next();
        Aluno aluno = new Aluno(matricula, name, dataNasc, email, cpf, turma);
        switch (turma) {
            case "1":
                sala1Alunos.add(aluno);
                turma1.addAluno(aluno);
                break;
            case "2":
                sala2Alunos.add(aluno);
                turma2.addAluno(aluno);
                break;
            case "3":
                sala3Alunos.add(aluno);
                turma3.addAluno(aluno);
                break;
        }

    }

    public static void perguntar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastrar um novo aluno? (C)\nCadastrar um novo professor? (P)\nListar alunos de uma sala? (L)\nListar professores de uma sala? (T)\nMostrar INFO de aluno? (I)\nListar disciplinas? (D)");
        String option = scanner.next();
        switch(option) {
            case "C":
                System.out.println("Para que sala?");
                String turma = scanner.next();
                switch (turma) {
                    case "1":
                        if (turma1.getAlunos().size() < 10) {
                            addStudent();
                        }
                        else {
                            System.out.println("Sala cheia");
                        }
                        break;
                    case "2":
                        if (turma2.getAlunos().size() < 10) {
                            addStudent();
                        }
                        else {
                            System.out.println("Sala cheia");
                        }
                        break;
                    case "3":
                        if (turma3.getAlunos().size() < 10) {
                            addStudent();
                        }
                        else {
                            System.out.println("Sala cheia");
                        }
                        break;
                    default:
                        System.out.println("Favor digitar 1, 2 ou 3");
                }
                break;
            case "P":
                    addTeacherToClass();
            case "L":
                System.out.println("De que sala?");
                String turmaL = scanner.next();
                switch (turmaL) {
                    case "1":
                        for (Aluno aluno : sala1Alunos) {
                            System.out.println(aluno.getNome());
                        }
                        break;
                    case "2":
                        for (Aluno aluno : sala2Alunos) {
                            System.out.println(aluno.getNome());
                        }
                        break;
                    case "3":
                        for (Aluno aluno : sala3Alunos) {
                            System.out.println(aluno.getNome());
                        }
                        break;
                    default:
                        System.out.println("Favor digitar 1, 2 ou 3");
                }
            case "T":
                System.out.println("De que sala?");
                String turmaT = scanner.next();
                switch (turmaT) {
                    case "1":
                        System.out.println(turma1.getProfessor().getName());
                        break;
                    case "2":
                        System.out.println(turma2.getProfessor().getName());
                        break;
                    case "3":
                        System.out.println(turma3.getProfessor().getName());
                        break;
                    default:
                        System.out.println("Favor digitar 1, 2 ou 3");
                }
                break;
            case "I":
                System.out.println("Matricula do aluno:");
                String matricula = scanner.next();
                for (Aluno aluno : sala1Alunos) {
                    if (aluno.getMatricula().equals(matricula)) {
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Data de nascimento: " + aluno.getDataNasc());
                        System.out.println("Email: " + aluno.getEmail());
                        System.out.println("CPF: " + aluno.getCpf());
                        System.out.println("Ano de nascimento: " + aluno.getAnoNasc());
                    }
                }
                for (Aluno aluno : sala2Alunos) {
                    if (aluno.getMatricula().equals(matricula)) {
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Data de nascimento: " + aluno.getDataNasc());
                        System.out.println("Email: " + aluno.getEmail());
                        System.out.println("CPF: " + aluno.getCpf());
                        System.out.println("Ano de nascimento: " + aluno.getAnoNasc());
                    }
                }
                for (Aluno aluno : sala3Alunos) {
                    if (aluno.getMatricula().equals(matricula)) {
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Data de nascimento: " + aluno.getDataNasc());
                        System.out.println("Email: " + aluno.getEmail());
                        System.out.println("CPF: " + aluno.getCpf());
                        System.out.println("Ano de nascimento: " + aluno.getAnoNasc());
                    }
                }
                break;
            case "D":
                System.out.println("Disciplinas:");
                System.out.println("1: " + turma1.getDisciplina());
                System.out.println("2: " + turma2.getDisciplina());
                System.out.println("3: " + turma3.getDisciplina());
                break;
            default:
                System.out.println("Favor digitar C, P, L ou T");
        }

    }

    public static void addTeacherToClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do professor:");
        String teacher = scanner.next();
        System.out.println("Matéria do professor:");
        String subject = scanner.next();
        System.out.println("Para que sala (1, 2, ou 3)?");
        String turma = scanner.next();
        switch (turma) {
            case "1":
                turma1.setProfessor(new Professor(teacher, subject));
                sala1Profs.add(teacher);
                break;
            case "2":
                turma2.setProfessor(new Professor(teacher, subject));
                sala2Profs.add(teacher);
                break;
            case "3":
                turma3.setProfessor(new Professor(teacher, subject));
                sala3Profs.add(teacher);
                break;
            default:
                System.out.println("Favor digitar 1, 2 ou 3");
        }
    }


}
