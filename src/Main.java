public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.carregarDados();
        System.out.println("----------------------------------");
        biblioteca.listarLivros();
    }
}