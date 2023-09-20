package Dao;

import Conexao.Conexao;
import Oculista.Marcaca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarcacaoDao {

    private Conexao conexao;
    private Connection conn;

    public MarcacaoDao() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }

    public void inserir(Marcaca marc) {

        try {
            String sql = "INSERT INTO marcação (nome, hora, dia, mes, ano, telefone, tipo_consulta) VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, marc.getNome());
            stmt.setString(2, marc.getHora());
            stmt.setInt(3, marc.getDia());
            stmt.setString(4, marc.getMes());
            stmt.setInt(5, marc.getAno());
            stmt.setInt(6, marc.getTelefone());
            stmt.setString(7, marc.getTipo_consulta());
            stmt.execute();

        } catch (Exception e) {

            System.out.println("Erro ao inserir\n" + e.getMessage());

        }
    }

    public List<Marcaca> getConsultas() {

        try {

            String sql = "SELECT * FROM marcação";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            List<Marcaca> listaconsultas = new ArrayList<>();

            while (rs.next()) {

                Marcaca consultas = new Marcaca();

                consultas.setCod_consulta(rs.getInt("cod_consulta"));
                consultas.setNome(rs.getString("nome"));
                consultas.setHora(rs.getString("Hora"));
                consultas.setDia(rs.getInt("Dia"));
                consultas.setMes(rs.getString("mes"));
                consultas.setAno(rs.getInt("ano"));
                consultas.setTelefone(rs.getInt("telefone"));
                consultas.setTipo_consulta(rs.getString("tipo_consulta"));

                listaconsultas.add(consultas);
            }
            return listaconsultas;
        } catch (Exception e) {
            System.out.println("Erro na lista" + e.getMessage());
            return null;
        }
    }//FIM LISTA

    public Marcaca getPesquisa(int cod_consulta) {

        try {
            String sql = "SELECT * FROM marcação WHERE cod_consulta = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cod_consulta);

            Marcaca marcacao = new Marcaca();

            ResultSet rs = stmt.executeQuery();
            rs.first();
            marcacao.setCod_consulta(cod_consulta);
            marcacao.setCod_consulta(rs.getInt("cod_consulta"));
            marcacao.setNome(rs.getString("nome"));
            marcacao.setHora(rs.getString("Hora"));
            marcacao.setDia(rs.getInt("Dia"));
            marcacao.setMes(rs.getString("mes"));
            marcacao.setAno(rs.getInt("ano"));
            marcacao.setTelefone(rs.getInt("telefone"));
            marcacao.setTipo_consulta(rs.getString("tipo_consulta"));

            return marcacao;

        } catch (Exception e) {

            System.out.println("Erro na pesquisa\n " + e.getMessage());

            return null;
        }
    }//FIM PESQUISAR

    public void editar(Marcaca marc) {

        try {
            String sql = "UPDATE marcação SET nome = ?, hora = ?, dia = ?, mes = ?, ano = ?, telefone = ?, tipo_consulta = ? WHERE cod_consulta = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, marc.getNome());
            stmt.setString(2, marc.getHora());
            stmt.setInt(3, marc.getDia());
            stmt.setString(4, marc.getMes());
            stmt.setInt(5, marc.getAno());
            stmt.setInt(6, marc.getTelefone());
            stmt.setString(7, marc.getTipo_consulta());
            stmt.setInt(8, marc.getCod_consulta());
            stmt.execute();

        } catch (Exception e) {

            System.out.println("Erro na actualização \n " + e.getMessage());
        }
    }//FIM EDITAR

    public void excluir(int cod_consulta) {

        try {
            String sql = "DELETE FROM marcação WHERE cod_consulta = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cod_consulta);
            stmt.execute();
        } catch (Exception e) {

            System.out.println("Erro ao deletar \n " + e.getMessage());
        }
    }   //FIM EXCLUIR
}
