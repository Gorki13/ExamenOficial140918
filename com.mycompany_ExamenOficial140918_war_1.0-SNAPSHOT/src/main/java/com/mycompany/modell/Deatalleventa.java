/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modell;

/**
 *
 * @author KEHM PIERRE
 */
public class Deatalleventa {

    public Deatalleventa() {
        
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public Deatalleventa(String id_categoria, String name_cat, String estado) {
        this.id_categoria = id_categoria;
        this.name_cat = name_cat;
        this.estado = estado;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getName_cat() {
        return name_cat;
    }

    public void setName_cat(String name_cat) {
        this.name_cat = name_cat;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    String id_categoria, name_cat, estado;
    
}
