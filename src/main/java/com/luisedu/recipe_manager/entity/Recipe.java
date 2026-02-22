package com.luisedu.recipe_manager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "receita")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "data_criacao")
    private LocalDate creationDate;
    @Column(name = "modo_preparo")
    private String prepareMode;
    @Column(name = "num_porcoes")
    private Integer qtde;
    @ManyToOne
    @JoinColumn(name = "matcozinheiro")
    private Cooker cookerID;
    @ManyToOne
    @JoinColumn(name = "codcategoria")
    private Category categoryID;
}
