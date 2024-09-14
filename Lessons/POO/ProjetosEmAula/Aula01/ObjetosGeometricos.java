package POO.ProjetosEmAula.Aula01;

public class ObjetosGeometricos {
    private String nome;
    private double area;

    // Construtor padrão
    public ObjetosGeometricos() {
        this.nome = "Círuclo";
        this.area = 5;
    }

    // Construtor com parâmetros
    public ObjetosGeometricos(String nome, double area) {
        this.nome = nome;
        this.area = area;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Área: " + area);
    }
}
