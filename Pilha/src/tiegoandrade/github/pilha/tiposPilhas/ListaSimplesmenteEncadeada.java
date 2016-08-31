package tiegoandrade.github.pilha.tiposPilhas;

/**
 * Classe que representa uma lista simplesmente encadeada.
 * 
 * @author Tiego
 *
 * @param <T>
 *            � o tipo de dado usado pelos elementos da lista.
 */
public class ListaSimplesmenteEncadeada<T> {

	/**
	 * Classe aninhada que representa um n� de uma lista.
	 * 
	 * @author Tiego
	 *
	 * @param <T>
	 *            � o tipo de dado usado pelos elementos do n�.
	 */
	private static class No<T> {
		/** Elemento que se encontra dentro do n�. */
		private T elemento;

		/**
		 * Ponteiro que aponta para o pr�ximo n� em uma lista.
		 */
		private No<T> proximo;

		/**
		 * Construtor que cria um n�.
		 * 
		 * @param e
		 *            Elemento que est� contido no n�.
		 * @param n
		 *            Aponta para o pr�ximo n� da lista.
		 */
		public No(T e, No<T> n) {
			elemento = e;
			proximo = n;
		}

		/**
		 * Recupera o elemento que est� dentro do n�.
		 * 
		 * @return elemento dentro do n�.
		 */
		public T getElemento() {
			return elemento;
		}

		/**
		 * Recupera o pr�ximo n� de um determinado n�.
		 *
		 * @return O pr�ximo n�.
		 */
		public No<T> getProximo() {
			return proximo;
		}

		/**
		 * Define qual ser� o pr�ximo n� de um determinado n�.
		 * 
		 * @param n
		 *            N� que ser� o pr�ximo.
		 */
		public void setProximo(No<T> n) {
			proximo = n;
		}
	}

	/** Representa o primeiro elemento de uma lista. */
	private No<T> cabeca = null;

	/** Representa o �ltimo elemento de uma lista. */
	private No<T> cauda = null;

	/** Representa o tamanho da lista. */
	private int size = 0;

	/**
	 * Construtor que cria uma lista encadeada simples vazia.
	 */
	public ListaSimplesmenteEncadeada() {

	}

	/**
	 * Informa quantos elementos a lista possui.
	 * 
	 * @return Quantidade de elementos da lista.
	 */
	public int size() {
		return size;
	}

	/**
	 * Informa se a lista est� vazia.
	 * 
	 * @return "True" se a lista estiver vazia e "False" se a lista n�o estiver
	 *         vazia.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Retorna o elemento que se encontra na primeira posi��o da lista, mas n�o
	 * o retira.
	 * 
	 * @return O elemento da primeira posi��o.
	 */
	public T first() {
		if (isEmpty()) {
			return null;
		}

		return cabeca.getElemento();
	}

	/**
	 * Retorna o elemento que se encontra na �ltima posi��o da lista, mas n�o o
	 * retira.
	 * 
	 * @return O elemento da �ltima posi��o.
	 */
	public T last() {
		if (isEmpty()) {
			return null;
		}
		return cauda.getElemento();
	}

	/**
	 * Adiciona um elemento na primeira posi��o da lista.
	 * 
	 * @param e
	 *            Elemento a ser inseriro.
	 */
	public void addFirst(T e) {

		/*
		 * Cria��o do n� cabe�a junto com o elemento que ser� armazenado nele.
		 */
		cabeca = new No<>(e, cabeca);

		/*
		 * Se a lista estiver vazia, a cauda ser� igual ao n� cabe�a.
		 */
		if (size == 0) {
			cauda = cabeca;
		}

		/*
		 * Incrementa a lista para a inser��o do pr�ximo n�.
		 */
		size++;
	}

	/**
	 * Adiciona um elemento no final da lista.
	 * 
	 * @param e
	 *            Elemento que ser� adicionado.
	 */
	public void addLast(T e) {

		/*
		 * Cria��o de um n� que representar� o �ltimo elemento, ele n�o � ligado
		 * a um n� proximo, pois � o �ltimo n�.
		 */
		No<T> newest = new No<>(e, null);

		/*
		 * Se a lista estiver vazia, a cabe�a ser�, tamb�m, a cauda.
		 */
		if (isEmpty()) {
			cabeca = newest;
			/*
			 * Se n�o, o n� ser� adicionado depois da cauda e se tornar� a nova
			 * cauda.
			 */
		} else {
			cauda.setProximo(newest);
		}

		cauda = newest;

		// Incrementa o n�mero de elementos na lista.
		size++;
	}

	/**
	 * Remove o primeiro n� de uma lista.
	 * 
	 * @return O primeiro elemento da lista.
	 */
	public T removeFirst() {
		if (isEmpty()) {
			return null;
		}

		/* Coloca o elemento que est� na cabe�a em uma vari�vel auxiliar. */
		T recuperado = cabeca.getElemento();

		/*
		 * O n� cabe�a vai ser o pr�ximo elemento do antigo n� cabe�a.
		 */
		cabeca = cabeca.getProximo();
		
		/* Atualiza o tamanho da lista */
		size--;
		
		/* Se a lista ficar vazia, a cauda ter� que valer null. */
		if (size == 0) {
			cauda = null;
		}
		
		/* Retorna o elemento que foi retirado. */
		return recuperado;
	}
}
