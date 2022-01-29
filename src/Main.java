public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente venilton = new Cliente();
        Cliente vania = new Cliente();

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(vania);

        venilton.setNome("Venilton");
        vania.setNome("Vania");

        banco.setNome("UAI");
        banco.addConta(cc);
        banco.addConta(poupanca);


        cc.depositar(100);
        cc.transferir(25, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("");
        banco.imprimeClientes();




    }
}
