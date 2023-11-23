/*b)Crie uma classe "Livro" com um construtor personalizado que aceita título, autor e ano de publicação como parâmetros.
 */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor personalizado
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos getters para obter os atributos do livro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    } 
}
