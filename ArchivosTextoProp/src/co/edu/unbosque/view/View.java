package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	/* metodo de prueba que pide un dato por JOptionPane y retorna el String correspondiente
	 * Reemplazar por lo que se necesiten
	 */
	
	public String pedirDato() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese un dato","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	
	/* metodo de prueba que imprime un dato procesado por un m�todo declarado en 
	 * Reemplazar por lo que se necesiten
	 */

	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}

}
