public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadedeEstoque;

   public Produto() {}

    public Produto(int id, String nome, double preco, int quantidadedeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadedeEstoque = quantidadedeEstoque;
    }

    public void adicionar(int quantidade) {
        quantidadedeEstoque += quantidade;

    }

    public void remover(int quantidade) {
        quantidadedeEstoque -= quantidade;
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadedeEstoque);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadedeEstoque() {
        return quantidadedeEstoque;
    }

    public void setQuantidadedeEstoque(int quantidadedeEstoque) {
        this.quantidadedeEstoque = quantidadedeEstoque;
    }


@Override
public String toString() {
    return "Produto{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", preco=" + preco +
            ", quantidadedeEstoque=" + quantidadedeEstoque +
            '}';
}
}