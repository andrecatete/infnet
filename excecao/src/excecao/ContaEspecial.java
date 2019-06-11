package excecao;

class ContaEspecial extends ContaCorrente {

    private double limite;
    
    public ContaEspecial() {}
    
    public ContaEspecial(int numero, String titular, double saldo, String senha, double limite) {
        super(numero, titular, saldo, senha);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override    
    public double sacar(double quantia) throws Exception{
        
        double saldo = super.consultarSaldo();
        
        try {
            saldo = super.sacar(quantia);
        } catch (Exception e) {
            if(e.getMessage().equals("saldo insuficiente")){
                double saldoAtual = super.consultarSaldo();
                super.sacar(saldoAtual);
                limite -= (quantia - saldoAtual);
            }
        }
        return saldo;
    }   
}
