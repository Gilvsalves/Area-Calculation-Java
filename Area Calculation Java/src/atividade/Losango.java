package atividade02;

public class Losango extends FiguraGeometrica{
	//Atributos:
	private double diagMaior;
	private double diagMenor;
	
	//Construtor:
	public Losango (double diagonalM, double diagonalm) {
		this.diagMaior = diagonalM;
		this.diagMenor = diagonalm;
	}
	
	//Metodo:
	
	@Override
	public double calcularArea() {
		return (diagMaior*diagMenor)/2;
	}
	
}
