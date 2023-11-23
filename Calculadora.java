/*b)Crie uma classe "Calculadora" com métodos para adição, subtração, multiplicação e divisão. 
Realize operações matemáticas com essa classe.*/
public class Calculadora {
     // Método para somar
    public double adicao(double a, double b) {
         return a + b;
    }
    
    // Método para subtrair
    public double subtracao(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicar
    public double multiplicacao(double a, double b) {
        return a * b;
    }
    
    // Método para dividir
    public double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0; 
        }
        return a / b;
    }
}
    

