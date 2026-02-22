public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("Java Iniciante", "Autor A"));
        biblioteca.adicionarLivro(new Livro("Clean Code", "Autor B"));
        biblioteca.adicionarLivro(new Livro("Harry Potter", "JK"));

       // biblioteca.listarLivros();
       // System.out.println("-----------------------");

       // biblioteca.removerLivrosPorId(1);

       // biblioteca.listarLivros();
       // System.out.println("-----------------------");

        biblioteca.emprestarLivro(1);
        biblioteca.listarLivros();
        System.out.println("-----------------------");
        biblioteca.devolverLivro(1);
        biblioteca.devolverLivro(1);
        //biblioteca.devolverLivro(99);
        biblioteca.listarLivros();
        biblioteca.salvarDados();
    }
}