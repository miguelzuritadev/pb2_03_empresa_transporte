package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AutomovilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void probarQueNoSePuedaEnviarUnPaqueteQueSuperaElPesoMaximo() {
		Integer valorEsperado = 0;
		Automovil automovil = new Automovil();
		Paquete paquete = new Paquete(0.5, 0.5, 0.51, 500.1);
		automovil.enviar(paquete, "San Justo");

		assertEquals(valorEsperado, automovil.cantidadPaquetes());
	}

	@Test
	public void probarQueNoSePuedaEnviarUnPaqueteQueSuperaElVolumenMaximo() {
		Integer valorEsperado = 0;
		Automovil automovil = new Automovil();
		Paquete paquete = new Paquete(1.3, 1.3, 1.3, 50.0);
		automovil.enviar(paquete, "San Justo");

		assertEquals(valorEsperado, automovil.cantidadPaquetes());
	}

	@Test
	public void probarQueSePuedaEnviarHasta3Ciudades() {
		Integer valorEsperado = 3;
		Automovil automovil = new Automovil();
		Paquete paquete1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		automovil.enviar(paquete1, "San Justo");
		
		Paquete paquete2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		automovil.enviar(paquete2, "Moron");
		
		Paquete paquete3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		automovil.enviar(paquete3, "Ramos Mejia");
		
		Paquete paquete4 = new Paquete(0.1, 0.1, 0.1, 1.0);
		automovil.enviar(paquete4, "Castelar");

		assertEquals(valorEsperado, automovil.cantidadPaquetes());
	}
	
	@Test
	public void probarQueLosDestinosNoSePuedanRepetir() {
		Integer valorEsperado = 2;
		Automovil automovil = new Automovil();
		Paquete paquete1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		automovil.enviar(paquete1, "San Justo");
		
		Paquete paquete2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		automovil.enviar(paquete2, "Moron");
		
		Paquete paquete3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		automovil.enviar(paquete3, "Moron");

		assertEquals(valorEsperado, automovil.cantidadPaquetes());
	}

}
