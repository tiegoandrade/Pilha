package tiegoandrade.github.pilha.tiposPilhas;

import tiegoandrade.github.pilha.interfaces.InterfacePilha;

/**
 * Classe que representa uma pilha implementada em um array.
 * 
 * @author Tiego
 *
 * @param <T> � o tipo de dado usado pelos elementos da pilha.
 */
public class PilhaArray<T> implements InterfacePilha<T> {

	/** Representa a capacidade padr�o de uma pilha. */
	public static final int CAPACIDADE = 1000;

	/** Array que ir� armazenar os elementos da pilha. */
	private T[] array;

	/** Representa o elemento que se encontra no topo da pilha. */
	private int topo = -1;

	/** Construtor que cria um pilha com capacidade para 1000 elementos */
	public PilhaArray() {
		this(CAPACIDADE);
	}

	/**
	 * Construtor que cria uma pilha com uma capacidade especificada pelo
	 * usu�rio
	 * 
	 * @param capacidade Quantidade de elementos que uma pilha ter�.
	 */
	@SuppressWarnings("unchecked")
	public PilhaArray(int capacidade) {
		array = (T[]) new Object[capacidade];
	}

	/**
	 * Informa quantos elementos a pilha possui.
	 * 
	 * @return Elementos de uma pilha.
	 */
	@Override
	public int size() {
		return (topo + 1);
	}

	/**
	 * Informa se a pilha est� vazia.
	 * 
	 * @return "True" se a pilha estiver vazia e "False" se a pilha n�o estive
	 *         vazia.
	 */
	@Override
	public boolean isEmpty() {
		return (topo == -1);
	}

	/**
	 * Insere um elemento no topo da pilha
	 * 
	 * @param e Elemento que ser� inserido da pilha.
	 * @throws IllegalStateException Lan�ada caso a pilha esteja cheia.
	 */
	@Override
	public void push(T e) throws IllegalStateException {

		/*
		 * Se o n�mero de elementos da pilha � igual ao tamanho do array que ela
		 * se encontra, ent�o a pilha estar� cheia.
		 */
		if (size() == array.length) {
			throw new IllegalStateException("A pilha est� cheia");
		}

		/*
		 * O atributo topo vai para a pr�xima posi��o do array e � inserido o
		 * elemento na posi��o que se encontra o topo.
		 */
		array[++topo] = e;
	}

	/**
	 * Informa qual � o elemento no topo da pilha, mas n�o o retira.
	 * 
	 * @return O elemento que se encontra no topo da pilha.
	 */
	@Override
	public T top() {

		// Se n�o tiver nem um elemento na pilha, � retornado o valor null.
		if (isEmpty()) {
			return null;
		}

		return array[topo];
	}

	/**
	 * Retira um elemento da pilha.
	 * 
	 * @return O elemento que foi retirado da pilha.
	 */
	@Override
	public T pop() {

		// Se o pilha n�o tiver nenhum elemento, retorna null.
		if (isEmpty()) {
			return null;
		}

		// Coloca o valor que est� no topo em uma vari�vel tempor�ria.
		T retirado = array[topo];

		// Atribui ao valor que est� no topo o valor null.
		array[topo] = null;

		/* 
		 * Decrementa o valor de topo para que a posi��o anterior do array seja
		 * o topo da pilha.
		 */
		topo--;
		
		// Retorna o valor removido da pilha.
		return retirado;
	}
}
