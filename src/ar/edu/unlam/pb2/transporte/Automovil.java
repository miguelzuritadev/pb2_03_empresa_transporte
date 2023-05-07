package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;

/**
 * Abarca hasta 3 ciudades. Los destinos no se pueden repetir. • Puede llevar
 * hasta 2m3 de carga y hasta 500kg.
 * 
 * @author mike
 *
 */
public class Automovil extends Transporte {
	private static final Integer MAXIMA_CANTIDAD_DESTINOS = 3;
	private static final Double MAXIMO_PESO = 500.0;
	private static final Double MAXIMO_VOLUMEN = 2.0;
	private ArrayList<String> destinos = new ArrayList<>();

	

	private boolean evaluarRestriccionDeEnvio(Paquete paquete, String destino) {
		return paquete.getVolumen() <= MAXIMO_VOLUMEN && paquete.getPeso() <= MAXIMO_PESO
				&& this.destinos.size() < MAXIMA_CANTIDAD_DESTINOS
				&& !this.destinos.contains(destino);
	}
	
	@Override
	public void enviar(Paquete paquete, String destino) {
		if (evaluarRestriccionDeEnvio(paquete, destino)) {
			this.paquetes.add(paquete);
			this.destinos.add(destino);
		}

	}

	@Override
	public Integer cantidadPaquetes() {
		return paquetes.size();
	}
		
}
