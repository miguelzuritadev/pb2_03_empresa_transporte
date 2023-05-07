package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CamionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void probarQueNoPuedeEnviarPaqueteQueSupereElMaximoPeso() {
		Integer valorEsperado = 2;
		Transporte camion = new Camion();
		Paquete paquete1 = new Paquete(0.5, 0.5, 0.51, 10000.0);
		camion.enviar(paquete1, "San Justo");

		Paquete paquete2 = new Paquete(0.5, 0.5, 0.51, 3000.1);
		camion.enviar(paquete2, "Moron");
		

		Paquete paquete3 = new Paquete(0.5, 0.5, 0.51, 6000.1);
		camion.enviar(paquete3, "Moron");

		assertEquals(valorEsperado, camion.cantidadPaquetes());
	}

	@Test
	public void probarQueNoSePuedeLlevarMasDe20M3DeCarga() {
		Integer valorEsperado = 4;
		Transporte camion = new Camion();
		Paquete paquete1 = new Paquete(0.5, 0.5, 0.51, 1000.0);
		camion.enviar(paquete1, "San Justo");

		Paquete paquete2 = new Paquete(1.0, 1.0, 1.0, 1000.0);
		camion.enviar(paquete2, "Moron");

		Paquete paquete3 = new Paquete(1.0, 1.0, 1.0, 1000.0);
		camion.enviar(paquete3, "Castelar");

		Paquete paquete4 = new Paquete(2.1, 2.1, 2.1, 1000.0);
		camion.enviar(paquete4, "Ciudadela");

		Paquete paquete5 = new Paquete(3.0, 3.0, 3.0, 1000.0);
		camion.enviar(paquete5, "Ramos Mejia");

		assertEquals(valorEsperado, camion.cantidadPaquetes());
	}

}
