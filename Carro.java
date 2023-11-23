/*  b) Crie uma classe chamada "Carro" com os atributos modelo, cor e ano. Em seguida, crie um objeto dessa classe 
chamado "meuCarro" e defina seus atributos.*/

public class Carro {
    // Atributos da classe Carro
    String modelo;
    String cor;
    int ano;
    
    // Método construtor para inicializar os atributos
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    // Métodos getters e setters 
    public String getModelo() {
        return modelo;
    }
    
    // Setter que atribui ano
    public void setAno(int novoAno) {
        this.ano = novoAno;
    }
}


