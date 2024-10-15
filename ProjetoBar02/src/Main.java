import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sexo (F ou M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int quantidadeCervejas = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = scanner.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int quantidadeEspetinhos = scanner.nextInt();

        Cliente cliente = new Cliente(sexo, quantidadeCervejas, quantidadeRefrigerantes, quantidadeEspetinhos);
        Conta conta = new Conta(cliente);

        RelatorioConta.gerarRelatorio(conta);

        scanner.close();
    }
}
