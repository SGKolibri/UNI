package POO.SINACEN;

public class User {
    private String nome;
    private int idade;
    private String email;
    private String senha;
    private String planoDeTreino;

    public User() {
        this.nome = "Usuário";
        this.idade = 18;
        this.email = "user@example.com";
        this.senha = "123456";
        this.planoDeTreino = "Plano Avançado";
    }

    public User(String nome, int idade, String email, String senha, String planoDeTreino) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.planoDeTreino = planoDeTreino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPlanoDeTreino() {
        return planoDeTreino;
    }

    public void setPlanoDeTreino(String planoDeTreino) {
        this.planoDeTreino = planoDeTreino;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
        System.out.println("Plano de Treino: " + planoDeTreino);
    }

}