public class Main {
    public static void main(String[] args) {


        // Criação dos Objetos
        ContaCorrenteComum comum = new ContaCorrenteComum();
        ContaCorrenteEspecial especial = new ContaCorrenteEspecial();

        // Testando métodos da classe Mae
        comum.depositar(100);
        especial.depositar(500);

        // Testando metodo da interface
        especial.transferir(comum,499);
        comum.transferir(especial,10);

        // Exibindo Resultado
        System.out.println(especial.getSaldo());
        System.out.println(comum.getSaldo());
    }
}