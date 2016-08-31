package tiegoandrade.github.pilha.tiposPilhas;

import tiegoandrade.github.pilha.interfaces.InterfacePilha;

/**
 * Classe que representa uma pilha implementada em um array.
 * 
 * @author Tiego
 *
 * @param <T> É o tipo de dado usado pelos elementos da pilha.
 */
public class PilhaArray<T> implements InterfacePilha<T> {

	/** Representa a capacidade padrão de uma pilha. */
	public static final int CAPACIDADE = 1000;

	/** Array que irá armazenar os elementos da pilha. */
	private T[] array;

	/** Representa o elemento que se encontra no topo da pilha. */
	private int topo = -1;

	/** Construtor que cria um pilha com capacidade para 1000 elementos */
	public PilhaArray() {
		this(CAPACIDADE);
	}

	/**
	 * Construtor que cria uma pilha com uma capacidade especificada pelo
	 * usuário
	 * 
	 * @param capacidade Quantidade de elementos que uma pilha terá.
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
	 * Informa se a pilha está vazia.
	 * 
	 * @return "True" se a pilha estiver vazia e "False" se a pilha não estive
	 *         vazia.
	 */
	@Override
	public boolean isEmpty() {
		return (topo == -1);
	}

	/**
	 * Insere um elemento no topo da pilha
	 * 
	 * @param e Elemento que será inserido da pilha.
	 * @throws IllegalStateException Lançada caso a pilha esteja cheia.
	 */
	@Override
	public void push(T e) throws IllegalStateException {

		/*
		 * Se o número de elementos da pilha é igual ao tamanho do array que ela
		 * se encontra, então a pilha estará cheia.
		 */
		if (size() == array.length) {
			throw new IllegalStateException("A pilha está cheia");
		}

		/*
		 * O atributo topo vai para a próxima posição do array e é inserido o
		 * elemento na posição que se encontra o topo.
		 */
		array[++topo] = e;
	}

	/**
	 * Informa qual é o elemento no topo da pilha, mas não o retira.
	 * 
	 * @return O elemento que se encontra no topo da pilha.
	 */
	@Override
	public T top() {

		// Se não tiver nem um elemento na pilha, é retornado o valor null.
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

		// Se o pilha não tiver nenhum elemento, retorna null.
		if (isEmpty()) {
			return null;
		}

		// Coloca o valor que está no topo em uma variável temporária.
		T retirado = array[topo];

		// Atribui ao valor que está no topo o valor null.
		array[topo] = null;

		/* 
		 * Decrementa o valor de topo para que a posição anterior do array seja
		 * o topo da pilha.
		 */
		topo--;
		
		// Retorna o valor removido da pilha.
		return retirado;
	}
}
