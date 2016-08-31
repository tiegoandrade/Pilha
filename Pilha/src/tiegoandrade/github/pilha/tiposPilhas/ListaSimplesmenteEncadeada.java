package tiegoandrade.github.pilha.tiposPilhas;

/**
 * Classe que representa uma lista simplesmente encadeada.
 * 
 * @author Tiego
 *
 * @param <T>
 *            É o tipo de dado usado pelos elementos da lista.
 */
public class ListaSimplesmenteEncadeada<T> {

	/**
	 * Classe aninhada que representa um nó de uma lista.
	 * 
	 * @author Tiego
	 *
	 * @param <T>
	 *            É o tipo de dado usado pelos elementos do nó.
	 */
	private static class No<T> {
		/** Elemento que se encontra dentro do nó. */
		private T elemento;

		/**
		 * Ponteiro que aponta para o próximo nó em uma lista.
		 */
		private No<T> proximo;

		/**
		 * Construtor que cria um nó.
		 * 
		 * @param e
		 *            Elemento que está contido no nó.
		 * @param n
		 *            Aponta para o próximo nó da lista.
		 */
		public No(T e, No<T> n) {
			elemento = e;
			proximo = n;
		}

		/**
		 * Recupera o elemento que está dentro do nó.
		 * 
		 * @return elemento dentro do nó.
		 */
		public T getElemento() {
			return elemento;
		}

		/**
		 * Recupera o próximo nó de um determinado nó.
		 *
		 * @return O próximo nó.
		 */
		public No<T> getProximo() {
			return proximo;
		}

		/**
		 * Define qual será o próximo nó de um determinado nó.
		 * 
		 * @param n
		 *            Nó que será o próximo.
		 */
		public void setProximo(No<T> n) {
			proximo = n;
		}
	}

	/** Representa o primeiro elemento de uma lista. */
	private No<T> cabeca = null;

	/** Representa o último elemento de uma lista. */
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
	 * Informa se a lista está vazia.
	 * 
	 * @return "True" se a lista estiver vazia e "False" se a lista não estiver
	 *         vazia.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Retorna o elemento que se encontra na primeira posição da lista, mas não
	 * o retira.
	 * 
	 * @return O elemento da primeira posição.
	 */
	public T first() {
		if (isEmpty()) {
			return null;
		}

		return cabeca.getElemento();
	}

	/**
	 * Retorna o elemento que se encontra na última posição da lista, mas não o
	 * retira.
	 * 
	 * @return O elemento da última posição.
	 */
	public T last() {
		if (isEmpty()) {
			return null;
		}
		return cauda.getElemento();
	}

	/**
	 * Adiciona um elemento na primeira posição da lista.
	 * 
	 * @param e
	 *            Elemento a ser inseriro.
	 */
	public void addFirst(T e) {

		/*
		 * Criação do nó cabeça junto com o elemento que será armazenado nele.
		 */
		cabeca = new No<>(e, cabeca);

		/*
		 * Se a lista estiver vazia, a cauda será igual ao nó cabeça.
		 */
		if (size == 0) {
			cauda = cabeca;
		}

		/*
		 * Incrementa a lista para a inserção do próximo nó.
		 */
		size++;
	}

	/**
	 * Adiciona um elemento no final da lista.
	 * 
	 * @param e
	 *            Elemento que será adicionado.
	 */
	public void addLast(T e) {

		/*
		 * Criação de um nó que representará o último elemento, ele não é ligado
		 * a um nó proximo, pois é o último nó.
		 */
		No<T> newest = new No<>(e, null);

		/*
		 * Se a lista estiver vazia, a cabeça será, também, a cauda.
		 */
		if (isEmpty()) {
			cabeca = newest;
			/*
			 * Se não, o nó será adicionado depois da cauda e se tornará a nova
			 * cauda.
			 */
		} else {
			cauda.setProximo(newest);
		}

		cauda = newest;

		// Incrementa o número de elementos na lista.
		size++;
	}

	/**
	 * Remove o primeiro nó de uma lista.
	 * 
	 * @return O primeiro elemento da lista.
	 */
	public T removeFirst() {
		if (isEmpty()) {
			return null;
		}

		/* Coloca o elemento que está na cabeça em uma variável auxiliar. */
		T recuperado = cabeca.getElemento();

		/*
		 * O nó cabeça vai ser o próximo elemento do antigo nó cabeça.
		 */
		cabeca = cabeca.getProximo();
		
		/* Atualiza o tamanho da lista */
		size--;
		
		/* Se a lista ficar vazia, a cauda terá que valer null. */
		if (size == 0) {
			cauda = null;
		}
		
		/* Retorna o elemento que foi retirado. */
		return recuperado;
	}
}
