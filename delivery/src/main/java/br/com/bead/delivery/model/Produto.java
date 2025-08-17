package br.com.bead.delivery.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private long id;
    private String nome;
    private Double preco;

    
}
