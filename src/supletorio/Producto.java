/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

/**
 *
 * @author OrixStranger
 */
public class Producto {
    private int clave_articulo;
    private String nombre;
    private double precio;
    private int clave_fabricante;

    public Producto(int clave_articulo, String nombre, double precio, int clave_fabricante) {
        this.clave_articulo = clave_articulo;
        this.nombre = nombre;
        this.precio = precio;
        this.clave_fabricante = clave_fabricante;
    }

    
    public int getClave_articulo() {
        return clave_articulo;
    }

    public void setClave_articulo(int clave_articulo) {
        this.clave_articulo = clave_articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getClave_fabricante() {
        return clave_fabricante;
    }

    public void setClave_fabricante(int clave_fabricante) {
        this.clave_fabricante = clave_fabricante;
    }
    
    
    
    
}
