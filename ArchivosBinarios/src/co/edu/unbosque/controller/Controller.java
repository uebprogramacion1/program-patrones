package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	//Atributos que vienen del Modelo (mundo) 
	private Binarios bd;
	
	//Atributos que vienen de Vista - GUI
	private View gui;
	
	public Controller() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Binarios();
		//se Modifica contructor de InterfazGUI para que reciba como par�metro la instancia de Controlador
		gui = new View(this);
		gui.setVisible(true); //hacer visible la ventana principal
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;
		if (evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR)) {
			resultado = bd.getBf().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER)) {
			bd.getBf().leerArchivoBinario();
			gui.mostrarCifras(
					bd.getBf().getREGISTROS(), 
					bd.getBf().getNumeros(), 
					bd.getBf().getValores());
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			gui.escribirMensaje(bd.getBf().escribirRegistro());
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			bd.getBf().leerRegistro();
			gui.mostrarRegistros(3, 
					bd.getBf().getDatos());
		}
	}
}