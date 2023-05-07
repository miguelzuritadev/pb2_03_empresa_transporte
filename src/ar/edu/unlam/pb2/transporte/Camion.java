package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;

public class Camion {

	private static final Double MAXIMO_PESO = 16000.0;
	private static final Double MAXIMO_VOLUMEN = 20.0;
	private ArrayList<Paquete> paquetes = new ArrayList<>();
	private ArrayList<String> destinos = new ArrayList<>();

	public void enviar(Paquete paquete, String destino) {

		if (evaluarRestriccionDeEnvio(paquete, destino)) {
			this.paquetes.add(paquete);
			this.destinos.add(destino);
		}

	}

	private boolean evaluarRestriccionDeEnvio(Paquete paquete, String destino) {
		return getVolumenActual(paquete) <= MAXIMO_VOLUMEN && getCargaActual(paquete) <= MAXIMO_PESO;
	}

	private Double getCargaActual(Paquete paquete) {
		Double cargaActual = 0.0;
		for (Paquete item : paquetes) {
			cargaActual = cargaActual + item.getPeso();
		}

		return cargaActual + paquete.getPeso();
	}

	private Double getVolumenActual(Paquete paquete) {
		Double volumenActual = 0.0;
		for (Paquete item : paquetes) {
			volumenActual = volumenActual + item.getVolumen();
		}

		return volumenActual + paquete.getVolumen();
	}

	public Integer cantidadPaquetes() {
		return paquetes.size();
	}

}
