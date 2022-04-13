import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo (hay que controlarlo) pedido por teclado. 
// Crea un m�todo que realice esta acci�n, pasando el n�mero por par�metro, devolver� el n�mero de cifras.
public class Ejercicio6 {
	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
								
		// Creamos las variables
		String texto;
		int numero = 0;
		int numCifras;
		
		// Mientras el numero sea menor a 0
		do{
			texto = JOptionPane.showInputDialog("Introduce un numero positivo");
			numero = Integer.parseInt(texto);
			} while(numero < 0);
		
		// Llamamos la funcion
		numCifras=cuentaCifras(numero);
		
		//Controlamos en el caso de que haya una cifra o mas
		if (numCifras == 1){
			System.out.println("El numero " + numero + " tiene " + numCifras + " cifra");
			} else {
				System.out.println("El numero " + numero + " tiene " + numCifras + " cifras");
				
			}
	}
	
	// Funcion para contar numeros
	public static int cuentaCifras (int num){
		int contador=0;
		
		// Mientras el numero menos de 0
		for (int i = num; i > 0; i /= 10){
			//Incrementamos el contador
			contador++;
			}
		return contador;
		
		}
	}