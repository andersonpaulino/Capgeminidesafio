package questoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Dado um vetor de inteiros n e um inteiro qualquer x. 
		Construa um algoritmo que determine o número de elementos pares do 
		vetor que tem uma diferença igual ao valor de x.*/
		
		int x,contador = 0;
		int aux;
		Scanner entrada = new Scanner(System.in);
				
		
		int [] sequencia = new int[5];
		
		for(int i = 0; i<5;i++) {
			System.out.println("Digite os numeros do vetor:\n");
			sequencia[i] = entrada.nextInt();
		}
		Arrays.sort(sequencia);
		System.out.println("Ordenando...\n");
		for(int i : sequencia){
			System.out.println(i+"");
			
		}
		System.out.println("Digite o valor de x:\n");
		x = entrada.nextInt();
		
		for(int i = 0;i<sequencia.length;i++) {
			for(i=0;i<sequencia.length-1;i++) {
				aux = sequencia[4]-sequencia[i];
				
				
				if(aux==x) {
					contador++;
					System.out.println("\nDiferenca entre os vetores:"+aux);
					
					System.out.println("\nOnumero de pares é:"+contador);
				}
			}
		}
		
	
	}

}
