package tiegoandrade.github.pilha.teste;
import tiegoandrade.github.pilha.tiposPilhas.PilhaArray;
import tiegoandrade.github.pilha.tiposPilhas.PilhaEncadeada;

public class Apicacao {

	public static void main(String[] args) {

		System.out
				.println("===== Criação de uma pilha utilizando vetor =====");

		PilhaArray<String> pilha1 = new PilhaArray<String>(10);
		pilha1.push("a");
		pilha1.push("b");
		pilha1.push("c");
			
		int tamanho = pilha1.size();
		System.out.println("O tamanho da pilha é: " + tamanho);
		

		String s1 = pilha1.top();
		System.out.println("O elemento que está no topo da pilha é: " + s1);

		String s2 = pilha1.pop();
		String s3 = pilha1.pop();
		String s4 = pilha1.pop();		

		System.out.println("Os elementos retirados da pilha foram: " + s2 + " "
				+ s3 + " " + s4);
		
		System.out.println("A pilha está vazia? " + pilha1.isEmpty() + "\n");

		System.out
				.println("===== Criação de uma pilha utilizando uma lista encadeada =====");
		
		PilhaEncadeada<Integer> pilha2 = new PilhaEncadeada<Integer>();
		pilha2.push(1);
		pilha2.push(2);
		pilha2.push(3);
		pilha2.push(4);
		
		int tamanho1 = pilha2.size();
		System.out.println("O tamanho da pilha é: " + tamanho1);
		
		Integer i1 = pilha2.top();
		System.out.println("O elemento que está no topo da pilha é: " + i1);
		
		Integer i2 = pilha2.pop();
		Integer i3 = pilha2.pop();
		Integer i4 = pilha2.pop();
		
		System.out.println("Os elementos retirados da pilha foram: " + i2 + " "
				+ i3 + " " + i4);
		
		System.out.println("A pilha está vazia? " + pilha2.isEmpty());
	}
}
