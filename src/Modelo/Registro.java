/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Saul Lamas
 */
public class Registro {
    
    private int id;
    private String noCasa;
    private String nombre;
    private double cantidad;
    private String concepto;

    public Registro(int id, String noCasa, String nombre, double cantidad, String concepto) {
        this.id = id;
        this.noCasa = noCasa;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.concepto = concepto;
    }

    public Registro() {
        
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoCasa() {
        return noCasa;
    }

    public void setNoCasa(String noCasa) {
        this.noCasa = noCasa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
    
}
