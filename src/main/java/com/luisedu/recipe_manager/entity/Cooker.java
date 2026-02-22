package com.luisedu.recipe_manager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "cozinheiro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cooker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula")
    private Long id;
    @Column(name = "nomefantasia")
    private String fantasyName;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "nome")
    private String name;
    @Column(name = "data_admissao")
    private LocalDate admissionDate;
    @Column(name = "salario")
    private Double salary;
}
