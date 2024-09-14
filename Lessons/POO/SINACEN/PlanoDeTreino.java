package POO.SINACEN;
public class PlanoDeTreino {
    private String nome;
    private int duracaoSemanas; // duração do plano em semanas
    private String nivel; // ex: iniciante, intermediário

    // Construtor padrão
    public PlanoDeTreino() {
        this.nome = "Plano Básico";
        this.duracaoSemanas = 4;
        this.nivel = "Iniciante";
    }

    // Construtor com parâmetros
    public PlanoDeTreino(String nome, int duracaoSemanas, String nivel) {
        this.nome = nome;
        this.duracaoSemanas = duracaoSemanas;
        this.nivel = nivel;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoSemanas() {
        return duracaoSemanas;
    }

    public void setDuracaoSemanas(int duracaoSemanas) {
        this.duracaoSemanas = duracaoSemanas;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    // Método para exibir informações do plano
    public void exibirPlano() {
        System.out.println("Plano de Treino: " + nome);
        System.out.println("Duração: " + duracaoSemanas + " semanas");
        System.out.println("Nível: " + nivel);
    }
}
