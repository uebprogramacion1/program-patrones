package co.edu.unbosque.model;

public class EnvioEspa�a implements InterfaceEnvio{

	public EnvioEspa�a() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String procesarPedido() {
		// TODO Auto-generated method stub
		return "Pedido Procesado Espa�a";
	}

	@Override
	public String enviar() {
		// TODO Auto-generated method stub
		return "Pedido enviado a Espa�a";
	}

	@Override
	public String entregar() {
		// TODO Auto-generated method stub
		return "Pedido Entregado a Espa�a";
	}

}
