/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saul Lamas
 */
public class RegistroDB {
    
    private Connection conexion;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public List listar(){
        List<Registro> registros = new ArrayList<>();
        
        try{
            conexion = Conexion.conectar();
            ps = conexion.prepareStatement("SELECT * FROM Registros");
            rs = ps.executeQuery();
            
            while(rs.next()){
              Registro registro = new Registro();
                
                registro.setId(rs.getInt(1));
                registro.setNoCasa(rs.getString(2));
                registro.setNombre(rs.getString(3));
                registro.setCantidad(rs.getDouble(4));
                registro.setConcepto(rs.getString(5));
                registros.add(registro);
            }
            
            conexion.close();
            
        }catch(SQLException e){
            
        }
        
        return registros;
       
    }
    
    public int agregarPago(Registro registro){
        int r=0;
        try{
            conexion = Conexion.conectar();
            ps = conexion.prepareStatement("INSERT INTO Registros(casa, nombre, cantidad, concepto)VALUES(?,?,?,?)");
            ps.setString(1, registro.getNoCasa());
            ps.setString(2, registro.getNombre());
            ps.setDouble(3, registro.getCantidad());
            ps.setString(4, registro.getConcepto());
            
            r = ps.executeUpdate();
            conexion.close();
        
        }catch(SQLException e){
            
        }
        return r;
    }
    
    public int actualizarPago(Registro registro){
        int r=0;
        try{
            conexion = Conexion.conectar();
            ps = conexion.prepareStatement("UPDATE Registros SET casa=?, nombre=?, cantidad=?, concepto=? WHERE idRegistro=?");
            ps.setString(1, registro.getNoCasa());
            ps.setString(2, registro.getNombre());
            ps.setDouble(3, registro.getCantidad());
            ps.setString(4, registro.getConcepto());
            ps.setInt(5, registro.getId());
            r = ps.executeUpdate();
            conexion.close();
        
        }catch(SQLException e){
            
        }
        
        
        return r;
    }
    
}
