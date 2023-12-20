// ¿Cuántas tienen más letras mayúsculas que minúsculas?
public class Nombres4 {

	public static void main(String[] args) {
	
				String Nombres[] = {"SuE","ChARlotte","ANNa","MIke","WILLIam","ed",};
				int contador = 0 ;
				int contador2 = 0 ;
				int contadorTotal = 0 ;
				
				for (int i=0;i<Nombres.length;i++) {
					contador = 0 ; // Lo pongo a 0 para el siguiente nombre
					contador2 = 0 ;
					for (int j=0;j<Nombres[i].length();j++) {	
						if (j < Nombres[i].length()) { // Compruebo si el indice de caracter  es menor que la longitud del nombre. Sino da error.
					
						if (Nombres[i].charAt(j)>=65 && Nombres[i].charAt(j)<=90) { // Codigos ASCII A = 65 Hasta Z=90
							contador++ ;
						}
						}
						if (j < Nombres[i].length()) {
						if (Nombres[i].charAt(j)>=97 && Nombres[i].charAt(j)<=122) { // Codigos ASCII a =97 Hasta z=122
								contador2++ ;
						}
						}
					}
					
					if (contador>contador2)
						contadorTotal ++;
	
		    }
				System.out.println("Hay exactamente:" +contadorTotal + " que tienen en su nombre mas Mayusculas");
	}
	
}


