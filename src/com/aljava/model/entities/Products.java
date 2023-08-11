/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aljava.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author SEFIN
 */
@Entity
public class Products implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "barsCode", length = 13, nullable = true)
    private String codigoBarras;

    @Column(name = "name", length = 100, nullable = true)
    private String nome;

    @Column(name = "price", columnDefinition = "Decimal(10,2)")
    private double preco;

//    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL, orphanRemoval = true)
//    private SaleItens itens = new SaleItens();

    @Column(name = "stock", length = 11, nullable = true)
    private int estoque;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Categories categories;

    public Products() {
    }

    public Products(String nome, String codigoBarras, double preco, int estoque, Categories categories) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.preco = preco;
        this.estoque = estoque;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
//
//    public SaleItens getItens() {
//        return itens;
//    }
//
//    public void setItens(SaleItens itens) {
//        this.itens = itens;
//    }

}
