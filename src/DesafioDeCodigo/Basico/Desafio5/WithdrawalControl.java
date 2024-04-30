package DesafioDeCodigo.Basico.Desafio5;

import java.util.Scanner;

public class WithdrawalControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dailyLimit = scanner.nextDouble();
        double withdraw;

        boolean stopCondition = false;
        do{
            withdraw = scanner.nextDouble();
            if(withdraw == 0) {
                System.out.println("Transações encerradas.");
                stopCondition = true;
            }
            if((dailyLimit - withdraw) > 0 && withdraw != 0){
                System.out.println("Saque realizado. Limite restante: " + (dailyLimit -= withdraw));
            } else if((dailyLimit - withdraw) < 0){
                System.out.println("Limite diario de saque atingido.\nTransações encerradas.");
                stopCondition = true;
            }
        }while(!stopCondition);
        scanner.close();
    }
}
