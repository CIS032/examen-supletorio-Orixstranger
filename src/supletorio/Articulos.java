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
public class Articulos {
    private int clave_articulo;
    private String nombre;
    private float precio;
    private int clave_fabrica;

    public Articulos(int clave_articulo, String nombre, float precio, int clave_fabrica) {
        this.clave_articulo = clave_articulo;
        this.nombre = nombre;
        this.precio = precio;
        this.clave_fabrica = clave_fabrica;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getClave_fabrica() {
        return clave_fabrica;
    }

    public void setClave_fabrica(int clave_fabrica) {
        this.clave_fabrica = clave_fabrica;
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

    @Override
    public String toString() {
        return "Articulos{" + "clave_articulo=" + clave_articulo + ", nombre=" + nombre + ", precio=" + precio + ", clave_fabrica=" + clave_fabrica + '}';
    }
    
    
    
}
