import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dolares, yenes o libras. 
// El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor, mostrara un mensaje indicando el cambio (void).
// El cambio de divisas son:
// 0.86 libras es un 1 €
// 1.28611 $ es un 1 €
// 129.852 yenes es un 1 €
public class Ejercicio7 {
	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
										
		// Creamos las variables
		String texto;
		double cantidad;
		String moneda;
		
		// Pedimos los valores
		texto=JOptionPane.showInputDialog("Escribe una cantidad en euros");
        cantidad=Double.parseDouble(texto);
        moneda=JOptionPane.showInputDialog("Escribe la moneda a la que quieres convertir");
        
        // Llamamos la funcion
        conversor(cantidad, moneda);
    }
	
	// Funcion apra cambiar de moneda
	public static void conversor (double cantidad, String moneda){
		double res = 0;
        boolean correcto = true;
 
        //Segun la moneda, calculamos la cantidad
        switch (moneda){
        case "libras":
        	res=cantidad * 0.86;
        	break;
        case "dolares":
            res=cantidad * 1.29;
            break;
        case "yenes":
            res=cantidad * 129.852;
            break;
        default:
        	// Sila moneda no corresponde es falso
            System.out.println("No has introducido una moneda correcta");
            correcto=false;
        }
 
        //Si la moneda corresponde es true
        if (correcto){
            System.out.println(cantidad + " euros en " + moneda + " son " +res);
        }
 
    }
}