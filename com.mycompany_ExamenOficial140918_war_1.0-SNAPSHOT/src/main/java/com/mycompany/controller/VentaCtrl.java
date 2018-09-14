/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.VentaCtrlImpl;
import com.mycompany.modell.Venta;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.VentaDAO;


/**
 *
 * @author LENOVO
 */
@ManagedBean(name = "ventaCtrl")
@SessionScoped
public class VentaCtrl implements Serializable{
    private Venta selected;
    private boolean est;
    VentaDAO vendao;
    private ArrayList<Venta> list = new ArrayList<>();

    public VentaCtrl() {
        this.selected = new Venta();
        this.vendao = new VentaCtrlImpl();
    }
    public void createVenta(){
        if(vendao.createVenta(selected)){
            System.out.println("Insertado");
        }else{
            System.out.println("Error al insertar");
        }
    }
    public ArrayList<Venta> getList(){
        vendao = new VentaCtrlImpl();
        list = vendao.readVenta();
        return list;
    }

    public Venta getSelected() {
        return selected;
    }

    public void setSelected(Venta selected) {
        this.selected = selected;
    }
    
    
}
