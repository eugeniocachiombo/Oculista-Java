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
public class Compr {

    private int cod_Prod;
    private String tipo;
    private int preco;
    private int Qd;

    public int getQd() {
        return Qd;
    }

    public void setQd(int Qd) {
        this.Qd = Qd;
    }

    public int getCod_Prod() {
        return cod_Prod;
    }

    public void setCod_Prod(int cod_Prod) {
        this.cod_Prod = cod_Prod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

}
