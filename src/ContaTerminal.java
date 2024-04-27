import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    int conta;
    String agencia;
    String nomeCliente;
    double saldo;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o número da conta: ");
    conta = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Por favor, digite o número da Agência: ");
    agencia = scanner.nextLine();
    System.out.println("Por favor, digite o seu nome: ");
    nomeCliente = scanner.nextLine();
    System.out.println("Por favor, faça seu primeiro depósito ");
    saldo = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Depósito realizado com sucesso!");

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.%n",
        nomeCliente, agencia, conta, saldo);
  }
}
