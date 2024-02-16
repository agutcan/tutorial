package ejercicioDiccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniDiccionario {

	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		Map<String, String> palabras = new HashMap<String, String>();
		palabras.put("Hola", "Hello");
		palabras.put("Adios", "Bye");
		palabras.put("Venir", "Come");
		palabras.put("Ir", "Go");
		palabras.put("Amigo", "Friend");
		palabras.put("Casa", "House");
		palabras.put("Avion", "Plane");
		palabras.put("Jugar", "Play");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");
		palabras.put("", "");

		System.out.println("Palabras");
		for (Map.Entry<String, String> palb : palabras.entrySet()) {
			System.out.println("La palabra: " + palb.getKey() + " tiene como traducción: " + palb.getValue());
		}
		
		System.out.println("Introduce una palabra: ");
		String palb = teclado.nextLine();
		
		System.out.println("Palabras: ");
		
			if (palabras.containsKey(palb)) {
				System.out.println("La palabra: " + palb + " tiene como traducción: " + palabras.get(palb));
			}
		
	}

}
