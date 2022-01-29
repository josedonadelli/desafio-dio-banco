import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //Método para adicionar novas contas criadas
    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    //Método para imprimir o nome do cliente de cada conta.
    public void imprimeClientes(){
        System.out.println(String.format("=== Clientes do Banco %s ===", this.nome));
        for(Conta conta:contas){
            System.out.println(String.format("%s", conta.getCliente().getNome()));
        }
    }

}
