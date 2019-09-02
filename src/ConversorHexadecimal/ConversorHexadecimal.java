import java.util.Scanner;

public class ConversorHexadecimal
{
	public static convertirAHexadecimal(String numeroHexadecimal)
	{
		numeroHexadecimal = 
	} // Fin del método convertirAHexadecimal
	
	public static calcularHexadecimal ()
	{
		int division = numero/16; int residuo;
		int residuo = numero%16; char digito;
		while(division => 16){
			division = division/16
			int residuo = division%16
			if(residuo == 15)
				digito = 'F';
			else if(residuo == 14)
				digito = 'E';
			else if(residuo == 13)
				digito = 'D';
			else if(residuo == 12)
				digito = 'C';
			else if(residuo == 11)
				digito = 'B';
			else if(residuo == 10)
				digito = 'A';
			else if(residuo >= 16)
				digito = 'Error';
			else digito = '0';
			
		}
	} // Fin del método calcularHexadecimal
	
		public static void main(String[] Args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite el número que desea convertir en hexadecimal");
		int numero = reader.nextInt();
		int resultado = convertirAHexadecimal(String numeroHexadecimal);
		System.out.print("El resultado es: " + resultado);
	} //Fin del método main
	
} // Fin de la clase ConversorHexadecimal