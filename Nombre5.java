//Mostrar en pantalla todas las cadenas convertidas a letras mayúsculas.
public class Nombre5 {

	public static void main(String[] args) {
		
		String Nombres[] = {"Sue","Charlotte","Anna","Mike","William","Ed",};
		
		for (int i = 0; i < Nombres.length; i++) {
		    Nombres[i] = Nombres[i].toUpperCase(); // Usamos toUpperCase para que se vuelvan mayusculas
		}
		
		
		//Mostrar la tabla en pantalla
				for (int i = 0; i <= Nombres.length -1 ; i++)
					System.out.println(Nombres[i] );

	}

}



		
		
		