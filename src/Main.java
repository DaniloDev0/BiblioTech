import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // 1. Carrega o banco de dados antes do sistema abrir
        biblioteca.carregarDados();

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        // 2. O laço infinito do Menu (só para se a opção for 0)
        while (opcao != 0) {
            System.out.println("\n--- 📚 MENU BIBLIOTECH ---");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("0. Sair e Salvar");
            System.out.print("Escolha uma opção: ");


            // Lê o número que o usuário digitou
            opcao = scanner.nextInt();
            scanner.nextLine(); // 🚨 DICA DE OURO: Consumir o "Enter" que sobra no teclado para não bugar a próxima leitura!

            // 3. O roteador de opções
            if (opcao == 1) {
                System.out.println("Você escolheu adicionar um livro!");

                System.out.println("Digite o nome do livro: ");
                String titulo = scanner.nextLine();

                System.out.println("Digite o Autor do livro: ");
                String autor = scanner.nextLine();

                biblioteca.adicionarLivro(new Livro(titulo, autor));
                System.out.println("Livro adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n--- LISTA DE LIVROS ---");
                biblioteca.listarLivros();

            } else if (opcao == 3) {
                System.out.println("Você escolheu emprestar um livro!");
                int id;
                System.out.println("Digite o id do livro: ");
                id = scanner.nextInt();

                biblioteca.emprestarLivro(id);

            } else if (opcao == 4) {
                System.out.println("Você escolheu devolver um livro!");
                int id;
                System.out.println("Digite o id do livro: ");
                id = scanner.nextInt();

                biblioteca.devolverLivro(id);
            }
            else if (opcao == 0) {
                System.out.println("Fechando o sistema...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        // 4. Salva no HD quando o usuário sai do laço
        biblioteca.salvarDados();
        scanner.close(); // Fecha o leitor do teclado
        System.out.println("Sistema encerrado com segurança.");
    }
}