public class mainCirculo {
    public static void main(String[] args) {
        // Criando um objeto da classe Circulo com raio 5
        Circulo meuCirculo = new Circulo(5);

        // Calculando e exibindo a área do círculo
        double area = meuCirculo.calcularArea();
        System.out.println("Área do círculo: " + area);
    }
}

