import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea dos arrays de numeros con la dimension pasada por teclado Uno de ellos estara rellenado con numeros aleatorios y el otro apuntara al array anterior,
// reasigna los valores del segundo array con valores aleatorios.
// Despues, crea un metodo que tenga como parametros, los dos arrays y devuelva uno nuevo con la multiplicacion de la posicion 0 del array1 col el array2 y asi sucesivamente
public class Ejercicio11 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		String texto;
		
		// Pedimos los parametros
		texto=JOptionPane.showInputDialog("Introduce un tamaño");
		int tamanyo = Integer.parseInt(texto);
		
		// Creamos los arrays
		int array1[]=new int [tamanyo];
		int array2[]=new int [tamanyo];
		int array3[]=new int [tamanyo];
		
		// LLamamos para llenar el array
		rellenarNumAleatorioArray(array1);
		rellenarNumAleatorioArray(array2);
		rellenarNumAleatorioArray(array3);
		
		// Mostramos los arrays
		System.out.println("Valores array 1: ");
		mostrarArray(array1);
		System.out.println("Valores array 2: ");
		mostrarArray(array2);
		System.out.println("Valores array 3: ");
		mostrarArray(array3);

	}
	
	// Funcion para llenar el array con numeros aleatorios
	public static void rellenarNumAleatorioArray(int lista[]){
		float AUX;
		
		// Mientras estemos en el rango
		for (int i = 0; i < lista.length; i++) {
			 AUX = (float) (Math.random()*100);
			
			 lista[i] =(int) AUX;
		}
	}
	
	// Funcion para multiplicar los arrays
	public static int[] multiplicacion(int array1[], int array2[]) {
		int array3[] = new int [array1.length];
		
		// Mientras estemos dentro de lrang odel array1
		for (int i = 0; i < array1.length; i++) {
			// Multiplicamos los valores del array1 con los del 2
			array3[i] = array1[i] * array2[i];
		}
		return array3;
	}
	
	// Funcion para imprimir valores
    public static void mostrarArray (int lista[]) {
    	for (int i = 0; i < lista.length; i++) {
			System.out.println("En el indice " + i + " esta el valor " + lista[i]);
		}
		
    }

}
