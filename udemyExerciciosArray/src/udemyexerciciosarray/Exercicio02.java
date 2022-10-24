package udemyexerciciosarray;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho = entrada.nextInt();

        int[] numeros = new int[tamanho];
        int[] pares = new int[tamanho];
        int qtdPares = 0;

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = entrada.nextInt();
            
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
                qtdPares++;
            }
        }
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < qtdPares; i++) {

            System.out.print(pares[i] + " ");
        }
        
        System.out.println("\nQUANTIDADE DE PARES: "+ qtdPares);
    }
}
