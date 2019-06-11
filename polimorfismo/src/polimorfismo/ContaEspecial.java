package polimorfismo;

class ContaEspecial extends ContaCorrente {

    private double limite;
    
    public ContaEspecial() {}
    
    public ContaEspecial(String numero, String titular, double saldo, String senha, double limite) {
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
    public double sacar(double quantia){
        double saldo = super.sacar(quantia);
        return saldo;
    }   
}
