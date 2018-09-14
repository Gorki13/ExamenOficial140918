/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllerimpl;

import com.mycompany.modell.Venta;
import com.mycompany.configbd.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.dao.VentaDAO;


public class DetalleventaCtrlImpl implements VentaDAO {
    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Venta> listDatos;

    public DetalleventaCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createUsuario(Venta us) {
        sql = "INSERT INTO public.usuario(id_usuario, id_persona, campo1, campo2, estado)"
                + "VALUES ("+us.getId_usuario()+", "+us.getId_persona()+",'"+us.getCampo1()+"', '"+us.getCampo2()+"','"+us.getEstado()+"')";
        
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public ArrayList<Venta> readUsuario() {
        listDatos = new ArrayList<>();
        sql = "SELECT id_categoria, id_persona, campo1, campo2, estado "
                + "    FROM public.usuario";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                    listDatos.add(new Venta(rs.getString("id_usuario"),rs.getString("id_persona"), rs.getString("campo1"), rs.getString("campo2"), rs.getString("estado")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DetalleventaCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }
    @Override
    public boolean updateUsuario(Venta us) {
       sql = "UPDATE public.persona SET"
                + "id_persona= "+us.getId_persona()+",campo1 = '"+us.getCampo1()+"',campo2 = '"+us.getCampo2()+"',estado = '"+us.getEstado()+"' "
                + "WHERE id_usuario = "+us.getId_usuario()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteUsuario(String id) {
        sql = "DELETE FROM public.usuario"
                + "WHERE id_usuario = "+id+" ";
        return cx.executeInsertUpdate(sql);
    }

}

