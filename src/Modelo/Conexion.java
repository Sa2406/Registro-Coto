/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Saul Lamas
 */
public class Conexion {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/registroCoto";
    private static final String USER = "root";
    private static final String PASS = "Nuevo@2018*";
    
    public static Connection conectar(){
        
        Connection cn = null;
        
        try{
            Class.forName(DRIVER);
            cn = DriverManager.getConnection(URL, USER, PASS);
            
        }catch(ClassNotFoundException | SQLException e){
           System.out.print("Error: "+ e);
        }
        return cn;
    }
    
}
