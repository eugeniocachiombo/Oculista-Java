/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oculista;

/**
 *
 * @author Eugenio
 */
public class Usuario {

    private int id;
    private String nome;
    private int telefone;
    private int idcadastro;

    public int getIdcadastro() {
        return idcadastro;
    }

    public void setIdcadastro(int idcadastro) {
        this.idcadastro = idcadastro;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
