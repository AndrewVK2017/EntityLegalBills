package com.andrewvk.resk.entitylegalbills.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "contract")
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "par_id")
    private Integer parId;

    @Column(name = "pay_id")
    private Integer payId;

    @Column(name = "dog_id")
    private Integer dogId;

    @Column(name = "dog_num_s")
    private String dogNumS;

    @Column(name = "dog_num")
    private Integer dogNum;

    @Column(name = "name")
    private String name;

    @Column(name = "reg_date")
    private LocalDate date;

    @Column(name = "dog_type")
    private Integer dogType;

    @Column(name = "id_group")
    private Integer idGroup;

    @Column(name = "id_department")
    private Integer idDepartment;

    public Contract() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setParId(Integer parId) {
        this.parId = parId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public void setDogId(Integer dogId) {
        this.dogId = dogId;
    }

    public void setDogNumS(String dogNumS) {
        this.dogNumS = dogNumS;
    }

    public void setDogNum(Integer dogNum) {
        this.dogNum = dogNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDogType(Integer dogType) {
        this.dogType = dogType;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Integer getId() {
        return id;
    }

    public Integer getParId() {
        return parId;
    }

    public Integer getPayId() {
        return payId;
    }

    public Integer getDogId() {
        return dogId;
    }

    public String getDogNumS() {
        return dogNumS;
    }

    public Integer getDogNum() {
        return dogNum;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getDogType() {
        return dogType;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", parId=" + parId +
                ", payId=" + payId +
                ", dogId=" + dogId +
                ", dogNumS='" + dogNumS + '\'' +
                ", dogNum=" + dogNum +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", dogType=" + dogType +
                ", idGroup=" + idGroup +
                ", idDepartment=" + idDepartment +
                '}';
    }
}
