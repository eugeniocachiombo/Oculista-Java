/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oculista;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.sql.Time;

/**
 *
 * @author Eugenio
 */
public class Marcaca {

    private int cod_consulta;
    private String nome;
    private String hora;
    private int dia;
    private String mes;
    private int ano;
    private int telefone;
    private String tipo_consulta;

    public int getCod_consulta() {
        return cod_consulta;
    }

    public void setCod_consulta(int cod_consulta) {
        this.cod_consulta = cod_consulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

}
