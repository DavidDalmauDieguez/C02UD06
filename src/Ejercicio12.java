import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea un array de numeros de un tamaño pasado por teclado, el array contendra numeros aleatorios entre 1 y 300 y mostrara aquellos numeros
// que acaben en un digito que estos deben guardarse en un nuevo array
// Por ejemplo, en un array de 10 posiciones le indicamos mostrar los numeros acabados en 5, podria salir 155, 25,etc.
public class Ejercicio12 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos las variables
		String texto;
		int finalNum;

		// Pedimos los parametros
		texto=JOptionPane.showInputDialog("Introduce un tamaño");
		int tamanyo = Integer.parseInt(texto);

		// Mientras no nos den un numero entre 0 y 9 se repite
		do{
			texto=JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
			finalNum=Integer.parseInt(texto);
		} while(!(finalNum>=0 && finalNum<=9));



		// Creamos los arrays
		int array1[]= new int [tamanyo];
		int array2[]= new int [tamanyo];

		// Rellenamos array
		rellenarNumAleatorioArray(array1);
		// Mostramos array
		mostrarArray(finalNumArray(array1, finalNum));

	}

	// Funcion para llenar el array con numeros aleatorios
	public static void rellenarNumAleatorioArray(int lista[]){
		float AUX;

		// Mientras estemos en el rango
		for (int i = 0; i < lista.length; i++) {
			AUX = (float) (Math.random()*300);			
			lista[i] =(int) AUX;
		}
	}

	// Funcion para leer el ultimo numero
	public static int[] finalNumArray (int array1[], int finalNum) {
		// Creamos un array nuevo para guardar el antiguo
		int AUXfinalNum[] = new int[array1.length];
		int AUXNum;

		// Recorremos el array
		for (int i = 0; i < AUXfinalNum.length; i++) {
			AUXNum = array1[i] % 10;

			// Si el valor de AUXNum es igual al dado anteriormente
			if (AUXNum == finalNum) {
				AUXfinalNum[i] = array1[i];
			}
		}
		return AUXfinalNum;

	}

	// Funcion para imprimir valores
	public static void mostrarArray (int lista[]) {
		// Recorremos el array
		for (int i = 0; i < lista.length; i++) {
			// Si el resto del valor es 5
			if(lista[i] % 10 == 5) {
				System.out.println("En el indice " + i + " esta el valor " + lista[i]);
			}
		}

	}
}