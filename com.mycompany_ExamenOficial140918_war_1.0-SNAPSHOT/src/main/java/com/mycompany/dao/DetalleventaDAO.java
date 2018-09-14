/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.modell.Deatalleventa;
import java.util.ArrayList;

/**
 *
 * @author P&D
 */
public interface DetalleventaDAO {
    public boolean createCategoria(Deatalleventa cat);
    public ArrayList<Deatalleventa> readCategoria();
    public boolean updateCategoria(Deatalleventa cat);
    public boolean deleteCategoria(String id);
}