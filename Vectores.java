
import java.util.*;

// By v@n*
public class Vectores {

		
/// metodo covierte a entero arreglo	
	
public int [] covertirInt(String [] a) {
	
	
	 int [] temporal = new int [a.length-1];
	
	
	 for (int i =0; i<temporal.length;i++) {
	 
		 temporal[i]=Integer.parseInt(a[i+1]);
	 }
 
 
	 return temporal;
	
}


/// metodo imprime arreglo 


public void imprimeArreglo (int [] a) {
	
	
	for (int i=0; i<a.length;i++) {
		
		System.out.print(a[i]+" ");
		
	}
	System.out.println(" ");
	
}

// ascendente

public void ordenAscendente( int [] a) {
	 
	 for (int x = 0; x < a.length; x++) {
	        for (int i = 0; i < a.length-x-1; i++) {
	        	 
	   		 if(a[i] >= a[i+1]) {
	   		 
	   		 a[i] = a[i]+a[i+1]; 
	   		 a[i+1] = a[i]-a[i+1]; 
	   		 a[i] = a[i]-a[i+1];
	   		 }
	        }
	    }
	 
}
// descendente


public void ordenDescendente( int [] a) {
	 
	 for (int x = 0; x < a.length; x++) {
	        for (int i = 0; i < a.length-x-1; i++) {
	        	 
	   		 if(a[i] <= a[i+1]) {
	   		 
	   		 a[i] = a[i]+a[i+1]; 
	   		 a[i+1] = a[i]-a[i+1]; 
	   		 a[i] = a[i]-a[i+1];
	   		 }
	        }
	    }
	 
}


//menor valor  

public void menor(int [] a) {
	
	int menor=a[0];
	int posicion=0;
	
	for (int i=1; i<a.length;i++) {
		
		if(a[i]<= menor ) {
			
			menor=a[i];
			posicion=i;
		}
	}
	
	System.out.println("menor: "+ menor +",  "+"posición: "+posicion);
	
}
	


//Mayor valor 

public void mayor(int [] a) {
	
	int mayor=a[0];
	int posicion=0;
	
	for (int i=1; i<a.length;i++) {
		
		if(a[i]>= mayor ) {
			
			mayor=a[i];
			posicion=i;
		}
	}
	
	System.out.println("Mayor: "+ mayor +",  "+"posición: "+posicion);
	
}

// Suma recursiva


public  int sumar (int [] a, int x)

{

    if(x<a.length) {

        return a[x]+sumar(a,x+1);

    }

    return 0;

}


// Suma stream 

public void sumaStream (int [] arr){

      List<Integer> list = new ArrayList<>(arr.length);
 
      for (int i : arr) {
            list.add(Integer.valueOf(i));
        }
        
      int suma = list.stream().reduce(0, (a, b) -> a + b);
      System.out.println(suma);
    
    
}

	public static void main (String [] args ) {
		
		
		Scanner teclado  = new Scanner(System.in);
		Vectores neoVector = new Vectores();
		
                try {
                
               System.out.println("Ingrese función");
              
		while(teclado.hasNextLine()) {
			

			teclado.useDelimiter("\n");

			
			String  palabra = teclado.next();
			
			String[] result = palabra.split("\\s");
		   
			String opcion = result[0];
			
			int [] numeros = neoVector.covertirInt(result);
			
			
			
			if(opcion.equals("OA")) {
				
				neoVector.ordenAscendente(numeros);
				neoVector.imprimeArreglo(numeros);
				
			}
			
			if(opcion.equals("OD")) {
				
				neoVector.ordenDescendente(numeros);
				neoVector.imprimeArreglo(numeros);
				
			}
			
			if(opcion.equals("NMN")) {
				
				neoVector.menor(numeros);
				
			}
			
			if(opcion.equals("NM")) {
				
				neoVector.mayor(numeros);
				
			}
			
			
			if(opcion.equals("VS")) {
				
				 System.out.println("La suma del Vector es: "+ neoVector.sumar(numeros,0));
				
			}
			
			if(opcion.equals("VSB")) {
				
				neoVector.sumaStream(numeros);
				
			}
			                     System.out.println("Ingrese función");
              
		}

		 } catch (Exception e) {
            
                 System.out.println("Ocurrio un error");
                 }
	}
}
