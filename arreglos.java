package Arreglos;

public class arreglos {
	
	//Escriba un metodo para mostrar los contenidos de un arreglo
	public void printArray(int enteros[], String nombres[]) {
		System.out.println("Arreglo de enteros:");
		for(int i=0;i<enteros.length;i++) 
		{
			System.out.println("Entero "+i);
			System.out.println(enteros[i]);
			
		}
		System.out.println("Arreglo de nombres:");
		for (int i=0;i<nombres.length;i++)
		{
			System.out.println("Nombres "+i);
			System.out.println(nombres[i]);
		}
	}
	//metodo para buscar un valor en el arreglo 
	public void buscarValor(int enteros[], int valor) {
		for (int i=0;i<enteros.length;i++)
		{
			if(enteros[i]==valor)
			{
				System.out.println(enteros[i]);
			}
		}
	}
	
	//metodo para eliminar un valor de un arreglo
	public void eliminarValor(int enteros[], int posicion) {
		for (int i=posicion;i<enteros.length;i++)
		{
			enteros[i]=enteros[i+1];
		}
		for(int i=0;i<enteros.length-1;i++)
		{
			System.out.println(enteros[i]);
		}
	}

}
