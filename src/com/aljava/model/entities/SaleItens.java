/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aljava.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author SEFIN
 */
@Entity
public class SaleItens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "sale_item_id", length = 11, nullable = true)
    private int vendaID;
    
    @Column(name = "product_id", length = 11, nullable = true)
    private int produtoID;
    
    @Column(name = "amount", length = 11, nullable = true)
    private int quantidade;
    
    @Column(name = "unitary_price", length = 11, nullable = true)
    private double precoUnitario;

    public SaleItens() {
    }

    public SaleItens(int vendaID, int produtoID, int quantidade, double precoUnitario) {
        this.vendaID = vendaID;
        this.produtoID = produtoID;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVendaID() {
        return vendaID;
    }

    public void setVendaID(int vendaID) {
        this.vendaID = vendaID;
    }

    public int getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(int produtoID) {
        this.produtoID = produtoID;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaleItens)) {
            return false;
        }
        SaleItens other = (SaleItens) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aljava.model.entities.SaleItens[ id=" + id + " ]";
    }

}
