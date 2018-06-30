/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author leotr
 */
@Entity
@Table(name = "acionado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acionado.findAll", query = "SELECT a FROM Acionado a")
    , @NamedQuery(name = "Acionado.findByIdAcionado", query = "SELECT a FROM Acionado a WHERE a.idAcionado = :idAcionado")
    , @NamedQuery(name = "Acionado.findByDataAcionado", query = "SELECT a FROM Acionado a WHERE a.dataAcionado = :dataAcionado")
    , @NamedQuery(name = "Acionado.findByHoraAcionado", query = "SELECT a FROM Acionado a WHERE a.horaAcionado = :horaAcionado")
    , @NamedQuery(name = "Acionado.findByDesligadoAcionado", query = "SELECT a FROM Acionado a WHERE a.desligadoAcionado = :desligadoAcionado")})
public class Acionado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAcionado")
    private Integer idAcionado;
    @Column(name = "dataAcionado")
    @Temporal(TemporalType.DATE)
    private Date dataAcionado;
    @Size(max = 45)
    @Column(name = "horaAcionado")
    private String horaAcionado;
    @Column(name = "desligadoAcionado")
    private Short desligadoAcionado;

    public Acionado() {
    }

    public Acionado(Integer idAcionado) {
        this.idAcionado = idAcionado;
    }

    public Integer getIdAcionado() {
        return idAcionado;
    }

    public void setIdAcionado(Integer idAcionado) {
        this.idAcionado = idAcionado;
    }

    public Date getDataAcionado() {
        return dataAcionado;
    }

    public void setDataAcionado(Date dataAcionado) {
        this.dataAcionado = dataAcionado;
    }

    public String getHoraAcionado() {
        return horaAcionado;
    }

    public void setHoraAcionado(String horaAcionado) {
        this.horaAcionado = horaAcionado;
    }

    public Short getDesligadoAcionado() {
        return desligadoAcionado;
    }

    public void setDesligadoAcionado(Short desligadoAcionado) {
        this.desligadoAcionado = desligadoAcionado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcionado != null ? idAcionado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acionado)) {
            return false;
        }
        Acionado other = (Acionado) object;
        if ((this.idAcionado == null && other.idAcionado != null) || (this.idAcionado != null && !this.idAcionado.equals(other.idAcionado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Acionado[ idAcionado=" + idAcionado + " ]";
    }
    
}
