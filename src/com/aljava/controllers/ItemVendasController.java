/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aljava.controllers;

import com.aljava.model.entities.SaleItens;
import java.sql.*;

/**
 *
 * @author SEFIN
 */
public class ItemVendasController {

    private Connection connection;

    public ItemVendasController(Connection connection) {
        this.connection = connection;
    }
    
    public ItemVendasController(){
        
    }

    // Inserir uma nova saída no banco de dados
    public void inserirItemVenda(SaleItens itemVenda) throws SQLException {
        System.out.println(itemVenda);
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO saleitens (created_at, unitary_price, amount, product_id, venda_id) VALUES (?, ?, ?,?,?)");
        statement.setDate(1, new java.sql.Date(Long.parseLong(itemVenda.getDataCadastro().toString())));
        statement.setDouble(2, itemVenda.getProducts().getPreco());
        statement.setInt(3, itemVenda.getQuantidade());
        statement.setDouble(4, itemVenda.getProducts().getId());
        statement.setDouble(5, itemVenda.getSales().getId());
        statement.executeUpdate();

        statement.close();
    }
}
