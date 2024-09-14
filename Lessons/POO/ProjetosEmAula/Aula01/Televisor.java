package POO.ProjetosEmAula.Aula01;

public class Televisor {
    private String marca;
    private String modelo;
    private int tamanho;
    private boolean ligado;

    // Construtor padrão
    public Televisor() {
        this.marca = "Samsung";
        this.modelo = "QLED";
        this.tamanho = 50;
        this.ligado = false;
    }

    // Construtor com parâmetros
    public Televisor(String marca, String modelo, int tamanho) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.ligado = false; // Por padrão, o televisor começa desligado
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isLigado() {
        return ligado;
    }

    // Métodos específicos para ligar e desligar o televisor
    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanho + " polegadas");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }
}