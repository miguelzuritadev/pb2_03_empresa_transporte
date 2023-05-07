package ar.edu.unlam.pb2.transporte;

/**
 * Se mueve dentro de la ciudad.
 • Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
 * @author mike
 *
 */
public class Bicicleta extends Transporte{

	private static final Double MAXIMO_PESO = 15.0;
	private static final Double MAXIMO_VOLUMEN = 0.125;
	private static final Integer MAXIMO_CANTIDAD_PAQUETES = 2;
	private String destino;
	
	private boolean evaluarRestriccionDeEnvio(Paquete paquete, String destino) {
		return cantidadPaquetes() < MAXIMO_CANTIDAD_PAQUETES && paquete.getVolumen() <= MAXIMO_VOLUMEN
				&& paquete.getPeso() <= MAXIMO_PESO && this.destino == destino;
	}

	@Override
	public void enviar(Paquete paquete, String destino) {
		if (this.destino == null) {
			this.destino = destino;
		}

		if (evaluarRestriccionDeEnvio(paquete, destino)) {
			this.paquetes.add(paquete);
		}

	}

	@Override
	public Integer cantidadPaquetes() {
		return paquetes.size();
	}

}
