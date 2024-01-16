package Exercicios;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    System.out.print("Digite um número: ");
        int numeroDigitado = leitor.nextInt();
	    
        if (numeroDigitado > 0) {
        	System.out.println("O número que você digitou é positivo");
        } else {
        	System.out.println(" O número que você digitou é negativo");
        }
	}

}
//ACERTEIII