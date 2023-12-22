//¿Cuántas cadenas comienzan por la letra ‘A’, bien en mayúsculas o bien en minúsculas?
public class Nombre8 {

	public static void main(String[] args) {
		String Nombres[]= {"ASue", "Charlotte", "Anna", "Mike", "William" , "aEd"};
				
			int contadorDeAs = 0; // Contador para saber cuantos nombres tienen As.
				
			for (int i = 0; i < Nombres.length; i++) {
					if (Nombres[i].startsWith("a") || Nombres[i].startsWith("A") ) { // Con startsWith nos dira si empieza con a o A o no.
						contadorDeAs++;//Suma uno si comienza por a o A.
					}
				}
			//Para mostrar en pantalla el resultado
				System.out.println("Hay exactamente " + contadorDeAs + " nombres que empiezan por la letra A.");
		
	}

}
