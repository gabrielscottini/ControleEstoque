import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    int opcao;
    while(true) {
        Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt();
        public static estoque = new Estoque();

        System.out.println("=================");
        System.out.println("CONTROLE DE ESTOQUE");
        System.out.println("=================");

        System.out.println();

        System.out.println("1 - cadastrar produtos");
        System.out.println("2 - listar produtos");
        System.out.println("3 - entrada de produtos");
        System.out.println("4 - saída de produtos");
        System.out.println("5 - buscar produtos");
        System.out.println("6 - sair");

      switch (opcao) {}
        case 1:
        break;
            
        case 2:
           estoque.listarProdutos();
            break;
        case 3: 
          int id = getId(scanner);
          int qt = scanner.nextInt();
          estoque.entrada(id, qt); 
                break;
        case 4:
        int idSaida = getId(scanner);
        int qtSaida = scanner.nextInt();
        estoque.saida(idSaida, qtSaida);
            break;
        case 5:
             System.out.println("Digite o ID do produto que deseja buscar:");
             int idBusca = scanner.nextInt();
             estoque.buscaProdutos(idBusca);
            break;
        case 0:
        return;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
      }
      }
}
