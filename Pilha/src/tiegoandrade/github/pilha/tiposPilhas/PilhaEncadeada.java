package tiegoandrade.github.pilha.tiposPilhas;

import tiegoandrade.github.pilha.interfaces.InterfacePilha;

/**
 * Classe que representa uma pilha implementada em uma lista simplesmente
 * encadeada.
 * 
 * @author Tiego
 *
 * @param <T>  É o tipo de dado usado pelos elementos da pilha.
 */
public class PilhaEncadeada<T> implements InterfacePilha<T> {
	
	/** Objeto que representa uma lista simplemente encadeada. */
	private ListaSimplesmenteEncadeada<T> lista = new ListaSimplesmenteEncadeada<>();
	
	/**
	 * Construtor que inicializa uma lista vazia.
	 */
	public PilhaEncadeada() {

	}
	
	/**
	 * Informa quantos elementos a pilha possui.
	 * 
	 * @return Elementos de uma pilha.
	 */
	@Override
	public int size() {
		return lista.size();
	}
	
	/**
	 * Informa se a pilha está vazia.
	 * 
	 * @return "True" se a pilha estiver vazia e "False" se a pilha não estive
	 *         vazia.
	 */
	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}
	
	/**
	 * Insere um elemento no topo da pilha
	 * 
	 * @param e Elemento que será inserido da pilha.
	 */
	@Override
	public void push(T elemento) {
		lista.addFirst(elemento);
	}

	/**
	 * Informa qual é o elemento no topo da pilha, mas não o retira.
	 * 
	 * @return O elemento que se encontra no topo da pilha.
	 */
	@Override
	public T top() {
		return lista.first();
	}
	
	/**
	 * Retira um elemento da pilha.
	 * 
	 * @return O elemento que foi retirado da pilha.
	 */
	@Override
	public T pop() {
		return lista.removeFirst();
	}
}
