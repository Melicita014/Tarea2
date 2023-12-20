//¿Cúal de las cadenas de texto es alfabéticamente la primera? ¿En qué posición está? 
//Con los datos del ejemplo la respuesta sería:Anna, en posición 2. Cadena(0).compareTo(cadena(1))
public class NombreTarea2 {

	public static void main(String[] args) {
		String Nombres[] = {"Sue","Charlotte","Anna","Mike","William","Ed",};//ACEMSW		
		String Guardado = Nombres[0];
		int pos = 0 ;
		

		for (int i=0;i<Nombres.length-1;i++) {
			if (Nombres[i].compareTo(Guardado)<0  ) {
				Guardado = Nombres[i];
				pos = i ;
			}}
			
	System.out.println("La primera alfabeticamente es: " + Guardado + " Y esta en la posicion "+pos);	
	

	}}
		/*for (int i=0;i<Nombres.length-1;i++) {
            if (Nombres[i].compareTo(Nombres[i+1])<0 ){
                String temp = Nombres[i];
                Nombres[i]= Nombres[i+1];
                 Nombres[i+1] = temp ;   
              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
             System.out.println(temp) ;     
        }
		
	

		
	
			

	}
*/

	
/*		for (int i=0;i<Nombres.length-1;i++) {
			if (Nombres[i].compareTo(Nombres[i+1])==0){
				primero = Nombres[i]; 
			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			}	
			String Origen = "Sue" ;
		for (int i=0;i<Nombres.length;i++)
			if (Nombres[2].charAt(0)>= 'A' && Nombres[2].charAt(0)<='Z')
				;
	*/