/**
 * @author Luisja
 *
 */
import java.io.IOException;

public class EjemploInstanceOf {
	public static void main(String[] args) throws IOException {
		Object[] numeros = new Object[5]; // (l)

		double mediaEnteros = 0.0; // (2) i
		int totalEnteros = 0;
		double mediaReales = 0.0;
		int totalReales = 0;

		numeros[0] = new Integer(10); // (3) 1
		numeros[1] = new Float(2.4);
		numeros[2] = new Integer(15);
		numeros[3] = new Double(3);
		numeros[4] = new Character('a');
		numeros[1] = 2.0;
		for (int i = 0; i < 5; i++) // 7(4)
		{
			if (numeros[i] instanceof Integer) // (5)
			{
				mediaEnteros += Integer.parseInt(numeros[i].toString());
				totalEnteros++;
			} else if (numeros[i] instanceof Double) // (6)
			{
				mediaReales += Double.parseDouble(numeros[i].toString());
				totalReales++;
			}
		}
		System.out.println("La media de les numeres enteros es: " + mediaEnteros/totalEnteros); // (7)
		System.out.println("La media de les números reales es: " + mediaReales/totalReales); // (8)
	}

}
