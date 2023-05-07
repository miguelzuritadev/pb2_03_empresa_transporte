package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;

public abstract class Transporte {

	protected ArrayList<Paquete> paquetes = new ArrayList<>();

	public Transporte() {
		super();
	}

	public abstract Integer cantidadPaquetes();

	public abstract void enviar(Paquete paquete, String destino);

}