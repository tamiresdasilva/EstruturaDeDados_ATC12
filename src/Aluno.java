public class Aluno {
    String nome;
    String email;

    public Aluno(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\'' +
                ", Email: '" + email + '\'';
    }
}
