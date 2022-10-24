
package udemyexerciciosarray;
import java.util.Scanner;
/**
 *
 * @author Samuel
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho = entrada.nextInt();
        
        String[] nome = new String[tamanho];
        int[] idade = new int[tamanho];
        double[] altura = new double[tamanho];
        
        double somaAltura = 0;
        int mediaMenores = 0;
        
        for(int i = 0; i<tamanho; i++){
            System.out.println("ENTRADA PESSOA: " + (i+1));
            nome[i] = entrada.next();
            idade[i] = entrada.nextInt();
            altura[i] = entrada.nextDouble();
            somaAltura += altura[i];
            
            if(idade[i] < 16){
            mediaMenores++;
            }
        }
        
        
        System.out.printf("Altura Média: %.2f \n", (somaAltura/tamanho));
        System.out.println("Pessoas com menos de 16 anos: " + (mediaMenores*(100/tamanho)) +"%");
        
    }
    
}
