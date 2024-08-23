package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Conta;
import entidades.ContaPoupanca;
import entidades.conta_corrente;
import entidades.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        while (true) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Criar conta");
            System.out.println("2. Consultar contas");
            System.out.println("3. Sair");
            System.out.println("Digite sua opção:");
            int acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    System.out.println("Digite o nome da pessoa");
                    String nome = scanner.next();
                    System.out.println("Digite o número da conta da pessoa");
                    int nConta = scanner.nextInt();

                    System.out.println("Escolha o tipo de conta que você quer criar:");
                    System.out.println("1. Criar conta corrente");
                    System.out.println("2. Criar conta poupança");
                    int escolha = scanner.nextInt();

                    Conta conta;
                    if (escolha == 1) {
                        System.out.println("Defina o limite da sua conta");
                        double limite = scanner.nextDouble();
                        conta = new conta_corrente(nome, nConta, 0.0, limite);
                    } else if (escolha == 2) {
                        conta = new ContaPoupanca(nome, nConta, 0.0);
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                    }

                    contas.add(conta);
                    break;

                case 2:
                	System.out.println("Digite o nome da pessoa");
                    String nomeConsulta = scanner.next();
                    System.out.println("Digite o número da conta da pessoa");
                    int nContaConsulta = scanner.nextInt();
                    for (Conta c : contas) {
                        if (c.getNome().equals(nomeConsulta) && c.getNumero() == nContaConsulta) {
                            System.out.println(c.toString());
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}