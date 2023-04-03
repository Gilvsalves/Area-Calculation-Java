package atividade02;

public class Trapezio extends FiguraGeometrica{
	//Atributos
	private double BaseMaior;
	private double BaseMenor;
	private double Altura;
	
	//Construtor
	public Trapezio (double BaseM, double Basem, double altura) {
		this.BaseMaior = BaseM;
		this.BaseMenor = Basem;
		this.Altura = altura;
	}
	
	//Método
	
	@Override
	public double calcularArea() {
		
		return ((BaseMaior+BaseMenor)*Altura)/2;
	}

}
