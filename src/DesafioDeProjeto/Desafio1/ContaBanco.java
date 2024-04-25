package DesafioDeProjeto.Desafio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        int accountNumber;
        String agency;
        String clientName;
        double bankBalance;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Por favor, digite o número da Agência:");
            agency = scanner.nextLine();

            System.out.println("Informe o número da Conta:");
            accountNumber = scanner.nextInt();

            System.out.println("Digite seu nome:");
            clientName = scanner.next();
            scanner.nextLine();

            System.out.println("Digite seu saldo:");
            bankBalance = scanner.nextDouble();

            System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency +
                    " conta " +  accountNumber + " e seu saldo " + bankBalance + " já está disponível para saque.");
            scanner.close();
            }catch(InputMismatchException e){
                System.out.println("Os campos número da conta e saldo precisam ser númericos!");
            }
    }
}
