import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, 
// al final muestra por pantalla el valor de cada posición y la suma de todos los valores
// Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar), 
// para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
public class Ejercicio9 {
	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		String texto;
        
		// Pedimos el tamaño del array
		texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[] = new int[Integer.parseInt(texto)];
 
        //Llamamos las funciones
        rellenarNumAleatorioArray(num, 0, 9); 
        mostrarArray(num);
    }
 
	// Funcion para llenar el array con numeros aleatorios
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
    	  //Generamos un número entre los parametros pasados
        for(int i=0; i<lista.length; i++){  
            lista[i] = ((int)Math.floor(Math.random() * (a - b) + b));
        }
    }
 
    // Funcion para mostrar el array
    public static void mostrarArray(int lista[]){
    	// Mostramos la posicion y el numero
        for(int i=0; i<lista.length; i++){
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }
}