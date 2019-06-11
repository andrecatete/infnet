package excecao;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;
    private String senha;
    
    public ContaCorrente(){ }

    public ContaCorrente(int numero, String titular, double saldo, String senha) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.senha = senha;
    }
    public int getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double consultarSaldo() {
        return saldo;
    }
    public void depositar(double saldo) {
        this.saldo += saldo;
    }
    public double sacar(double quantia) throws Exception {
        if(quantia <= 0)
            throw new Exception ("quantia invalida");
        if(quantia>saldo)
            throw new Exception ("saldo insuficiente");
        saldo -= quantia;
        return saldo;        
    }
    public String getSenha() {
        return "*****";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}