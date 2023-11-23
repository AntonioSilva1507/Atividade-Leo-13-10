public class mainCalculadora {
    public static void main(String[] args) {
        // Criando o obj Calculadora
        Calculadora minhaCalculadora = new Calculadora();

        // Operações matemáticas
        double resultadoAdicao = minhaCalculadora.adicao(5, 3);
        double resultadoSubtracao = minhaCalculadora.subtracao(10, 4);
        double resultadoMultiplicacao = minhaCalculadora.multiplicacao(6, 2);
        double resultadoDivisao = minhaCalculadora.divisao(9, 3);

        // Exibir os resultados
        System.out.println("Resultado da adição: " + resultadoAdicao);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}

