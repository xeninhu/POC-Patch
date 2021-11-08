package br.com.drduarte.genuinePatch.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Pessoas")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private Integer idade;
    private String email;

    @ManyToOne
    @JoinColumn(name="id_carro",referencedColumnName = "id")
    private Carro carro;
}
