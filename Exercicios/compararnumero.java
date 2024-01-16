package Exercicios;

import java.util.Scanner;

public class compararnumero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
        int numeroDigitado1 = leitor.nextInt();
        
        System.out.println("Digite o segundo número");
        int numeroDigitado2 = leitor.nextInt();
        
        
        if (numeroDigitado1 == numeroDigitado2) {
        	System.out.println("Os números são iguais");
        } else if (numeroDigitado1 > numeroDigitado2) {
        	System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
} 
