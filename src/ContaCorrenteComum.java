public class ContaCorrenteComum extends ContaBancaria{

    @Override
    void depositar(double valor) {
        double novoValor = getSaldo()+valor;
        setSaldo(novoValor);
    }

    @Override
    void sacar(double valor) {
        double novoValor = getSaldo()-valor;
        setSaldo(novoValor);
    }

    @Override
    void solicitarEmprestimo(double valor) {
        if(getLimiteEmprestimo()+valor <= 1000 && getSaldo() > 0){
            setSaldo(getSaldo()+valor);
            setLimiteEmprestimo(getLimiteEmprestimo()+valor);

            System.out.println("Empréstimo de R$"+valor+" Aprovado!");

        }else{
            System.out.println("Empréstimo Negado");
        }
    }

    @Override
    void transferir(ContaBancaria destino, double valor) {
        if(getSaldo()-valor >= 0){
            setSaldo(getSaldo()-valor);
            destino.depositar(valor);
            System.out.println("Transferencia de R$"+ valor +" Concluida");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}