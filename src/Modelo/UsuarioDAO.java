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

/**
 *
 * @author Saul Lamas
 */
public class UsuarioDAO {
    
    private Connection conexion;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Usuario validarUsuario(String nombre, String pass){
        
        Usuario usuario = new Usuario();
        
        try{
            conexion = Conexion.conectar();
            ps = conexion.prepareStatement("SELECT * FROM Usuarios "
                    + "WHERE usuario ='"+nombre+"' AND pass ='"+pass+"'");
            rs = ps.executeQuery();

            
            while(rs.next()){
                usuario.setUser(rs.getString(1));
                usuario.setPassword(rs.getString(2));
            }
            
            conexion.close();
        
        }catch(SQLException e){
            
        }
        
        return usuario;
    }
    
    
}
