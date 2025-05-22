public class professor {
    private String nome;
    private String matricula;

    public professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public aluno cadastrarAluno(String nome, String turma) {
        return new aluno(nome, turma);
    }

    public atividade cadastrarAtividade(String titulo, String descricao) {
        return new atividade(titulo, descricao);
    }

    public void atribuirNota(atividade atividade, double nota) {
        atividade.setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
