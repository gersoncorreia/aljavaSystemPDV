/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aljava.model.entities;

import com.aljava.classes.DAO;

/**
 *
 * @author GERSON
 */

/*
    Classe para fazer teste de inserção dos dados
 */
public class teste {

    public static void main(String[] args) {
        Client cliente = new Client("Gerson Correia", "936.956.832-87", "430720", "gerson.correia@hotmail.com", "Rua Santa Catarina",
                "RIO BRANCO", "AC", "XAVIER MAIA", 71);

        DAO<Client> dao = new DAO<>(Client.class);
        dao.abrirT().incluir(cliente).fecharT().fechar();
    }
}
