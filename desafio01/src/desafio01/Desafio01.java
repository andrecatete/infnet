package desafio01;

public class Desafio01 {

    public static void main(String[] args) {
        int[] array = {-6, -9, -15, -2, -92, -11};
        int menor = array[0];
        int maior = array[0];
        int media = 0;
                
        for(int i = 1; i <= 5; i++){
            if(array[i] < menor) {
            menor = array[i];
            }
        }
        for(int i = 1; i <= 5; i++){
            if(array[i] > maior) {
            maior = array[i];
            }
        }
        for(int i = 0; i <= 5; i++){
            media += array[i];            
        }
        System.out.println("O menor valor eh " + menor);
        System.out.println("O maior valor eh " + maior);
        System.out.println("O numero de elementos da sequencia eh " + array.length);
        System.out.println("A media eh " + media/6);
        
    }
    
}
