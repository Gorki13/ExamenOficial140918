/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.modell.Deatalleventa;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.DetalleventaDAO;


/**
 *
 * @author LENOVO
 */
@ManagedBean(name = "categoriaCtrl")
@SessionScoped
public class DetalleventaCtrl implements Serializable{
    private Deatalleventa selected;
    private boolean est;
    DetalleventaDAO catdao;
    private ArrayList<Deatalleventa> list = new ArrayList<>();

    public DetalleventaCtrl() {
        this.selected = new Deatalleventa();
        this.catdao = new ProductoCtrlImpl();
    }
    public void createCategoria(){
        if(catdao.createCategoria(selected)){
            System.out.println("Insertado");
        }else{
            System.out.println("Error al insertar");
        }
    }
    public ArrayList<Deatalleventa> getList(){
        catdao = new ProductoCtrlImpl();
        list = catdao.readCategoria();
        return list;
    }

    public Deatalleventa getSelected() {
        return selected;
    }

    public void setSelected(Deatalleventa selected) {
        this.selected = selected;
    }
    
    
}
