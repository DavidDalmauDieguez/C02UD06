import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados, 
// por último nos indica cual es el mayor de todos.
// Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.
public class Ejercicio10 {
	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		String texto;
		int primoMayor;
		
		// Pedimos los parametros
		texto=JOptionPane.showInputDialog("Introduce un tamaño");
		int num[] = new int[Integer.parseInt(texto)];
		
		// Llamamos las funciones
		rellenarNumPrimosAleatorioArray(num);
		mostrarArray(num);
		primoMayor = mayor(num);
		System.out.println("El numero más grande es el " + primoMayor);
		
	}
	
	// Funcion para saber si es primo
	 private static boolean esPrimo (int num){
		 // Si el numero es menor que 2
		 if (num < 2)
		        return false;
		 	// Mientras que i no supere el maximo
		    for (int i = 2, max = (int)Math.sqrt(num); i <= max; i++)
		    	// Si el resto es igual a 0
		        if (num % i == 0) {
		            return false;
		        }
		    return true;
		    
	    }
	 
	 //Funcion para llenar el array con numeros aleaotrios
    public static void rellenarNumPrimosAleatorioArray(int lista[]){   	   
        int i=0;
        int AUX;
   
        // Mientras i se menor que el rango
        while(i < lista.length){
        	// Creamos numeros aleatorios
            float num =(float) (Math.random()*100);
            AUX = (int) num;
            
            // Si la funcion esPrimo es true
            if (esPrimo(AUX)){
                lista[i]=AUX;
                i++;   
            }   
        }   
    } 
    
    // Funcion para saber que numero es mayor
    public static int mayor(int lista[]){
        int mayor = 0;
        
        // Mientras estemos dentro del rango
        for(int i=0; i<lista.length; i++){
        	// Si el valor del array es mas grande que la variable mayor, cambiamos la variable mayor por el valor del array
            if(lista[i] > mayor){
                mayor = lista[i];
            }
        }
         
        return mayor;
    }
    
    // Funcion para imprimir valores
    public static void mostrarArray (int lista[]) {
    	for (int i = 0; i < lista.length; i++) {
			System.out.println("En el indice " + i + " esta el valor " + lista[i]);
		}
		
    }

}
