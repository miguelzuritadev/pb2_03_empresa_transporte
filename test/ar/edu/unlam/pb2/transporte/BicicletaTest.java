package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void probarQueNoPuedeEnviarMasDe2Paquetes() {
		Integer valorEsperado = 2;
		Transporte bicicleta = new Bicicleta();
		Paquete paquete1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		bicicleta.enviar(paquete1, "San Justo");
		
		Paquete paquete2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		bicicleta.enviar(paquete2, "San Justo");
		
		Paquete paquete3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		bicicleta.enviar(paquete3, "Ramos Mejia");
		
		assertEquals(valorEsperado, bicicleta.cantidadPaquetes());
		
	}
	

	@Test
	public void probarQueLaBicicletaSoloMueveEnUnaCiudad() {
		Integer valorEsperado = 1;
		Transporte bicicleta = new Bicicleta();
		Paquete paquete1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		bicicleta.enviar(paquete1, "San Justo");
		
		Paquete paquete2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		bicicleta.enviar(paquete2, "Moron");
		
		Paquete paquete3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		bicicleta.enviar(paquete3, "Ramos Mejia");
		
		assertEquals(valorEsperado, bicicleta.cantidadPaquetes());
		
	}

	@Test
	public void probarQueNoSePuedaEnviarUnPaqueteQueSuperaElPesoMaximo() {
		Integer valorEsperado = 0;
		Transporte bicicleta = new Bicicleta();
		Paquete paquete = new Paquete(0.5, 0.5, 0.51, 1.0);
		bicicleta.enviar(paquete, "San Justo");
			
		
		assertEquals(valorEsperado, bicicleta.cantidadPaquetes());
	}
	
	@Test
	public void probarQueNoSePuedaEnviarUnPaqueteQueSuperaElVolumenMaximo() {
		Integer valorEsperado = 0;
		Transporte bicicleta = new Bicicleta();
		Paquete paquete = new Paquete(0.5, 0.5, 0.5, 15.1);
		bicicleta.enviar(paquete, "San Justo");
			
		
		assertEquals(valorEsperado, bicicleta.cantidadPaquetes());
		
	}
	

}
