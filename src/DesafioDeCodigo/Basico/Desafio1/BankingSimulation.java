package DesafioDeCodigo.Basico.Desafio1;

import java.util.Scanner;

public class BankingSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean done = false;
        do{
            int option = scanner.nextInt();
            switch(option){
                case 1: {
                    balance = scanner.nextDouble();
                    System.out.println("Saldo atual: " + balance);
                    break;
                }
                case 2:{
                    double withdraw = scanner.nextDouble();
                    if(withdraw > balance){
                        System.out.println("Saldo insuficiente.");
                    } else{
                        System.out.println("Saldo atual: " + (balance -= withdraw));
                    }
                    break;
                }
                case 3:{
                    System.out.println("Saldo atual: " + balance);
                    break;
                }
                case 0:{
                    System.out.println("O programa encerrado.");
                    done = true;
                    break;
                }
                default:{
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
                }
            }
        }while(!done);
    }
}
