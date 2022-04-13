import java.util.Scanner;

import javax.swing.JOptionPane;

//Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por parámetro para que nos indique si es o no un número primo, 
// debe devolver true si es primo sino false.
// Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables		
		String texto;
		int num;
		
		texto = JOptionPane.showInputDialog("Introduce un numero");
        num=Integer.parseInt(texto);
        
        // Si es numero primo imprimimos
        if (esPrimo(num)){
            System.out.println("El numero "+num+" es primo");
        }else{
            System.out.println("El numero "+num+" no es primo");
        }
    }
	
    public static boolean esPrimo (int num){ 
    	int cont=0;
    	
        // Un numero menor o igual que 1, no es primo.
        if (num <= 1){
            return false;
        } 
        
        // Recorremos para contar
        for (int divisor=(int)Math.sqrt(num);divisor>1;divisor--){
                if (num % divisor == 0){
                cont += 1;
            }
        }
        // Según el numero de divisibles es o no primo"
        if (cont >= 1){
            return false;
        }else{
            return true;
        }
    }
}
