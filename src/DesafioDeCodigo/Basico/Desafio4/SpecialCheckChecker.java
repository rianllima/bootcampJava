package DesafioDeCodigo.Basico.Desafio4;

import java.util.Scanner;

public class SpecialCheckChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        double withdraw = scanner.nextDouble();
        double specialLimit = 500;
        verifyTransaction(balance, withdraw, specialLimit);
        scanner.close();
    }
    static void verifyTransaction(double balance, double withdraw, double specialLimit){
        if(balance >= withdraw){
            System.out.println("Transação realizada com sucesso.");
        } else if(balance < withdraw && (withdraw - balance) <= specialLimit){
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        }else{
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }
    }
}
