package tiegoandrade.github.pilha.interfaces;

/**
 * Interface que possui os tipos abstratos de dados de uma pilha.
 * 
 * @author Tiego
 *
 * @param <T> É o tipo de dado usado pelos elementos da pilha.
 */
public interface InterfacePilha<T> {

	/**
	 * Informa o número de elementos em um pilha.
	 * 
	 * @return O tamanho da pilha
	 */
	public int size();

	/**
	 * Informa se a pilha está vazia.
	 * 
	 * @return "True" se a pilha estiver vazia e "False" se a pilha não estiver
	 *         vazia.
	 */
	public boolean isEmpty();

	/**
	 * Insere um elemento no topo da pilha.
	 * 
	 * @param e Elemento a ser inserido no topo da pilha.
	 */
	public void push(T e);

	/**
	 * Informa qual é o elemento no topo da pilha, mas sem retirá-lo.
	 * 
	 * @return O elemento do topo da pilha.
	 */
	public T top();
	
	/**
	 * Retira um elemento do topo da lista.
	 * 
	 * @return O elemento do topo da lista.
	 */
	public T pop();
}
