package Arreglos;

public class main {

	public static void main(String[] args) {
		// Declarar arreglo de 15 enteros
		int[] enteros = new int[15];
		
		//Declarar un arreglo que guarde 20 nombres 
		String[] nombres = new String [20];
		
		//Declarar un arreglo de 100 objetos de la clase estudiante
		Circulos[] objetos = new Circulos[100];
		Circulos circulo = new Circulos();
		objetos[0]= circulo;
		
		//Asignar el valor de 5 a la décima posición del arreglo enteros
		enteros[9]=5;
		
		//Inserta Francisco en la primera poscion del arreglo nombres
		nombres[0]="Francisco";

	}
}
