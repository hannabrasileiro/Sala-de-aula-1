public class EstoqueMain {
    public static void main(String[] args) {

        Estoque produto1 = new Estoque();
        Estoque produto2 = new Estoque();

        produto1.nome = "Notebook";
        produto1.preco = 2500.00;
        produto1.quantidade = 10;

        produto2.nome = "Mouse";
        produto2.preco = 50.00;
        produto2.quantidade = 20;

        produto1.adicionarEstoque(5);
        produto1.retirarEstoque(2);

        produto2.adicionarEstoque(10);
        produto2.retirarEstoque(5);

        produto1.mostrarEstoque();

        System.out.println();

        produto2.mostrarEstoque();
    }
}