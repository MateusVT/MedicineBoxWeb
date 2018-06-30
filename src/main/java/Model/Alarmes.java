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
@Table(name = "alarmes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alarmes.findAll", query = "SELECT a FROM Alarmes a")
    , @NamedQuery(name = "Alarmes.findByIdAlarmes", query = "SELECT a FROM Alarmes a WHERE a.idAlarmes = :idAlarmes")
    , @NamedQuery(name = "Alarmes.findByDataAlarmes", query = "SELECT a FROM Alarmes a WHERE a.dataAlarmes = :dataAlarmes")
    , @NamedQuery(name = "Alarmes.findByHoraAlarmes", query = "SELECT a FROM Alarmes a WHERE a.horaAlarmes = :horaAlarmes")
    , @NamedQuery(name = "Alarmes.findByRemedioAlarme", query = "SELECT a FROM Alarmes a WHERE a.remedioAlarme = :remedioAlarme")})
public class Alarmes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAlarmes")
    private Integer idAlarmes;
    @Column(name = "dataAlarmes")
    @Temporal(TemporalType.DATE)
    private Date dataAlarmes;
    @Size(max = 45)
    @Column(name = "horaAlarmes")
    private String horaAlarmes;
    @Size(max = 255)
    @Column(name = "remedioAlarme")
    private String remedioAlarme;

    public Alarmes() {
    }

    public Alarmes(Integer idAlarmes) {
        this.idAlarmes = idAlarmes;
    }

    public Integer getIdAlarmes() {
        return idAlarmes;
    }

    public void setIdAlarmes(Integer idAlarmes) {
        this.idAlarmes = idAlarmes;
    }

    public Date getDataAlarmes() {
        return dataAlarmes;
    }

    public void setDataAlarmes(Date dataAlarmes) {
        this.dataAlarmes = dataAlarmes;
    }

    public String getHoraAlarmes() {
        return horaAlarmes;
    }

    public void setHoraAlarmes(String horaAlarmes) {
        this.horaAlarmes = horaAlarmes;
    }

    public String getRemedioAlarme() {
        return remedioAlarme;
    }

    public void setRemedioAlarme(String remedioAlarme) {
        this.remedioAlarme = remedioAlarme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlarmes != null ? idAlarmes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alarmes)) {
            return false;
        }
        Alarmes other = (Alarmes) object;
        if ((this.idAlarmes == null && other.idAlarmes != null) || (this.idAlarmes != null && !this.idAlarmes.equals(other.idAlarmes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Alarmes[ idAlarmes=" + idAlarmes + " ]";
    }
    
}
