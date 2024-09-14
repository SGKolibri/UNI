package POO.ProjetosEmAula.Aula01;

public class TelevisorComDvd extends Televisor {
    private boolean possuiDvd;

    // Construtor padrão
    public TelevisorComDvd() {
        super(); // Chama o construtor da classe base (Televisor)
        this.possuiDvd = false;
    }

    // Construtor com parâmetros
    public TelevisorComDvd(String marca, String modelo, int tamanho, boolean possuiDvd) {
        super(marca, modelo, tamanho); // Chama o construtor da classe base (Televisor)
        this.possuiDvd = possuiDvd;
    }

    // Métodos getters e setters
    public boolean isPossuiDvd() {
        return possuiDvd;
    }

    public void setPossuiDvd(boolean possuiDvd) {
        this.possuiDvd = possuiDvd;
    }

    // Sobrescrita do método exibirInformacoes para incluir informações do DVD
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe base (Televisor)
        System.out.println("Possui DVD: " + (possuiDvd ? "Sim" : "Não"));
    }
}
