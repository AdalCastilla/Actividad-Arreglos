package Actividad6;

public class Queue {
char queue[];
int MAX=queue.length;
int tail=0;
	//quitar un valor y recorrer 
	public char delete() {
		if(tail==0) {
			System.out.println("Queue is empty");
			return('#');
		}else {
			char item = queue[0];
			for (int i=0;i<tail-1;i++) {
				queue[i]=queue[i+1];
			}
			tail--;
			return(item);
			
		}
	}
	//insertar
	public void insert(char data) {
		if(tail == MAX) { 
			System.out.println("Queue is full"); 
		}else { 
		queue[tail] = data;
		tail++; 
		} 

	}
	
}
