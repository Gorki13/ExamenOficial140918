/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.ProductoCtrlImpl;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.modell.Producto;


/**
 *
 * @author LENOVO
 */
@ManagedBean(name = "productoCtrl")
@SessionScoped
public class ProductoCtrl implements Serializable{
    private Producto selected;
    private boolean est;
    ProductoDAO prodao;
    private ArrayList<Producto> list = new ArrayList<>();

    public ProductoCtrl() {
        this.selected = new Producto();
        this.prodao = new ProductoCtrlImpl();
    }
    public void createProducto(){
        if(prodao.createProducto(selected)){
            System.out.println("Insertado");
        }else{
            System.out.println("Error al insertar");
        }
    }
    public ArrayList<Producto> getList(){
        prodao = new ProductoCtrlImpl();
        list = prodao.readProducto();
        return list;
    }

    public Producto getSelected() {
        return selected;
    }

    public void setSelected(Producto selected) {
        this.selected = selected;
    }
    
    
}
