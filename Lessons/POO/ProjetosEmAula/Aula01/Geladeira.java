package POO.ProjetosEmAula.Aula01;

public class Geladeira {
    private String marca;
    private int capacidadeLitros;
    private boolean frostFree;

    // Construtor padrão
    public Geladeira() {
        this.marca = "Samsung";
        this.capacidadeLitros = 500;
        this.frostFree = false;
    }

    // Construtor com parâmetros
    public Geladeira(String marca, int capacidadeLitros, boolean frostFree) {
        this.marca = marca;
        this.capacidadeLitros = capacidadeLitros;
        this.frostFree = frostFree;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public boolean isFrostFree() {
        return frostFree;
    }

    public void setFrostFree(boolean frostFree) {
        this.frostFree = frostFree;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Capacidade: " + capacidadeLitros + " litros");
        System.out.println("Frost Free: " + (frostFree ? "Sim" : "Não"));
    }
}
