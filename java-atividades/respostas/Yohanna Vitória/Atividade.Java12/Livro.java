public class Livro {

    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    void abrirLivro() {
        aberto = true;
        System.out.println("Livro aberto!");
    }

    void fecharLivro() {
        aberto = false;
        System.out.println("Livro fechado!");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Está aberto: " + aberto);
        System.out.println("----------------------");
    }

}