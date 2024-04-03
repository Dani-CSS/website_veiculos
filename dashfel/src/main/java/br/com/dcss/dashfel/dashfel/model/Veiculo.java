package br.com.dcss.dashfel.dashfel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Entity
public class Veiculo {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String nome;

    @Setter
    private String modelo;

    @Setter
    private String cor;

    @Setter
    private int ano;

    @Setter
    private Cambio cambio;

    @Setter
    private Combustivel combustivel;

    @Setter
    private double preco;    
    
}


