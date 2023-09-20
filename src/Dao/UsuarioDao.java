/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDao {

    private Conexao conexao;
    private Connection conn;

    public UsuarioDao() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }

    public boolean checklogin(String nome, int telefone) {
        boolean check = false;
        try {
            String sql = "SELECT * FROM cadastro WHERE nome = ? and telefone = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setInt(2, telefone);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (Exception e) {
            System.out.println("Erro ao tentar logar " + e.getMessage());
        }

        return check;
    }

}
