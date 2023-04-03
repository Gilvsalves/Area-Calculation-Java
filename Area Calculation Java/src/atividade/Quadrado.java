package atividade02;

public class Quadrado extends FiguraGeometrica {
	//Atributos
    private double lado;
    
    //Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    //Métodos        
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
