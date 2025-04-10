import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorId = 1;
    private int id;
    private LocalDateTime dataHora;
    private Vendedor vendedor;
    private Cliente cliente;
    private String status;
    private List<ItemPedido> itens;

    public Pedido(Vendedor vendedor, Cliente cliente) {
        this.id = contadorId++;
        this.dataHora = LocalDateTime.now();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.status = "Em Processamento";
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void aplicarDesconto(double percentual) {
        for (ItemPedido item : itens) {
            double novoPreco = item.getPrecoUnitario() * (1 - percentual / 100);
            item = new ItemPedido(item.getCodigoProduto(), item.getDescricao(), item.getQuantidade(), novoPreco);
        }
    }

    public void exibirResumoPedido() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Vendedor: " + vendedor.getNome() + " - Matrícula: " + vendedor.getMatricula());
        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereco() + " | Telefone: " + cliente.getTelefone());
        System.out.println("Status: " + status);
        System.out.println("Itens do Pedido:");
        for (ItemPedido item : itens) {
            System.out.printf("- %s (%s): %d x R$%.2f = R$%.2f\n",
                    item.getDescricao(), item.getCodigoProduto(),
                    item.getQuantidade(), item.getPrecoUnitario(),
                    item.calcularSubtotal());
        }
        System.out.printf("Valor Total: R$%.2f\n", calcularValorTotal());
    }
}
