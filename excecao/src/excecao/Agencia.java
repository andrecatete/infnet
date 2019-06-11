package excecao;

public class Agencia {
    private String razaoSocial;
    private ContaCorrente[] contas = new ContaCorrente[10];

    public Agencia() {
    }
    public Agencia(String razaoSocial) {
        this.razaoSocial = razaoSocial;        
    }
      
    public void inserirConta(ContaCorrente cc) {
        for (int i = 0; i < contas.length; i++) {
            if(contas[i] == null){
                contas[i] = cc;
                break;
            }
        }        
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contas.length; i++) {
            if(contas[i]!=null){
                total += contas[i].consultarSaldo();                        
                if(contas[i] instanceof ContaEspecial){
                    ContaEspecial ce = (ContaEspecial)contas[i];
                    total += ce.getLimite();                            
                }
            }
        }
        return total;
    }
            
}