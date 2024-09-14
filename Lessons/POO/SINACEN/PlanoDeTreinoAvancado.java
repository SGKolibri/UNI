package POO.SINACEN;

public class PlanoDeTreinoAvancado extends PlanoDeTreino {
    private boolean incluiTreinosAltaIntensidade;

    // Construtor padrão
    public PlanoDeTreinoAvancado() {
        super("Plano Avançado", 8, "Avançado");
        this.incluiTreinosAltaIntensidade = true;
    }

    // Construtor com parâmetros
    public PlanoDeTreinoAvancado(String nome, int duracaoSemanas, boolean incluiTreinosAltaIntensidade) {
        super(nome, duracaoSemanas, "Avançado");
        this.incluiTreinosAltaIntensidade = incluiTreinosAltaIntensidade;
    }

    // Getter e Setter
    public boolean isIncluiTreinosAltaIntensidade() {
        return incluiTreinosAltaIntensidade;
    }

    public void setIncluiTreinosAltaIntensidade(boolean incluiTreinosAltaIntensidade) {
        this.incluiTreinosAltaIntensidade = incluiTreinosAltaIntensidade;
    }

    // Sobrescrita do método exibirPlano()
    @Override
    public void exibirPlano() {
        super.exibirPlano();
        System.out.println("Inclui Treinos de Alta Intensidade: " + (incluiTreinosAltaIntensidade ? "Sim" : "Não"));
    }
}