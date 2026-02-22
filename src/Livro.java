public class Livro {

    private String titulo;
    private String autor;
    private int id;
    private boolean disponivel;
    private static int contador = 0;

    public Livro(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
        contador++;
        this.id = contador;
        this.disponivel = true;
    }

    // Construtor exclusivo para restaurar livros do Banco de Dados
    public Livro(int id, String titulo, String autor, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;

        // Atualiza o contador da classe para não gerar IDs repetidos nos próximos livros novos
        if (id > contador) {
            contador = id;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void exibirDetalhes() {
        System.out.println("ID: " + this.id +
                " | Título: " + this.titulo +
                " | Autor: " + this.autor +
                " | Disponível: " + (this.disponivel ? "Sim" : "Não"));
    }
}
