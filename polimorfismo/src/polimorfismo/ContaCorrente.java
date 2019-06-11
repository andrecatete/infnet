package polimorfismo;

public class ContaCorrente {
    private String numero;
    private String titular;
    private double saldo;
    private String senha;
    
    public ContaCorrente(){ }

    public ContaCorrente(String numero, String titular, double saldo, String senha) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.senha = senha;
    }
    public String getNumero() {
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
    public double sacar(double quantia) {
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