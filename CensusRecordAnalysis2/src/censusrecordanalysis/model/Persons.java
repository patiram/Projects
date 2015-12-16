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
@Table(name = "persons")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persons.findAll", query = "SELECT p FROM Persons p"),
    @NamedQuery(name = "Persons.findById", query = "SELECT p FROM Persons p WHERE p.id = :id"),
    @NamedQuery(name = "Persons.findByFullname", query = "SELECT p FROM Persons p WHERE p.fullname = :fullname"),
    @NamedQuery(name = "Persons.findByAge", query = "SELECT p FROM Persons p WHERE p.age = :age"),
    @NamedQuery(name = "Persons.findBySsn", query = "SELECT p FROM Persons p WHERE p.ssn = :ssn"),
    @NamedQuery(name = "Persons.findByGender", query = "SELECT p FROM Persons p WHERE p.gender = :gender"),
    @NamedQuery(name = "Persons.findByCountryId", query = "SELECT p FROM Persons p WHERE p.countryId = :countryId"),
    @NamedQuery(name = "Persons.findByStateId", query = "SELECT p FROM Persons p WHERE p.stateId = :stateId"),
    @NamedQuery(name = "Persons.findByCityId", query = "SELECT p FROM Persons p WHERE p.cityId = :cityId"),
    @NamedQuery(name = "Persons.findByHouseId", query = "SELECT p FROM Persons p WHERE p.houseId = :houseId"),
    @NamedQuery(name = "Persons.findByFamilyId", query = "SELECT p FROM Persons p WHERE p.familyId = :familyId"),
    @NamedQuery(name = "Persons.findByReligions", query = "SELECT p FROM Persons p WHERE p.religions = :religions"),
    @NamedQuery(name = "Persons.findByEducation", query = "SELECT p FROM Persons p WHERE p.education = :education"),
    @NamedQuery(name = "Persons.findByEmployement", query = "SELECT p FROM Persons p WHERE p.employement = :employement"),
    @NamedQuery(name = "Persons.findByMailingAddress", query = "SELECT p FROM Persons p WHERE p.mailingAddress = :mailingAddress")})
public class Persons implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "age")
    private Integer age;
    @Column(name = "ssn")
    private String ssn;
    @Column(name = "gender")
    private String gender;
    @Column(name = "country_id")
    private Integer countryId;
    @Column(name = "state_id")
    private Integer stateId;
    @Column(name = "city_id")
    private Integer cityId;
    @Column(name = "house_id")
    private Integer houseId;
    @Column(name = "family_id")
    private Integer familyId;
    @Column(name = "religions")
    private String religions;
    @Column(name = "education")
    private String education;
    @Column(name = "employement")
    private String employement;
    @Column(name = "mailing_address")
    private String mailingAddress;

    public Persons() {
    }

    public Persons(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public String getReligions() {
        return religions;
    }

    public void setReligions(String religions) {
        this.religions = religions;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmployement() {
        return employement;
    }

    public void setEmployement(String employement) {
        this.employement = employement;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
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
        if (!(object instanceof Persons)) {
            return false;
        }
        Persons other = (Persons) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "censusrecordanalysis.model.Persons[ id=" + id + " ]";
    }
    
}
