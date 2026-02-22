import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<Livro>();
    }

    public ArrayList<Livro> getAcervo() {
        return acervo;
    }

    public void adicionarLivro(Livro livro) {
        this.acervo.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : this.acervo) {
            livro.exibirDetalhes();
        }
    }

    public void removerLivrosPorId(int id) {
        for (Livro livro : this.acervo) {
            if (livro.getId() == id) {
                this.acervo.remove(livro);
                break;
            }
        }
    }

    public void emprestarLivro(int id) {
        boolean encontrou = false;
        for (Livro livro : this.acervo) {
            if (livro.getId() == id) {
                encontrou = true;
                if (livro.isDisponivel()) {
                    livro.setDisponivel(false);
                    System.out.println("Livro " + livro.getTitulo() + " emprestado com sucesso!");
                }
                else  {
                    System.out.println("Desculpa, livro " + livro.getTitulo() + " ja emprestado!");
                }
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Livro não encontrado");
        }
    }

    public void devolverLivro(int id) {
        boolean encontrou = false;
        for (Livro livro : this.acervo) {
            if (livro.getId() == id) {
                encontrou = true;
                if (!livro.isDisponivel()) {
                    livro.setDisponivel(true);
                    System.out.println("Livro " + livro.getTitulo() + " devolvido com sucesso!");
                }
                else  {
                    System.out.println("Desculpa, livro " + livro.getTitulo() + " ja devolvido!");
                }
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Livro não encontrado");
        }
    }
}