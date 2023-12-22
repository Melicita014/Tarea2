//¿Cuál es la cadena con más vocales y en qué posición está?
public class numero11 {

	public static void main(String[] args) {
		String Nombres[]= {"Sueeeee", "Charlotte", "Anna", "Mike", "Willem" , "Ed"};
		
		int vocales = 0; // Cuenta la cantidad de vocales que hay en cada nombre.
		int contador = 0; // Cuenta la cantidad de vocales mas alto que hay enn ese momento.
		String nombreV = ""; // Para saber cual es el nombre con mas vocales.
		
		for (int i = 0; i < Nombres.length; i++) { //Bucle para recorrer cada posicion de la tabla Nombres.
			for (int j = 0; j < Nombres[i].length(); j++) { //Bucle para recorrer cada posicion del Nombre[i].
				if (Nombres[i].charAt(j) == 'A' || Nombres[i].charAt(j) == 'a' ||
					Nombres[i].charAt(j) == 'E' || Nombres[i].charAt(j) == 'e' ||
					Nombres[i].charAt(j) == 'I' || Nombres[i].charAt(j) == 'i' ||
					Nombres[i].charAt(j) == 'O' || Nombres[i].charAt(j) == 'o' ||
					Nombres[i].charAt(j) == 'U' || Nombres[i].charAt(j) == 'u')
					
					vocales++; //Si hay alguna vocal ya sea Mayuscula o minuscula. Se le suma 1 al contador de vocales.
				
			}
			if (vocales > contador ) { // Cuando sea mayor a los vocales que haya, se sustituira.
				contador = vocales;
				nombreV = Nombres[i]; // Este sera el nombre con mas vocales
			}
			vocales = 0; // Se reinicia para que no se junte con los vocales del anterior.
		}
		System.out.println("El nombre con mas vocales es : " + nombreV + " Y tiene " + contador + " vocales en su nombre.");	

	}

}
