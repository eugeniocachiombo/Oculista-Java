
package Dao;

import Conexao.Conexao;
import Oculista.Cadastro;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Eugenio
 */
public class CadastroDao {
    
    private  Conexao conexao;
    private  Connection conn;

    

    public CadastroDao() {
       this.conexao = new Conexao();
       this.conn = this.conexao.getConexao();
    }


    
    public void inserir(Cadastro cadastro){
        
        try {
            String sql = "INSERT INTO cadastro(nome, BI, dia, mes, ano, sexo, categoria, telefone, morada) VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getBI());
            stmt.setInt(3, cadastro.getDia());
            stmt.setString(4, cadastro.getMes());
            stmt.setInt(5, cadastro.getAno());
            stmt.setString(6, cadastro.getSexo());
            stmt.setString(7, cadastro.getCategoria());
            stmt.setInt(8, cadastro.getTelefone());
            stmt.setString(9, cadastro.getMorada());
            
            stmt.execute();         
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir \n "+ e.getMessage());
        }   
        
    }//FIM INSERIR
    public Cadastro getCadastro (int id ){
        
        try {
            String sql = "SELECT * FROM cadastro WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            Cadastro cadastro = new Cadastro();
            
            
            ResultSet rs = stmt.executeQuery();
            rs.first();
            cadastro.setId(id);
            cadastro.setNome(rs.getString("Nome"));
            cadastro.setBI(rs.getString("bi"));
            cadastro.setDia(rs.getInt("dia"));
            cadastro.setMes(rs.getString("Mes"));
            cadastro.setAno(rs.getInt("ano"));
            cadastro.setSexo(rs.getString("Sexo"));
            cadastro.setCategoria(rs.getString("categoria"));
            cadastro.setTelefone(rs.getInt("telefone"));
            cadastro.setMorada(rs.getString("Morada"));
            
            return cadastro;
            
        } catch (Exception e) {
            
            
            System.out.println("Erro na pesquisa\n "+ e.getMessage());
            
            return null;
        }    
    }//FIM PESQUISAR
         public void editar (Cadastro cadastro ){
        
        try {
            String sql = "UPDATE cadastro SET nome = ?, bi = ?, dia = ?, mes = ?, ano = ?, sexo = ?, categoria = ?, telefone = ?, morada = ?  WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getBI());
            stmt.setInt(3, cadastro.getDia());
            stmt.setString(4, cadastro.getMes());
            stmt.setInt(5, cadastro.getAno());
            stmt.setString(6, cadastro.getSexo());
            stmt.setString(7, cadastro.getCategoria());
            stmt.setInt(8, cadastro.getTelefone());
            stmt.setString(9, cadastro.getMorada()); 
            stmt.setInt(10, cadastro.getId());
            stmt.execute();       
            
        } catch (Exception e) {
            
            System.out.println("Erro na actualização \n "+ e.getMessage());          
        }    
    }//FIM EDITAR
       
      public void excluir(int id){
          
          try {
              String sql = "DELETE FROM cadastro WHERE id = ?";
              
              PreparedStatement stmt = conn.prepareStatement(sql);
              stmt.setInt(1, id);
              stmt.execute();             
          } catch (Exception e) {
              
              System.out.println("Erro ao deletar \n "+ e.getMessage());              
          }        
      }   //FIM EXCLUIR
         public List<Cadastro> getCadastros(){
             
             try {
                 String sql = "SELECT * FROM cadastro";
                 
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 
                 ResultSet rs = stmt.executeQuery();
                 
                 List<Cadastro> listacadastros = new ArrayList<>();
                 
                 
                 while(rs.next()){
                     
                     Cadastro cadastro = new Cadastro();
                     
                    cadastro.setId(rs.getInt("id"));
                    cadastro.setNome(rs.getString("Nome"));
                    cadastro.setBI(rs.getString("bi"));
                    cadastro.setDia(rs.getInt("dia"));
                    cadastro.setMes(rs.getString("Mes"));
                    cadastro.setAno(rs.getInt("ano"));
                    cadastro.setSexo(rs.getString("Sexo"));
                    cadastro.setCategoria(rs.getString("categoria"));
                    cadastro.setTelefone(rs.getInt("telefone"));
                    cadastro.setMorada(rs.getString("Morada"));
                    listacadastros.add(cadastro);
                 } 
                     return listacadastros;             
             } catch (Exception e) {
                        System.out.println("Erro na lista"+ e.getMessage());
                      return null;      
             }
         }//FIM LISTA
         
}
