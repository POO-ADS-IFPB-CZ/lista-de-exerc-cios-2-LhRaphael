package Contacorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Registre seu número de conta:");
    int numero = scanner.nextInt();
    System.out.print("Registre seu nome:");
    String titular = scanner.next();    
    ContaCorrente conta = new ContaCorrente(numero, titular);

    int opcao = 0;
    while (opcao != 4) {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Sair");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor a ser depositado:");
                float valorDeposito = scanner.nextFloat();
                conta.depositar(valorDeposito);
                break;
            case 2:
                System.out.print("Digite o valor a ser sacado:");
                float valorSaque = scanner.nextFloat();
                conta.sacar(valorSaque);
                break;
            case 3:
                conta.consultarSaldo();
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    scanner.close();
    System.out.println("Obrigado por usar nosso sistema!");
    }

}
