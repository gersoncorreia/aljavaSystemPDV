/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aljava.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author SEFIN
 */
@Entity
public class SaleItens implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "venda_id")
    private Sales sales;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    @Column(name = "amount", length = 11, nullable = false)
    private int quantidade;

    @Column(name = "unitary_price", length = 11, nullable = false)
    private double precoUnitario;

    @Column(name = "created_at", nullable = false)
    private Date dataCadastro;

    public SaleItens() {
    }

    public SaleItens(Sales sales, Products products, int quantidade, Date dataCadastro) {
        this.setSales(sales);
        this.setProducts(products);
        this.setQuantidade(quantidade);
        this.setDataCadastro(dataCadastro);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
        if(products != null && this.precoUnitario == 0){
            this.setPrecoUnitario(products.getPreco());
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
