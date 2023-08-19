public class ContaTerminal {
    private int numero;
    private String agencia;
    private String NomeCliente;
    private double saldo;
    
    
    
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        NomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return NomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
