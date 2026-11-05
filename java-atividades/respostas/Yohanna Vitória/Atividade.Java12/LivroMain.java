public class LivroMain {

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;
        livro1.aberto = false;

        livro2.titulo = "O Pequeno Príncipe";
        livro2.autor = "Antoine de Saint-Exupéry";
        livro2.numeroPaginas = 96;
        livro2.aberto = false;

        livro3.titulo = "1984";
        livro3.autor = "George Orwell";
        livro3.numeroPaginas = 328;
        livro3.aberto = false;

        livro1.mostrarDetalhes();
        livro1.abrirLivro();
        livro1.fecharLivro();

        livro2.mostrarDetalhes();
        livro2.abrirLivro();
        livro2.fecharLivro();

        livro3.mostrarDetalhes();
        livro3.abrirLivro();
        livro3.fecharLivro();

    }
}