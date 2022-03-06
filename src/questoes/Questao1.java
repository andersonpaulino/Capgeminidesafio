package questoes;

import java.util.Random;
import java.util.Arrays;

public class Questao1 {

	public static void main(String[] args) {
		
		/*A mediana de uma lista de números é basicamente o elemento que se encontra 
		 no meio da lista após a ordenação. Dada uma lista de números com um 
		 número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.*/
		
		//Gerando um array de 5 numeros de forma aleatória
		Random gerar = new Random();
		
		int sequencia[] = new int[5];
		
		for(int i = 0; i<sequencia.length;i++){
			sequencia[i] = gerar.nextInt(20);
			
			System.out.println(sequencia[i]);
		}
		//Ordenar o array em ordem crescente
		Arrays.sort(sequencia);
		System.out.println("\nOrdenando...");
		for(int i : sequencia){
			System.out.println(i+"");
			
		}
		/*Como a mediana de uma sequencia impar é o numero do centro, 
		  basta pegar o conteudo dessa posicao.*/
		System.out.println("\nA mediana da sequencia é:"+sequencia[2]);
		
	}

}
