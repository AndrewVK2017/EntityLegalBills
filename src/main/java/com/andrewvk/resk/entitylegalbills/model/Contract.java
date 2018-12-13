package com.andrewvk.resk.entitylegalbills.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "par_id", nullable = false, columnDefinition = "int default 0")
    @NotNull
    private Integer parId;

    @Column(name = "pay_id", nullable = false, columnDefinition = "int default 0")
    @NotNull
    private Integer payId;

    @Column(name = "dog_id", nullable = false)
    @NotNull
    private Integer dogId;

    @Column(name = "dog_num_s", nullable = false)
    @NotBlank
    @Size(min = 1)
    private String dogNumS;

    @Column(name = "dog_num", nullable = false)
    @NotNull
    private Integer dogNum;

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 3)
    private String name;

    @Column(name = "reg_date", nullable = false)
    @NotNull
    private LocalDate regDate;

    @Column(name = "dog_type", nullable = false, columnDefinition = "int default 0")
    @NotNull
    private Integer dogType;

    @Column(name = "id_group", nullable = false, columnDefinition = "int default 0")
    @NotNull
    private Integer idGroup;

    @Column(name = "id_department", nullable = false, columnDefinition = "int default 401")
    @NotNull
    private Integer idDepartment;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contract")
    private Set<FinParams> finParams;

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

    public Integer getDogType() {
        return dogType;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public Set<FinParams> getFinParams() {
        return finParams;
    }

    public void setFinParams(Set<FinParams> finParams) {
        this.finParams = finParams;
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
                ", regDate=" + regDate +
                ", dogType=" + dogType +
                ", idGroup=" + idGroup +
                ", idDepartment=" + idDepartment +
                '}';
    }
}
