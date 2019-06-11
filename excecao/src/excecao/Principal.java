package excecao;

public class Principal {

    public static void main(String[] args) {
        
        try{
            ContaCorrente cc = new ContaCorrente();
            cc.depositar(200);
            cc.sacar(200); 
            
            ContaEspecial ce = new ContaEspecial(10, "", 1000.0,"",500.0);
            ce.sacar(1000.0);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
                
    }    
}
