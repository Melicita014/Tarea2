//¿Cuántas de las cadenas son palíndromos (capicúa)? Por ejemplo: “anna” lo es.
public class Nombres6 {
	public static void main(String[] args) {
		String Nombres[] = {"Sue","Anna","Charlotte","Anna","Mike","William","Ed","Anna"};
		
		int contador = 0; // Contador que contara las concidencias de letras totales
		int contadorOficial = 0; // Contador que dira cuantos son iguales(Palindromos).
		
		for (int i = 0; i < Nombres.length; i++) { // Bucle que ira por cada nombre
			int Cantidadletras = (int) Nombres[i].length() / 2; //Esto hara que haga solo las vueltas necesarias (La mitad del nombre)
			for (int j = 0; j < Cantidadletras; j++) {
				if(Nombres[i].charAt(j) == Nombres[i].charAt(Nombres[i].length() - j - 1)) { //Compara la primera letra (o la letra j)con la letra del lado opuesto
					contador++;																
				}
			}
		
			if (  Cantidadletras/2 == contador && contador > 0 ) { // Condicion final para sacar el total de nombres capicuas
				contadorOficial++;
			}
			contador = 0; 
		}
		
		System.out.println("Hay exactamente : " + contadorOficial + " Nombres que se leen igual"); 
		
	}

}

// 	He observado que hay un fallo cuando son cuatro letras y empieza y acaba por la misma letra, pero no he podido solucionarlo.