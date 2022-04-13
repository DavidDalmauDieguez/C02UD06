import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea un arra de 10 posiciones de numeros con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde.
// Haz dos metodos, uno para rellenar valores y otro para mostrar
public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
        int num[] = new int[10];
 
        //Invocamos las funciones
        rellenarArray(num); 
        mostrarArray(num);
    }
 
	// Funciona para llenar el array
    public static void rellenarArray(int lista[]){
    	// Mientras este dentro del rango del array pedimos numero
        for(int i=0; i<lista.length; i++){
            String texto=JOptionPane.showInputDialog("Introduce un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    // Funcion para imprimir la lista
    public static void mostrarArray(int lista[]){
    	// Mientras este dentro del rango del array imprimimos
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }
}