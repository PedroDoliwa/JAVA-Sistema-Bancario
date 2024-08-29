abstract class ContaBancaria {

    // Classe Abstrata da Conta Cancário com atributos e metodos

    private String numeroConta;
    private double saldo;
    private double limiteEmprestimo;


    abstract void depositar(double valor);

    abstract void sacar(double valor);

    abstract void solicitarEmprestimo(double valor);

    abstract void transferir(ContaBancaria destino, double valor);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
}