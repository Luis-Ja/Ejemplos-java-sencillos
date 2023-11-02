//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

/**
 * @author Luisja
 *
 */

public class ParImpar {
/*	public static void calculaArea() throws IOException{
		final double PI=3.1415;	
		int radio;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un nuevo radio");
		radio=Integer.parseInt(teclado.readLine());
		System.out.println((radio<100)?PI*2*radio:"Radio excesivo");
	}*/
	
	public static void par_impar(int numero)
	{
		System.out.println((numero%2==0)?"PAR":"IMPAR");
	}
	public static void main(String[] args) throws IOException{
	
		System.out.println("Hola Mundo");
		int numero=8;

		par_impar(numero);

	
	}
}
