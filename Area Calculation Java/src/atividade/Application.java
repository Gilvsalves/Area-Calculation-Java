package atividade02;

public class Application {
    public static void main(String[] Args){
    	//Instanciação do objeto
        Circulo circulo01 = new Circulo(2);
        //Chamada do método
        System.out.println("Area do circulo: "+circulo01.calcularArea());

        Quadrado quadrado = new Quadrado(4);
        System.out.println("Area do quadrado: "+quadrado.calcularArea());
        
        Retangulo retangulo = new Retangulo(2,6);
        System.out.println("Area do retangulo: "+retangulo.calcularArea());
        
        Triangulo triangulo = new Triangulo(3,5);
        System.out.println("Area do Triangulo: "+triangulo.calcularArea());
        
        Losango losango = new Losango(10,5);
        System.out.println("Area do Losango: "+ losango.calcularArea());
        
        Trapezio trapezio = new Trapezio(10,2,5);
        System.out.println("Area do Trapezio: "+ trapezio.calcularArea());
    }
}
