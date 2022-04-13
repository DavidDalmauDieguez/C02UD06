import java.util.Scanner;

import javax.swing.JOptionPane;

// Crea una aplicacion que nos calcule el area de un circulo, cuadrado o triangulo. Pediremos que figura queremos calcular su area y segun lo introducido pedira valores necesarios
public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
								
		// Creamos las variables
		String base;
		String altura;
		String radio;
		String num1Radio;
		String num2Radio;
		int areaCuadrado, areaTriangulo, areaCirculo;	
		
		// Pedimos figura
		String seleccionFigura = JOptionPane.showInputDialog("Introduce un figura: ");
		
		// Si escribimos tal figura calculamos
		if (seleccionFigura.equals("cuadrado")) {
			base = JOptionPane.showInputDialog("Introduce la base: ");
			altura = JOptionPane.showInputDialog("Introduce la altura: ");
			
			
			// Cambiamos el string a integer
			int numBase = Integer.parseInt(base);
			int numAltura = Integer.parseInt(altura);
			areaCuadrado = areaCuadrado(numBase, numAltura);
			
			// Mostramos el resultado
			JOptionPane.showMessageDialog(null, numBase + " * " + numAltura + "= " + areaCuadrado );
		} else if (seleccionFigura.equals("triangulo")) {
			// Pedimos los numeros
			base = JOptionPane.showInputDialog("Introduce la base: ");
			altura = JOptionPane.showInputDialog("Introduce la altura: ");
			
			// Cambiamos el string a integer
			int numBase = Integer.parseInt(base);
			int numAltura = Integer.parseInt(altura);
			areaTriangulo = areaTriangulo(numBase, numAltura);
			
			// Mostramos el rsultado
			JOptionPane.showMessageDialog(null, numBase + " * " + numAltura + " / 2 = " + areaTriangulo );
			
		} else if (seleccionFigura.equals("circulo")) {
			// pedimos los numeros
			radio = JOptionPane.showInputDialog("Introduce un radio: ");
			int numRadio = Integer.parseInt(radio);
			
			areaCirculo = areaCirculo(numRadio);
			
			// Imprimimos el resultado
			JOptionPane.showMessageDialog(null,  "(" + numRadio + "^" + 2 + " * PI= " + areaCirculo);
			
		}
		
	}
	
	// Funcion para calcular la area del cuadrado
	private static int areaCuadrado(int base, int altura) {
		return base * altura;
	}
	
	// Funcion para calcular la area del triangulo
	private static int areaTriangulo(int base, int altura) {
		return base * altura / 2;
	}
	
	// Funcion para calcular la area del triangulo
		private static int areaCirculo(int radio) {		
			int respuesta = (int) (Math.PI * Math.pow(radio, 2));
			
			return respuesta;
		}
}
