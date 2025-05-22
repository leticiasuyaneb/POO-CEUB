public class aluno {
    private String nome;
    private String turma;

    public aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Turma: " + turma;
    }
}
