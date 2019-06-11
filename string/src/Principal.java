
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {
    
    public static void main(String[] args){
        String texto = "Joao Ubaldo Ribeiro";
        int tam = texto.length();
        String texto1 = texto.concat("da Silva");
        String texto2 = texto.replace(" Ubaldo", "");
        String upper = texto.toUpperCase();
        String lower = texto.toLowerCase();
        String trim = (texto + " -> ").trim();
        char letra = texto.charAt(0);
        char[] caracteres = texto.toCharArray();
        
        String texto3 = texto.substring(5);
        String texto4 = texto.substring(0, 4);
        
        int i = texto.indexOf("Uba");
        int e = texto.lastIndexOf("a");
        
        boolean igual = texto.equals("Joao Ubaldo Ribeiro");
        int comp = texto.compareTo("Ze");
        
        boolean comecacomJ = texto.startsWith("Joao");
        boolean terminaComR = texto.endsWith("o");
        
        boolean eEmail = "max@mail.com".matches("\\w+\\@\\w+\\b.com(.br)?");
        
        String[] palavras = texto.split(" ");
               
        //System.out.println(palavras[1]);
        
        try {
            String ufs = arquivoprincipal.ArquivoUtils.ler("ufs.txt");
            //System.out.println(ufs);
            
            String[] linhas = ufs.split("\\n");
            for (String linha : linhas) {
                //System.out.println(linha);
                String[] campos = linha.split(";");
                System.out.println(campos[1]);
            }
            
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
