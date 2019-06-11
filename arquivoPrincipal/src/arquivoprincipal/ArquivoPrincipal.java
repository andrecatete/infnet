package arquivoprincipal;

public class ArquivoPrincipal extends javax.swing.JFrame {

    public static void main(String[] args) {
        
        try{
        ArquivoUtils.escrever("Ola mundo");
        //String texto = ArquivoUtils.ler();
        
        //System.out.println(texto);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }        
    }    
}