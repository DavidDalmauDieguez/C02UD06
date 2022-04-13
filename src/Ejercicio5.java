import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea una aplicaci�n que nos convierta un n�mero en base decimal a binario. Esto lo realizara un m�todo al que le pasaremos el numero como par�metro, 
// devolver� un String con el numero convertido a binario. Para convertir un numero decimal a binario, debemos dividir entre 2 el numero y 
// el resultado de esa divisi�n se divide entre 2 de nuevo hasta que no se pueda dividir mas, el resto que obtengamos de cada divisi�n formara el numero binario, de abajo a arriba.
public class Ejercicio5 {
	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
						
		// Creamos las variables		
		String texto;
		String binario;
		int num;
		
		// Pedimos el numero
		texto = JOptionPane.showInputDialog("Introduce un numero");
        num = Integer.parseInt(texto);
        
        // Llamamos la funcion e imprimimos
        binario = decimalBinario(num);
        System.out.println("El numero " + num + " en binario es " + binario);
    }
	
	// Escribir numero a binario
	public static String decimalBinario (int num){
		String binario = "";
        String digito;
        
        // Si el resto es 1 el digito es 1 sino 0
        for(int i = num; i > 0; i /= 2){
            if(i % 2 == 1){
                digito = "1";
            } else {
                digito = "0";
            }            
            // Se a�ade el digito al principio
            binario = digito + binario;
            
        }
        return binario;
        
    }
}