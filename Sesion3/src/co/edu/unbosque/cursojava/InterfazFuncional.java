package co.edu.unbosque.cursojava;

@FunctionalInterface
public interface InterfazFuncional {

	// Constantes
	int MAX = Integer.MAX_VALUE;
	
	// M�todos default
	default void metodo1() {
	}
	
	// M�todos est�ticos
	static void metodo2() {
	}
	
	void metodo3();
}
