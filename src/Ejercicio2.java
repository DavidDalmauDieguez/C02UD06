import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea una aplicacion que nos genere una cantidad de numeros enteros aleatorios que nosotros le pasaremos por teclado. Crea un metodo donde pasamos
// como parametros entre que numeros queremos que los genere, podemos pedirlas por teclado antes de generar los numeros. Este metodo devolvera un entero aleatorio
// Muestra estos nuemros por pantalla
public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
										
		// Creamos las variables		
		String texto;
		int limite;
		int num1, num2;
		
		// Pedimos los parametros
        texto=JOptionPane.showInputDialog("Introduce cantidad de numeros: ");
        limite=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("Introduce el minimo del rango: ");
        num1=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("Introduce el maximo del rango: ");
        num2=Integer.parseInt(texto);
        
        //Generamos los numeros
        for(int i=0;i<limite;i++){
        	System.out.println(generaNumero(num1, num2));
        	}
        }
	
	// Funcion con el caulculo del numero
	public static int generaNumero(int num1, int num2){
		return ((int)Math.floor(Math.random()*(num2-num1)+num1));
		}
	
	}


