public class mainLivro {
    public static void main(String[] args) {
        // Criando um obj Livro usando o construtor personalizado
        Livro meuLivro = new Livro("O sem nome", "Fulano", 2023);

        // Acessando os atributos do livro usando os getters
        System.out.println("Título: " + meuLivro.getTitulo());
        System.out.println("Autor: " + meuLivro.getAutor());
        System.out.println("Ano de Publicação: " + meuLivro.getAnoPublicacao());
    }
}
