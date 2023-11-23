// Criação do obj paiCarro
public class mainCarro {
    public static void main(String[] args) {
        // Instanciando um obj da classe Carro
        Carro paiCarro = new Carro("Fusca", "Azul", 1970);
        
        // Modificando atributos do objeto
        System.out.println("Modelo: " + paiCarro.getModelo());
        System.out.println("Cor: " + paiCarro.cor);
        System.out.println("Ano: " + paiCarro.ano);
        
        // Alterando o ano do carro
        paiCarro.setAno(1975); 
        System.out.println("Novo ano: " + paiCarro.ano);
    }
}