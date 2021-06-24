
package com.aljava.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "name", length = 100, nullable = true)
    private String nome;
    
    @Column(name = "cpf", length = 100, nullable = false)
    private String cpf;
    
    @Column(name = "rg", length = 100, nullable = true)
    private String rg;
    
    @Column(name = "email", length = 80, nullable = false)
    private String email;
    
    @Column(name = "address", length = 100, nullable = true)
    private String endereco;
    
    @Column(name = "city", length = 40, nullable = true)
    private String cidade;
    
    @Column(name = "uf", length = 2, nullable = true)
    private String uf;
    
    @Column(name = "district", length = 30, nullable = true)
    private String bairro;
    
    @Column(name = "numHouse", length = 11, nullable = true)
    private int numeroCasa;

    public Client(){}
    
    public Client(String nome, String cpf, String rg, String email, String endereco, String cidade, String uf, String bairro, int numeroCasa) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.bairro = bairro;
        this.numeroCasa = numeroCasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    
}
