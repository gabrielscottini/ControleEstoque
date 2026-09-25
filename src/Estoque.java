import java.util.list;

public class Estoque {
    List<Produto> produtos;

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }

    public void buscaProdutos(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                System.out.println(produto());
          return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
public void entrada(int id, int quantidade) {
    for (Produto produto : produtos) {
        if (produto.getId() == id) {
            produto.adicionar(quantidade);
            System.out.println("nova quantidade: " + produto.getQuantidadedeEstoque());
            return;
        }
    }
    System.out.println("Produto não encontrado.");
}
public void saida(int id, int quantidade) {
    for (Produto produto : produtos) {
        if (produto.getId() == id) {
            produto.remover(quantidade);
            System.out.println("nova quantidade: " + produto.getQuantidadedeEstoque());
            return;
        }
    }
    System.out.println("Produto não encontrado.");
}