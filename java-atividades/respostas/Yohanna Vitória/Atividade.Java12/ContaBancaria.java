public class ContaBancaria {
  String titular;
    int numeroConta;
    double saldo; 

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        saldo = saldo - valor;
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}

