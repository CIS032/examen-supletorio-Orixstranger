/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author OrixStranger
 */
@Entity
@Table(name = "ARTICULOS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Articulos_1.findAll", query = "SELECT a FROM Articulos_1 a")
    , @NamedQuery(name = "Articulos_1.findByClaveArticulo", query = "SELECT a FROM Articulos_1 a WHERE a.claveArticulo = :claveArticulo")
    , @NamedQuery(name = "Articulos_1.findByNombre", query = "SELECT a FROM Articulos_1 a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Articulos_1.findByPrecio", query = "SELECT a FROM Articulos_1 a WHERE a.precio = :precio")
    , @NamedQuery(name = "Articulos_1.findByClaveFabrica", query = "SELECT a FROM Articulos_1 a WHERE a.claveFabrica = :claveFabrica")})
public class Articulos_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLAVE_ARTICULO")
    private Integer claveArticulo;
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO")
    private Double precio;
    @Column(name = "CLAVE_FABRICA")
    private Integer claveFabrica;

    public Articulos_1() {
    }

    public Articulos_1(Integer claveArticulo) {
        this.claveArticulo = claveArticulo;
    }

    public Integer getClaveArticulo() {
        return claveArticulo;
    }

    public void setClaveArticulo(Integer claveArticulo) {
        Integer oldClaveArticulo = this.claveArticulo;
        this.claveArticulo = claveArticulo;
        changeSupport.firePropertyChange("claveArticulo", oldClaveArticulo, claveArticulo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        Double oldPrecio = this.precio;
        this.precio = precio;
        changeSupport.firePropertyChange("precio", oldPrecio, precio);
    }

    public Integer getClaveFabrica() {
        return claveFabrica;
    }

    public void setClaveFabrica(Integer claveFabrica) {
        Integer oldClaveFabrica = this.claveFabrica;
        this.claveFabrica = claveFabrica;
        changeSupport.firePropertyChange("claveFabrica", oldClaveFabrica, claveFabrica);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claveArticulo != null ? claveArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulos_1)) {
            return false;
        }
        Articulos_1 other = (Articulos_1) object;
        if ((this.claveArticulo == null && other.claveArticulo != null) || (this.claveArticulo != null && !this.claveArticulo.equals(other.claveArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "supletorio.Articulos_1[ claveArticulo=" + claveArticulo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
