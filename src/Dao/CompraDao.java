package Dao;

import Conexao.Conexao;
import Oculista.Cadastro;

import Oculista.Compr;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraDao {

    private Conexao conexao;
    private Connection conn;

    public CompraDao() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }

    public void inserir(Compr compra) {
        try {
            String sql = "INSERT INTO compra ( cod_Prod, tipo, preço, Qd ) VALUES" + "(?, ?, ?, ?)";

            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setInt(1, compra.getCod_Prod());
            stmt.setString(2, compra.getTipo());
            stmt.setInt(3, compra.getPreco());
            stmt.setInt(4, compra.getQd());
            JOptionPane.showMessageDialog(null, "Produto Comprado");
            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir \n " + e.getMessage());

        }

    }

    public List<Compr> getCompras() {

        try {

            String sql = "SELECT * FROM compra";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            List<Compr> listacompras = new ArrayList<>();

            while (rs.next()) {

                Compr compra = new Compr();

                compra.setCod_Prod(rs.getInt("cod_prod"));
                compra.setTipo(rs.getString("tipo"));
                compra.setPreco(rs.getInt("preço"));
                compra.setQd(rs.getInt("Qd"));
                listacompras.add(compra);
            }
            return listacompras;
        } catch (Exception e) {
            System.out.println("Erro na lista" + e.getMessage());
            return null;
        }
    }//FIM LISTA

    public Compr getPesquisa(int cod_prod) {

        try {
            String sql = "SELECT * FROM compra WHERE cod_prod = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cod_prod);

            Compr compra = new Compr();

            ResultSet rs = stmt.executeQuery();
            rs.first();
            compra.setCod_Prod(cod_prod);
            compra.setTipo(rs.getString("tipo"));
            compra.setPreco(rs.getInt("preço"));
            compra.setQd(rs.getInt("Qd"));

            return compra;

        } catch (Exception e) {

            System.out.println("Erro na pesquisa\n " + e.getMessage());

            return null;
        }
    }//FIM PESQUISAR

    public void editar(Compr compra) {

        try {
            String sql = "UPDATE compra SET  tipo = ?, preço = ?, Qd = ?  WHERE cod_prod = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, compra.getTipo());
            stmt.setInt(2, compra.getPreco());
            stmt.setInt(3, compra.getQd());
            stmt.setInt(4, compra.getCod_Prod());

            stmt.execute();

        } catch (Exception e) {

            System.out.println("Erro na actualização \n " + e.getMessage());
        }
    }//FIM EDITAR

    public void excluir(int cod_prod) {

        try {
            String sql = "DELETE FROM compra WHERE cod_prod = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cod_prod);
            stmt.execute();
        } catch (Exception e) {

            System.out.println("Erro ao deletar \n " + e.getMessage());
        }
    }   //FIM EXCLUIR
}
