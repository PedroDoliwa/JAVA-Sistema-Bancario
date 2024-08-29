//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaCorrenteComum comum = new ContaCorrenteComum();
        ContaCorrenteEspecial especial = new ContaCorrenteEspecial();

        comum.depositar(100);
        especial.depositar(500);

        especial.transferir(comum,499);
        comum.transferir(especial,10);

        System.out.println(especial.getSaldo());
        System.out.println(comum.getSaldo());
    }
}