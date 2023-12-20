//¿Cuántas letras mayúsculas hay en cada posición del array? 

public class Nombre3 {
	public static void main(String[] args) {
		String Nombres[] = {"SuE","ChARLOTTEEEEEE","ANNa","MIke","WILLIam","ed",};
		int contador = 0 ;
		
		for (int i=0;i<Nombres.length;i++) {
			contador = 0 ; // Lo pongo a 0 para el siguiente nombre
			for (int j=0;j<Nombres[i].length();j++) {	
				if (j < Nombres[i].length()) { // Compruebo si el indice de caracter  es menor que la longitud del nombre. Sino da error.
			
				if (Nombres[i].charAt(j)>=65 && Nombres[i].charAt(j)<=90) { // Codigos ASCII A = 65 Hasta Z=90
					contador++ ;
					
				}
				
				}
			}
			System.out.println (Nombres[i]  + ": " + contador);
		
		}
		

    }
	}
