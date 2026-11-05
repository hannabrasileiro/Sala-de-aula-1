public class ProdutoMain {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00, 5);
        Produto produto2 = new Produto("Mouse", 80.00, 10);
        Produto produto3 = new Produto("Teclado", 150.00, 8);

        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();

        produto1.aplicarDesconto(10);

        System.out.println("Produto após o desconto:");
        produto1.exibirProduto();

    }
}