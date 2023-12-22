//¿Hay cadenas repetidas? (Lo he entendido como si dentro detro de las cadenas hay nombres repetidos)
public class Nombres10 {

	public static void main(String[] args) {
	
		String Nombres[]= {"Sue", "Charlotte", "Anna", "Mike", "Anna", "William" , "Ed"};
		
		boolean igual = false; // Para que tenga un valor al principio.
		
		for (int i = 0; i < Nombres.length; i++) {//Bucle para recorrer cada posicion de la tabla Nombres.
			for (int j = 0; j < Nombres.length; j++) {//Otro bucle para recorrer cada posicion de la tabla Nombres. ( Luego con i!=j evitaremos que cuente el propio  nombre).
				if (Nombres[i] == Nombres[j] && i != j) { // Compara un nombre con los demas segun va avanzando el contador de j.
					igual = true;
				}
			}
		}
		if (igual == true) {
			System.out.println("Si hay cadenas repetidas"); //Muestra en pantalla que SI hay nombres iguales.
		}
		else {
			System.out.println("No hay cadenas repetidas"); // En caso contrario pone en pantalla el mensaje de que NO.
		}

	}

}
