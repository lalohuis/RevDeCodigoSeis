import java.util.Scanner;  // Se importa la clase Scanner

public class codigo6 {
	public static void main(String[] args) {  // Faltaba el método main para que el código se ejecute.
	  
	    int[] n = new int[20]; //Se agrega "new" antes de int

	    for (int i = 0; i < 20; i++) { //Se corrige el incremento en i
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");  //Se cambia sistem.print por sistem.out.print
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); //Se agrega la "n" a println
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine()); //Faltaba cerrar un paréntesis antes del ;

	    int multiplo = (opcion == 1) ? 5 : 7; //corrección en el operador

	    for (int e : n) {  //se corrige el "foreach" y se cambia el char por un int
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {   //Faltaba una llabe de cierre antes de else
	        System.out.print(e + " "); // se cambia int por out en la sentencia
	      }
	    }
	  
	}
}
