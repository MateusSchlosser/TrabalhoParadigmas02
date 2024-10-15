public class Conta {
    Cliente cliente;
    final double PRECO_CERVEJA = 5.00;
    final double PRECO_REFRIGERANTE = 3.00;
    final double PRECO_ESPETINHO = 7.00;
    final double COUVERT = 4.00;
    final double INGRESSO_HOMEM = 10.00;
    final double INGRESSO_MULHER = 8.00;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularConsumo() {
        double totalCerveja = cliente.getQuantidadeCervejas() * PRECO_CERVEJA;
        double totalRefrigerante = cliente.getQuantidadeRefrigerantes() * PRECO_REFRIGERANTE;
        double totalEspetinho = cliente.getQuantidadeEspetinhos() * PRECO_ESPETINHO;
        return totalCerveja + totalRefrigerante + totalEspetinho;
    }

    public double calcularCouvert() {
        if (calcularConsumo() > 30.00) {
            return 0.00;
        }
        return COUVERT;
    }

    public double calcularIngresso() {
        if (cliente.getSexo() == 'M' || cliente.getSexo() == 'm') {
            return INGRESSO_HOMEM;
        } else if (cliente.getSexo() == 'F' || cliente.getSexo() == 'f') {
            return INGRESSO_MULHER;
        }
        return 0.00; // Valor padrão caso não seja F ou M
    }

    public double calcularValorTotal() {
        return calcularConsumo() + calcularCouvert() + calcularIngresso();
    }
}
