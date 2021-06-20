package co.edu.unbosque.model;

public class EnvioEspaña implements InterfaceEnvio{

	public EnvioEspaña() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String procesarPedido() {
		// TODO Auto-generated method stub
		return "Pedido Procesado España";
	}

	@Override
	public String enviar() {
		// TODO Auto-generated method stub
		return "Pedido enviado a España";
	}

	@Override
	public String entregar() {
		// TODO Auto-generated method stub
		return "Pedido Entregado a España";
	}

}
