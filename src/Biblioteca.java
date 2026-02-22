import java.io.*;
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

    public void salvarDados() {
        // O 'try' tenta executar essa ação "perigosa" (criar um arquivo no Windows)
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("banco_de_dados.txt"))) {

            for (Livro livro : this.acervo) {
                String linha = livro.getId() + "," + livro.getTitulo() + "," + livro.getAutor() + "," + livro.isDisponivel();
                escritor.write(linha);
                escritor.newLine();
            }
            System.out.println("Dados salvos com sucesso no HD!");

        } catch (IOException e) {
            // Se o Windows barrar a criação do arquivo, o programa não 'crasha'. Ele cai aqui:
            System.out.println("Opa, deu um erro ao tentar salvar: " + e.getMessage());
        }
    }

    public void carregarDados() {
        try (BufferedReader leitor = new BufferedReader(new FileReader("banco_de_dados.txt"))) {
            String linha;

            // O loop 'while' vai rodar linha por linha até o arquivo acabar
            while ((linha = leitor.readLine()) != null) {

                String[] partes = linha.split(",");
                int id =  Integer.parseInt(partes[0]);
                String titulo = partes[1];
                String autor = partes[2];
                boolean disponivel = Boolean.parseBoolean(partes[3]);

                Livro livro = new Livro(id, titulo, autor, disponivel);
                acervo.add(livro);
            }
            System.out.println("Dados carregados com sucesso do HD!");

        } catch (Exception e) {
            System.out.println("Nenhum dado salvo encontrado ou erro ao ler: " + e.getMessage());
        }
    }
}