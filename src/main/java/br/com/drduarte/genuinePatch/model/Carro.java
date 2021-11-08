package br.com.drduarte.genuinePatch.model;

import javax.persistence.*;

@Entity
@Table(name="Carros")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String modelo;
    private String marca;
}
