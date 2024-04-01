package br.com.dcss.dashfel.dashfel.model;
import lombok.Data;

@Data
public class Blog {
    
    private Long id;
    private int data;
    private String titulo;
    private String conteudo;
      
}
