package DesafioDeCodigo.Basico.Desafio2;

import java.util.Scanner;

public class AccountNumberChecker {
    public static void main(String[] args) {
        String accountNumber;
        Scanner scanner = new Scanner(System.in);

        try{
            accountNumber = scanner.next();
            checkAccountNumber(accountNumber);
            System.out.println("Numero de conta valido.");
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        } finally{
            scanner.close();
        }
    }
    private static void checkAccountNumber(String accountNumber) {
        if(accountNumber.length() != 8){
            throw new IllegalArgumentException("Numero de conta invalido.\nDigite exatamente 8 digitos.");
        }
    }
}
