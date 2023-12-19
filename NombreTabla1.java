
//Crea un array de enteros del mismo tamaño del array de cadenas de texto
//y guarda, en cada posición, la longitud de caracteres de cadena en la misma posición.

public class NombreTabla1 {

	public static void main(String[] args) {
		String Nombres[] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
		int[] Tabla = new int[Nombres.length];

		// Guardar el array cantidad de letras en el nombre
		
		for (int i = 0 ; i < Nombres.length ; i++)
			Tabla[i]= Nombres[i].length() ;
	
/*//Otra opcion para hacerlo pero incecesario hacer con dos bucles 
	
	for (int i = 0 ; i < Nombres.length ; i++)
		for (int j=0 ; j <Nombres[i].length() ; j++ )
				Tabla[i]++;
	*/
		
	// Mostrar en pantalla
	for (int i=0;i<Nombres.length;i++)
		System.out.println (Nombres[i]  + ": " + Tabla[i]);
	

	}
}
