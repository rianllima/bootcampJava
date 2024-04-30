package DesafioDeCodigo.Basico.Desafio3;

import java.util.Scanner;

public class AccountEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        checkAccount(age);
        scanner.close();
    }
    static void checkAccount(int age){
        if(age >= 18){
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }else{
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }
    }
}
