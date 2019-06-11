package arquivoprincipal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoUtils {
    
    public static String ler(String caminho) throws FileNotFoundException, IOException{
        
        String texto = "";
        
        FileReader fr = new FileReader(caminho);
        int caracter = 0;
        
        while((caracter = fr.read()) != -1){
            texto += (char) caracter;
            //caracter = fr.read();
        }
       
        //texto += caracter;
                
        return texto;
                
    }
    public static void escrever(String texto) throws IOException{
        
        File f = new File("arquivo2.txt");        
        FileWriter fw = null;
        
        if(f.exists()){
            fw = new FileWriter(f, true);
            fw.write(texto);
        }
        else
            f.createNewFile();
            //throw new IOException("Arquivo nao existe.");
        fw.close();
    }
}