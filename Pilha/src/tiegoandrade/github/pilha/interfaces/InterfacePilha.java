package tiegoandrade.github.pilha.interfaces;

/**
 * Interface que possui os tipos abstratos de dados de uma pilha.
 * 
 * @author Tiego
 *
 * @param <T> � o tipo de dado usado pelos elementos da pilha.
 */
public interface InterfacePilha<T> {

	/**
	 * Informa o n�mero de elementos em um pilha.
	 * 
	 * @return O tamanho da pilha
	 */
	public int size();

	/**
	 * Informa se a pilha est� vazia.
	 * 
	 * @return "True" se a pilha estiver vazia e "False" se a pilha n�o estiver
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
	 * Informa qual � o elemento no topo da pilha, mas sem retir�-lo.
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
