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
@Table(name = "PRODUCTO", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Producto_1.findAll", query = "SELECT p FROM Producto_1 p")
    , @NamedQuery(name = "Producto_1.findByClaveFabrica", query = "SELECT p FROM Producto_1 p WHERE p.claveFabrica = :claveFabrica")
    , @NamedQuery(name = "Producto_1.findByNombre", query = "SELECT p FROM Producto_1 p WHERE p.nombre = :nombre")})
public class Producto_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLAVE_FABRICA")
    private Integer claveFabrica;
    @Column(name = "NOMBRE")
    private String nombre;

    public Producto_1() {
    }

    public Producto_1(Integer claveFabrica) {
        this.claveFabrica = claveFabrica;
    }

    public Integer getClaveFabrica() {
        return claveFabrica;
    }

    public void setClaveFabrica(Integer claveFabrica) {
        Integer oldClaveFabrica = this.claveFabrica;
        this.claveFabrica = claveFabrica;
        changeSupport.firePropertyChange("claveFabrica", oldClaveFabrica, claveFabrica);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claveFabrica != null ? claveFabrica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto_1)) {
            return false;
        }
        Producto_1 other = (Producto_1) object;
        if ((this.claveFabrica == null && other.claveFabrica != null) || (this.claveFabrica != null && !this.claveFabrica.equals(other.claveFabrica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "supletorio.Producto_1[ claveFabrica=" + claveFabrica + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
