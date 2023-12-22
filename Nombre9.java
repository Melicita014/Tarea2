//¿En qué posición está la cadena con más caracteres?
public class Nombre9 {

	public static void main(String[] args) {
		String Nombres[]= {"Sue", "Charlotte", "Anna", "Mike", "William" , "Ed"};
		
		int posicion = 0 ; // Aqui nos dira en que posicion estara el nombre mas largo.
		String masLargo = ""; //Aqui guardara el nombre mas largo.
		
		for (int i = 0; i < Nombres.length; i++) { // Un Bucle que recorrera cada posicion de la tabla Nombres.
			if (Nombres[i].length() > masLargo.length()) { //Si el nombre en la posicion i es MAYOR a el nombre guardado anteriormente. Se sustituye. 
				posicion = i + 1; // Le sumamos uno ya que de normal las cadenas empiezan por 0.
				masLargo = Nombres[i]; // Este sera el nombre mas largo.
			}
		}
		// Mostrara en pantalla la posicion.
		System.out.println("El Nombre mas largo de la cadena esta en la posicion numero : " + posicion);
	}

}
