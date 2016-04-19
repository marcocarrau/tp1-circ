package ar.unlam.circulo;

public class Circulo {
	
	private Double radio;
	private Double area;
	private Double perimetro;
	
	public Circulo (Double radio) {
		this.radio = radio;
		 
	}
	
	public Double obtenerRadio() {
		return this.radio;
	}
	
	
	public Double calcularArea () {
		return Math.PI * this.radio * this.radio;
	}
	
	
	public Double calcularPerimetro () {
		return Math.PI * 2 * this.radio;
		
		
	}

}
