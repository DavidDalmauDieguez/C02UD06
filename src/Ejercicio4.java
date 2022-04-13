import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo realizara mediante un método al que le pasamos el número como parámetro. 
// Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.
public class Ejercicio4 {
	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
				
		// Creamos las variables
		String texto;
		int num;
		
		// Pedimos el numero
		texto =JOptionPane.showInputDialog("Introduce un numero");
        num=Integer.parseInt(texto);
        
        System.out.println("El factorial de " + num + " es " + factorial(num));
    }
	
	// Funcion para la multiplicacion
	public static int factorial (int num){
		int res = num;
		
		// Coge el numero que hemos escrito i lo cuenta, se repite hasta que llegue a 0
        for(int cont=(num-1); cont>0; cont--){
            //Acumulamos el resultado
            res = res * cont;
        }
        return res;
    }
}