/*b)Crie uma classe chamada "Círculo" com um construtor que recebe o raio como parâmetro e um método para calcular a área 
do círculo. Em seguida, crie um objeto "meuCirculo" e calcule a área.
public class Circulo {
    private double raio;*/
public class Circulo {
    private double raio;

    // Construtor que recebe o raio como parâmetro
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
