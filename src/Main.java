public class Main {
    public static void main(String[] args) {
        Cliente rodrigoH = new Cliente("Rodrigo Hills", 887744L, "05/05/1980", "Rua 7, 145, Florianópolis/SC");
        Conta cc1 = new ContaCorrente(rodrigoH);
        Conta cp1 = new ContaPoupanca(rodrigoH);

        cc1.depositar(20000);
        cc1.transferir(5000, cp1);
        cc1.investir(8500);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

    }
}
