package br.com.dcss.dashfel.dashfel.model;
import lombok.Data;

@Data
public class Veiculo {

    private Long id;
    private String nome;
    private String modelo;
    private String cor;
    private int ano;
    private enum cambio;
    private enum combustivel;
    private double preco;
    
    
}


System.out.print("Olá Mundo!!!");
