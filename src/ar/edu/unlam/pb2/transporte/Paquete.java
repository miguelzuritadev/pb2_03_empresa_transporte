package ar.edu.unlam.pb2.transporte;

public class Paquete {
	private Double alto;
	private Double ancho;
	private Double profundo;
	private Double peso;
		
	
	public Paquete(Double alto, Double ancho, Double profundo, Double peso) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
		this.peso = peso;
	}


	public Double getVolumen() {
		return alto * ancho * profundo;
	}


	public Double getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}

}
