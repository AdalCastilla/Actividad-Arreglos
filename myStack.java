package Actividad6;


public class myStack {

	
	char stack[];
	int top=0;

	
	
	
	//POP
	public char pop() { 
		if(top == 0) 
	{
	System.out.println("Stack is empty"); 
	return ('#'); 
	}
	else { 
	top-- ; 
	char item=stack[top];
	return (item );  
	} 
	}
	
	//push
	public void push(char data) {
		int MAX=stack.length;
		if(top==MAX) {
			System.out.println("Stack is full");
			
		}else {
			stack[top]=data;
			top++;
		}
	}
	public static boolean essPalindromo(String cadena) {
		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		String invertida = new StringBuilder(cadena).reverse().toString();
		return invertida.equals(cadena);
	}

	//invertir cadena
		public char[] invertir(char[]Arreglo) {
			this.stack= Arreglo;
			for(int i=0;i<Arreglo.length-1;i++) {
				push(Arreglo[i]);
			}
			char[] invertir = new char[Arreglo.length];
			for(int i=Arreglo.length-1;i>=0;i--) {
				invertir[i]=pop();
			}
			return invertir;
		}
		//Si es palindromo
		public boolean esPalindromo(String palabra) {
		char[] Arreglo = palabra.toCharArray();
		for (int i=0; i<Arreglo.length;i++) {
			push(Arreglo[i]);
		}
		for (int i=0;i<Arreglo.length/2;i++) {
			char item=pop();
			if(Arreglo[i]!=item) {
				return false;
			}
		}
		return true;
		}
				
		public static String invertir(String cadena) {
	        String cadenaInvertida = "";
	        for (int x = cadena.length() - 1; x >= 0; x--)
	            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
	        return cadenaInvertida;
	    }
		
}
