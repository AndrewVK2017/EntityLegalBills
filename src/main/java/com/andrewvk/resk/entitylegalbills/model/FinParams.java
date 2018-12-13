package com.andrewvk.resk.entitylegalbills.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "fin_params")
public class FinParams {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "dog_id", nullable = false, columnDefinition = "int default 0")
    @NotNull
    private Integer dogId;

    @Column(name = "contract_id",  nullable = false, columnDefinition = "int default 0" )
    private Integer contractId;

    @Column (name = "balance", nullable = false)
    @NotNull
    private BigDecimal balance;

    @Column (name = "po_volume", nullable = false, columnDefinition = "int default 0")
    @NotNull
    private Integer poVolume;

    @Column (name = "po_money", nullable = false)
    @NotNull
    private BigDecimal poMoney;

    @Column(name = "op_date", nullable = false)
    @NotNull
    private LocalDate opDate;

    @ManyToOne
    @JoinColumn(name = "dog_id", referencedColumnName = "dog_id")
    private Contract contract;

    public FinParams() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDogId() {
        return dogId;
    }

    public void setDogId(Integer dogId) {
        this.dogId = dogId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getPoVolume() {
        return poVolume;
    }

    public void setPoVolume(Integer poVolume) {
        this.poVolume = poVolume;
    }

    public BigDecimal getPoMoney() {
        return poMoney;
    }

    public void setPoMoney(BigDecimal poMoney) {
        this.poMoney = poMoney;
    }

    public LocalDate getOpDate() {
        return opDate;
    }

    public void setOpDate(LocalDate opDate) {
        this.opDate = opDate;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "FinParams{" +
                "id=" + id +
                ", dogId=" + dogId +
                ", contractId=" + contractId +
                ", balance=" + balance +
                ", poVolume=" + poVolume +
                ", poMoney=" + poMoney +
                ", opDate=" + opDate +
                ", contract=" + contract +
                '}';
    }
}
