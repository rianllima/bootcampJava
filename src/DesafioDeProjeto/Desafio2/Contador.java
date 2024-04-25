package DesafioDeProjeto.Desafio2;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int parameter1 = 0, parameter2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        parameter1 = scan.nextInt();
        System.out.println("Digite o primeiro parâmetro:");
        parameter2 = scan.nextInt();

        try{
            count(parameter1,parameter2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

    static void count(int parameter1, int parameter2) throws ParametrosInvalidosException{
        if(parameter1 > parameter2){
            throw new ParametrosInvalidosException();
        }
        int score = parameter2 - parameter1;

        for(int i = 1; i <= score; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
