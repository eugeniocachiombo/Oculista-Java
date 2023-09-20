/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eugenio
 */
public class Conexao {

    public Connection getConexao() {

        try {

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/oculista?serverTimezone=UTC",
                    "root",
                    ""
            );
            return conn;
        } catch (Exception e) {
            System.out.println("Erro na conexao \n" + e.getMessage());

            return null;
        }

    }

}
