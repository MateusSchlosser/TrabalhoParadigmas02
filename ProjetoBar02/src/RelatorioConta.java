public class RelatorioConta {
    public static void gerarRelatorio(Conta conta) {
        System.out.println("RELATÓRIO");
        System.out.printf("Consumo = R$ %.2f%n", conta.calcularConsumo());
        System.out.printf("Couvert = R$ %.2f%n", conta.calcularCouvert());
        System.out.printf("Ingresso = R$ %.2f%n", conta.calcularIngresso());
        System.out.printf("Valor a pagar = R$ %.2f%n", conta.calcularValorTotal());
    }
}
