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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "houses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Houses.findAll", query = "SELECT h FROM Houses h"),
    @NamedQuery(name = "Houses.findById", query = "SELECT h FROM Houses h WHERE h.id = :id"),
    @NamedQuery(name = "Houses.findByHouseNo", query = "SELECT h FROM Houses h WHERE h.houseNo = :houseNo"),
    @NamedQuery(name = "Houses.findByCityId", query = "SELECT h FROM Houses h WHERE h.cityId = :cityId"),
    @NamedQuery(name = "Houses.findByRemark", query = "SELECT h FROM Houses h WHERE h.remark = :remark")})
public class Houses implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "house_no")
    private String houseNo;
    @Column(name = "city_id")
    private Integer cityId;
    @Column(name = "remark")
    private String remark;

    public Houses() {
    }

    public Houses(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        if (!(object instanceof Houses)) {
            return false;
        }
        Houses other = (Houses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.houseNo;
    }
    
}
