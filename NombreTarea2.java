//¿Cúal de las cadenas de texto es alfabéticamente la primera? ¿En qué posición está? 
//Con los datos del ejemplo la respuesta sería:Anna, en posición 2. Cadena(0).compareTo(cadena(1))
public class Nombre2 {

	public static void main(String[] args) {
				String Nombres[] = {"Sue","Charlotte","Anna","Mike","William","Ed",};//ACEMSW		
				String Guardado = Nombres[0];// Variable para poder comparar.
				int pos = 0 ; // Variable para poder saber luego la posicion.
				
// Bucle para hacer la comparacion
				for (int i=0;i<Nombres.length-1;i++) {
					if (Nombres[i].compareTo(Guardado)<0  ) {
						Guardado = Nombres[i];// Cuando confirma que esta primero alfabeticamente sustituye el que estaba. 
						pos = i ; // Y luego sustituye la posicion
					}
				}	
				//Mensaje fuera del bucle
			System.out.println("La primera alfabeticamente es: " + Guardado + " Y esta en la posicion "+pos);
				
	}

}
