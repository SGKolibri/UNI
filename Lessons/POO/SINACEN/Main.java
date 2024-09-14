package POO.SINACEN;

public class Main {
    public static void main(String[] args) {
        PlanoDeTreino planoBasico = new PlanoDeTreino();
        planoBasico.exibirPlano();

        PlanoDeTreino planoBasico2 = new PlanoDeTreino("Plano de Iniciantes", 6, "Iniciante");
        planoBasico2.exibirPlano();

        System.out.println();

        PlanoDeTreinoAvancado planoAvancado = new PlanoDeTreinoAvancado();
        planoAvancado.exibirPlano();
    }
}