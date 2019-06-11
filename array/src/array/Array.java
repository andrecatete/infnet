package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class Array {

    public static void main(String[] args) {

        ArrayList objetos = new ArrayList();
        objetos.add("Olá");
        objetos.add(100);
        objetos.add(true);
        objetos.add(new Object());
        
        for (int i = 0; i < objetos.size(); i++) 
            System.out.println(objetos.get(i));
        
        System.out.println();
        
        boolean elemento = false;
        if(objetos.get(2) instanceof Boolean)
            elemento = (boolean)objetos.get(2);
        
        System.out.println(elemento);
        
        System.out.println();
        
        objetos.remove(elemento);
        
        for (int i = 0; i < objetos.size(); i++) 
            System.out.println(objetos.get(i));
        
        TreeSet<String> seet = new TreeSet<String>(); // nao repete elemento
        seet.add("Fulano");
        seet.add("Ciclano");
        seet.add("Fulano");
        
        for(String s: seet){
            System.out.println(s);
        }
        
        LinkedList lista = new LinkedList(); // pode repetir elemento
        lista.add("UM");
        lista.add("DOIS");
        lista.add("TRES");
        lista.add("TRES");

        for(Object l : lista)
            System.out.println(l);
        
        HashMap<Integer, String> tabela = new HashMap<Integer, String>();
           tabela.put(1, "Andre");
           tabela.put(2, "Fernando");
          
           System.out.println(tabela.get(1));
           
    }
}