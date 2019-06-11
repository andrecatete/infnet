package polimorfismo;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("001", "Max", 5000.0, "123456");
        ContaCorrente cc2 = new ContaCorrente("002", "Henrique", 7000.0, "123456");
        ContaEspecial cc3 = new ContaEspecial("003", "Ciclano", 8000.0, "123456", 1000.0);
        
        Agencia ag = new Agencia("Agencia Sao Jose");
        
        ag.inserirConta(cc1);
        ag.inserirConta(cc2);
        ag.inserirConta(cc3);
        
        double total = ag.calcularTotal();
        System.out.println(total);
                
    }    
}
