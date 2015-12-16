/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censusrecordanalysis.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PatiRam
 */
@Entity
@Table(name = "families")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Families.findAll", query = "SELECT f FROM Families f"),
    @NamedQuery(name = "Families.findById", query = "SELECT f FROM Families f WHERE f.id = :id"),
    @NamedQuery(name = "Families.findByFamilyId", query = "SELECT f FROM Families f WHERE f.familyId = :familyId"),
    @NamedQuery(name = "Families.findByHouseId", query = "SELECT f FROM Families f WHERE f.houseId = :houseId")})
public class Families implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "family_id")
    private String familyId;
    @Column(name = "house_id")
    private Integer houseId;

    public Families() {
    }

    public Families(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Families)) {
            return false;
        }
        Families other = (Families) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "censusrecordanalysis.model.Families[ id=" + id + " ]";
    }
    
}
