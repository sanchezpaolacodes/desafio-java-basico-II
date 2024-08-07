import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        String menu = " 1. Depositar" +
                " \n 2. Sacar" +
                " \n 3. Consultar Saldo" +
                " \n 0. Encerrar";

        Scanner scanner = new Scanner(System.in);
        double valor;
        boolean continuar = true;

        double saldoAtual=0;
        while (continuar) {
            System.out.println(menu);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    valor = scanner.nextDouble();
                    saldoAtual += valor;
                    System.out.println("Saldo atual: " + saldoAtual);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar:");
                    valor = scanner.nextDouble();

                    if(valor <= saldoAtual){
                        saldoAtual -= valor;
                        System.out.println("Saldo atual: " + saldoAtual);
                    }else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: "+ saldoAtual);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}