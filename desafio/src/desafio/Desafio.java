package desafio;

public class Desafio {

     public static void main(String[] args) {
         int array[] = {1, 2, 4, 5, 6, 7, 13, 15, 16, 17, 18, 20};                  
         int tamanho = array.length;         
         
         calculaIntervalos(array, tamanho); 
         System.out.print("Saida: "); 
         imprimeIntervalos(array, tamanho);         
     }
     
     public static int calculaIntervalos(int[] array, int tamanho){
         int numIntervalos = 1;
         for(int i = 1; i <= (tamanho - 1); i++){
              if(array[i]-1 == array[i-1])
                   numIntervalos++;            
         }
         return numIntervalos;
     }
     
     public static void imprimeIntervalos(int[] array, int tamanho){
    	 if(array[0]+1 != array[1])                
       	  	System.out.print("[" + array[0] + "] [");
    	 else
    		 System.out.print("[" + array[0]);
         for(int i = 1; i <= (tamanho - 2); i++){                       
              if((array[i] == (array[i-1]+1))&&(array[i] == (array[i+1]-1)))                
            	  continue;
              else if((array[i] == (array[i-1]+1))&&(array[i] != (array[i+1]-1))) 
                   System.out.print(", " + array[i] + "] [");              
              else if((array[i] != (array[i-1]+1))&&(array[i] == (array[i+1]-1))) 
            	  System.out.print(array[i]);
              else if((array[i] != (array[i-1]+1))&&(array[i] != (array[i+1]-1))) 
            	  System.out.print(array[i] + "] [");
              else
            	  System.out.print(array[i]);
         }
         if((array[tamanho-1]-1) != (array[tamanho-2]))
        	 System.out.print(array[tamanho-1] + "]");
         else
        	 System.out.print(", " + array[tamanho-1] + "]");
     }     
}