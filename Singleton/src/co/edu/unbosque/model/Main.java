package co.edu.unbosque.model;

public class Main {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		System.out.println(Singleton.getSingleton().texto);
		System.out.println(Singleton.getSingleton().numero);
		System.out.println("---despues");
		Singleton.getSingleton().texto = "algo";
		Singleton.getSingleton().numero = 55;
		System.out.println(Singleton.getSingleton().texto);
		System.out.println(Singleton.getSingleton().asignarCadena("OracleXX:"));
	}
	
}
