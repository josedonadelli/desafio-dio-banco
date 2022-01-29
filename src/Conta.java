public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    private float saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //Adicionado em cada método uma validação de valor para evitar que uma pessoa transfira um valor negativo.
    @Override
    public void sacar(double valor) {
        if(valor>0){
            this.saldo -= valor;
        }else{
            System.out.println("Valor inválido. Tente novamente com um valor válido");
        }

    }

    @Override
    public void depositar(double valor) {
        if(valor>0) {
            this.saldo += valor;
        }else{
            System.out.println("Valor inválido. Tente novamente com um valor válido");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(valor>0){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else{
            System.out.println("Valor inválido. Tente novamente com um valor válido");
        }
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Cliente %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println(String.format("Conta %d", this.numero));
        System.out.println(String.format("Saldo %.2f", this.saldo));
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    //retorno do nome do cliente
    public Cliente getCliente() {
        return cliente;
    }
}
